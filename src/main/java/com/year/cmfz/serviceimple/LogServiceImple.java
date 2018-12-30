package com.year.cmfz.serviceimple;

import com.year.cmfz.dao.LogDao;
import com.year.cmfz.entity.Log;
import com.year.cmfz.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class LogServiceImple implements LogService {
    @Autowired
    private LogDao logDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Log> showPage(int page, int rows) {
        int start = (page-1)*rows;
        List<Log> logs = logDao.queryByPage(start, rows);
        return logs;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Log showId(String id) {
        Log log = logDao.selectByPrimaryKey(id);
        return log;
    }

    @Override
    public void put(Log log) {
        logDao.insert(log);
    }
}
