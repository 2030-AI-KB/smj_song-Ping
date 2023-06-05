package com;

import com.dto.MemberDTO;

import java.sql.*;
import java.time.LocalDate;

import static com.common.jdbcUtil.close;

public class AppDao {
    private Connection conn;

    //싱글톤 기법
    private AppDao() {//생성자도 메소드의 일종

    }

    private static class LazyHolder { //LazyHolder 사용자 패턴에 맞춰서
        private static final AppDao INSTANCE = new AppDao();
    }//synchronized 나오는건 쓰지말기. 옛날 쓰레드하고 할때 쓰던것.

    public static AppDao getInstance() {//get DAO 하는작업
        return LazyHolder.INSTANCE;
    }

    public void setConnection(Connection conn) {
        this.conn = conn;
    }

    public boolean insertName(String name) {
        PreparedStatement pstmt = null; //PreparedStatement : 실제로 쿼리 날리는 객체
        int count = 0;

        try {
            pstmt = conn.prepareStatement("INSERT INTO my_name(name) VALUES (?)");
            pstmt.setString(1, name);//버퍼에 담아져있음.
            count = pstmt.executeUpdate();//commit행위, executeUpdate: insert,delete,update 할 로우의 갯수 리턴 해줌
        } catch (Exception e) {
            e.printStackTrace();
        } finally {//결국엔 실행될 코드. 트라이가 정상적으로 실행되도 실행되고, catch로 가도 무조건 실행됨. 늘실행되는 구문
            close(pstmt);
        }
        // 0이라면 false가 됨.
        return count > 0 ? true : false;//카운트가 0보다 크면 true 아니라면 false;
    }

    public String selectNameById(int id) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;    //null을 쓰는 이유는 트라이/캐치 구문에 넣기위해
        String name = null;

        try {
            pstmt = conn.prepareStatement("SELECT name FROM my_name WHERE id=?");//select 할때 무조건 컬럼명 명시해주는게 코딩하기 좋음.
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();//executeQuery는 select할때, 나머지는 executeUpdate를 쓴다.

            while (rs.next()) {//rs의 첫위치부터 다음데이터(뽑아낼 데이터)가 잇느냐. 있으면 true, 없으면 false 를 해줌과
                // 동시에 다음데이터 덩어리 위치로 옮겨감
                name = rs.getString("name");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {  // 트라이/캐치구문에 파이날이 붙어잇으면 위에가 오류가 나도 finally 구문은 실행이 된다.
            close(rs);
            close(pstmt);
        }
        return name;
    }

    public int selectAccoontByLoginId(String loginId) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;    //null을 쓰는 이유는 트라이/캐치 구문에 넣기위해
        int count = 0;

        try {
            pstmt = conn.prepareStatement(
                    "SELECT count(*) FROM member WHERE login_id=? AND leaved=false");//select 할때 무조건 컬럼명 명시해주는게 코딩하기 좋음.
            pstmt.setString(1, loginId);
            rs = pstmt.executeQuery();//executeQuery는 select할때, 나머지는 executeUpdate를 쓴다.

            while (rs.next()) {//rs의 첫위치부터 다음데이터(뽑아낼 데이터)가 잇느냐. 있으면 true, 없으면 false 를 해줌과
                // 동시에 다음데이터 덩어리 위치로 옮겨감
                count = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {  // 트라이/캐치구문에 파이날이 붙어잇으면 위에가 오류가 나도 finally 구문은 실행이 된다.
            close(rs);
            close(pstmt);
        }
        return count;
    }


    public boolean insertMemberInfo(MemberDTO dto) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        int count1 = 0;
        int count2 = 0;

        try {
            pstmt = conn.prepareStatement(
                    "INSERT INTO member_detail(name, mobile_no, birthday, email, zipcode, address, address_detail)" +
                            " VALUES (?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, dto.getName());
            pstmt.setString(2, dto.getMobileNo());
            pstmt.setObject(3, dto.getBirthday());
            pstmt.setString(4, dto.getEmail());
            pstmt.setString(5, dto.getZipcode());
            pstmt.setString(6, dto.getAddress());
            pstmt.setString(7, dto.getAddressDetail());
            count1 = pstmt.executeUpdate();
            if (count1 == 0) {
                close(rs);
                close(pstmt);
                return false;
            }
            rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                dto.setMemberDetailId(rs.getInt(1));
            }

            pstmt = conn.prepareStatement("INSERT INTO member(login_id, password, member_detail_id) VALUES (?,?,?)");
            pstmt.setString(1, dto.getLoginId());
            pstmt.setString(2, dto.getPassword());
            pstmt.setInt(3, dto.getMemberDetailId());
            count2 = pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return count2 > 0 ? true : false;
    }

    public MemberDTO selectMemberInfoByLoginId(String loginId) {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        MemberDTO dto = null;
        try {
            pstmt = conn.prepareStatement(
                    "SELECT " +
                            "a.id"+
                            ",a.login_id"+
                            ",a.password"+
                            ",b.name"+
                            ",b.birthday"+
                            ",b.mobile_no"+
                            ",b.email"+
                            ",b.zipcode"+
                            ",b.address"+
                            ",b.address_detail"+
                            " from member a"+
                            " inner join member_detail b on a.member_detail_id=b.id"+
                            " where login_id=? and leaved=false");

            pstmt.setString(1, loginId);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                dto = MemberDTO.builder()
                        .id(rs.getInt("id"))
                        .password(rs.getString("password"))
                        .name(rs.getString("name"))
//                        .birthday((LocalDate) rs.getObject("birthday"))
                        .mobileNo(rs.getString("mobile_no"))
                        .email(rs.getString("email"))
                        .zipcode(rs.getString("zipcode"))
                        .address(rs.getString("address"))
                        .addressDetail(rs.getString("address_detail"))
                        .build();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rs);
            close(pstmt);
        }
        return dto;
    }
}
