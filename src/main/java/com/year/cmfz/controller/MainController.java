package com.year.cmfz.controller;

import com.year.cmfz.entity.MenuItem;
import com.year.cmfz.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/main")
public class MainController {
    @Autowired
    private MenuService menuService;
    @ResponseBody
    @RequestMapping("/menu.do")
    public List<MenuItem> menus(){
        List<MenuItem> menuItems = menuService.showAll();
        return menuItems;
    }
}
