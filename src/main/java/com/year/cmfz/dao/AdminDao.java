package com.year.cmfz.dao;

import com.year.cmfz.entity.Admin;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
    public Admin queryByUsernameAndPwd(@Param("username") String username, @Param("password") String password);
}
