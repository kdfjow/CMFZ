package com.year.cmfz.service;

import com.year.cmfz.entity.Log;

import java.util.List;

public interface LogService {
    /**
     * @param page 页码
     * @param rows 每页展示的数量
     * @return 根据分页展示日志的信息
     */
    public List<Log> showPage(int page,int rows);
    public Log showId(String id);
    public void put(Log log);
}
