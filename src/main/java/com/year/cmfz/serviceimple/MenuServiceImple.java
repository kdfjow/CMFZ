package com.year.cmfz.serviceimple;

import com.year.cmfz.dao.MenuItemDao;
import com.year.cmfz.entity.MenuItem;
import com.year.cmfz.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class MenuServiceImple implements MenuService {
    private Logger loger= LoggerFactory.getLogger(MenuServiceImple.class);
    @Autowired
    private MenuItemDao menuItemDao;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<MenuItem> showAll() {
        List<MenuItem> menuItems = menuItemDao.queryAll();
        loger.debug("拿到的信息是:"+menuItems);
        return menuItems;
    }
}
