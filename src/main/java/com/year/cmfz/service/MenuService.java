package com.year.cmfz.service;

import com.year.cmfz.entity.MenuItem;

import java.util.List;

public interface MenuService {
    /**
     * @return 查询所有的菜单
     */
    public List<MenuItem> showAll();
}
