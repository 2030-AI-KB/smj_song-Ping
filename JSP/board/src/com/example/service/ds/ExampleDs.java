package com.example.service.ds;

import com.AppDao;
import com.common.jdbcUtil;

import java.sql.Connection;

import static com.common.jdbcUtil.*;

public class ExampleDs {
    private Connection conn;

    private AppDao setDao() {//실제로 연결하는 곳
        AppDao dao = AppDao.getInstance();
        this.conn = jdbcUtil.getConnection();
        dao.setConnection(this.conn);
        return dao;
    }

    public void insertName(String name) {
        AppDao dao = setDao();
        boolean isSuccess = dao.insertName(name);
        if (isSuccess) {
            commit(this.conn);
        } else {
            rollback(this.conn);
        }
        close(conn);
    }

    public String selectNameById(int id) {
        AppDao dao = setDao();//dao 가져와서 실제로 db연결
        String name = dao.selectNameById(id);
        close(conn);
        return name;
    }


}
