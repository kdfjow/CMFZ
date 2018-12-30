package com.year.cmfz.dao;

import com.year.cmfz.entity.MenuItem;

import java.util.List;

public interface MenuItemDao {
    /**
     * @return 查询所有的一级菜单选项
     */
    public List<MenuItem> queryAll();
}
