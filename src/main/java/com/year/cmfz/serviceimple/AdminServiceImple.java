package com.year.cmfz.serviceimple;

import com.year.cmfz.dao.AdminDao;
import com.year.cmfz.entity.Admin;
import com.year.cmfz.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class AdminServiceImple implements AdminService{
    @Autowired
    private AdminDao adminDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Admin login(String username, String password) {
        Admin admin = adminDao.queryByUsernameAndPwd(username, password);
        return admin;
    }
}
