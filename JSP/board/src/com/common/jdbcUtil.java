package com.common;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class jdbcUtil {// all or nothing(commit/rollback), 데이터접속을 컨트롤하기 위해서

    public static Connection getConnection() {
        Connection conn = null;

        try {//연결하는 과정을 코드로 작성.
            //Context 객체 초기화
            Context initCtx = new InitialContext(); //Context : 설정파일을 컨트롤 할 수 있는 객체.

            //context.xml 로드
            Context envCtx = (Context) initCtx.lookup("java:comp/env");//자바를 접속하는 정보를 찿아서 갖고옴.키와 벨류로 context.xml 파일 내용 다 받아옴

            //context.xml 정보에서 name이 "jdbc/MariaDB"인 resource 로드
            DataSource ds = (DataSource) envCtx.lookup("jdbc/MariaDB");

            //resource 정보에서 로드한 접속 정보를 사용하여 connection 객체 얻어옴.
            conn = ds.getConnection();//resource로부터 getConnection해옴.

            //실패해도 다 저장되기 때문에 수동으로 commit되도록 작성 할 것임.
            //auto commit off
            conn.setAutoCommit(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    // connection 객체 close(리소스 반환 = 접속 바가지 돌려줌, 우물의 사용권을 다시 반환.)
    // 계속 메모리를 할당해서 남아있으면 더 이상 실행(접속)안되서
    public static void close(Connection conn) {
        if (conn != null) {//null이면 연결 해지상태.
            try {
                conn.close();   //conn이 계속 연결되어 있으면 닫아줘라.
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    //PreparedStatement 객체 close(리소스 반환 = 바가지 쓰고 돌려줌)
    public static void close(PreparedStatement pstmt) {//PreparedStatement : 실제로 쿼리를 날려주는 작업
        if (pstmt != null) {//null이면 연결 해지상태.
            try {
                pstmt.close();   //conn이 계속 연결되어 있으면 닫아줘라.
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    //ResultSet 객체 close(리소스 반환 = 바가지 쓰고 돌려줌)
    public static void close(ResultSet rs) {//PreparedStatement : 두레박으로 푼 바가지의 물 들고만 있다가 돌려줌.
        if (rs != null) {//null이면 연결 해지상태.
            try {
                rs.close();   //conn이 계속 연결되어 있으면 닫아줘라.
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    //insert, update, delete 한 데이터를 실제 저장(commit)
    public static void commit(Connection conn) {
        if (conn != null) {
            try {
                conn.commit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //insert, update, delete 프로시저 간 오류 및 예외 발생 시 이전으로 롤백
    public static void rollback(Connection conn) {
        if (conn != null) {
            try {
                conn.rollback();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
