package com.member.ds;

import com.AppDao;
import com.common.jdbcUtil;
import com.dto.MemberDTO;

import java.sql.Connection;

import static com.common.jdbcUtil.*;

public class MemberDs {
    private Connection conn;

    private AppDao setDao() {//실제로 연결하는 곳
        AppDao dao = AppDao.getInstance();
        this.conn = jdbcUtil.getConnection();
        dao.setConnection(this.conn);
        return dao;
    }

    public int selectAccountCountByLoginId(String LoginId){
        AppDao dao = setDao();
        int count = dao.selectAccoontByLoginId(LoginId);
        close(conn);
        return count;
    }

    public boolean insertMemberInfo(MemberDTO dto) {
        AppDao dao = setDao();
        boolean isSuccess = dao.insertMemberInfo(dto);
        if (isSuccess) {
            commit(this.conn);
        } else {
            rollback(this.conn);
        }
        close(conn);

        return isSuccess;
    }

    public MemberDTO selectMemberInfoByLoginId(String LoginId){
        AppDao dao = setDao();
        MemberDTO dto = dao.selectMemberInfoByLoginId(LoginId);
        close(conn);
        return dto;
    }

    public MemberDTO selectMemberInfoById(int id){
        AppDao dao = setDao();
        MemberDTO dto = dao.selectMemberInfoById(id);
        close(conn);
        return dto;
    }


}
