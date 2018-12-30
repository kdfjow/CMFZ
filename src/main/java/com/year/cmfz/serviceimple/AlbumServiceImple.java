package com.year.cmfz.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.year.cmfz.aspect.LogAnnotation;
import com.year.cmfz.dao.AlbumDao;
import com.year.cmfz.entity.Album;
import com.year.cmfz.entity.Chapter;
import com.year.cmfz.service.AlbumService;
@Service
@Transactional
public class AlbumServiceImple implements AlbumService {
    @Autowired
    private AlbumDao albumDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Album showAlbumById(int id) {
        Album album = albumDao.queryByAlbumId(id);
        return album;
    }
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public Chapter downloadChapter(String id) {
        Chapter chapter = albumDao.queryByChapterId(id);
        return chapter;
    }
    @Override
    @LogAnnotation(name = "添加专辑")
    public void newAlbum(Album album) {
        albumDao.addAlbum(album);
    }
    @Override
    @LogAnnotation(name="增加章节")
    public void newChapter(int id, Chapter chapter) {
        albumDao.addChapter(id,chapter);
    }
    @Override
    @LogAnnotation(name="修改数据")
    public void changeStatus(int id, boolean status) {
        albumDao.updateAlbum(id,status);
    }

    @Override
    public Integer countAll() {
        Integer count = albumDao.count();
        return count;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Album> queryByPage(int page, int rows) {
        int start =(page-1)*rows;
        List<Album> albums  = albumDao.queryByPage(start, rows);
        return albums;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Album> queryAll() {
        List<Album> albums = albumDao.queryAll();
        return albums;
    }

}
