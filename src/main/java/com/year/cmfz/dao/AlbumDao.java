package com.year.cmfz.dao;

import com.year.cmfz.entity.Album;
import com.year.cmfz.entity.Chapter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AlbumDao {
    /**
     * @return 查询所有的专辑以及信息
     */
    public List<Album> queryAll();

    /**
     * @param id 专辑的id
     * @return 查询专辑的信息
     */
    public Album queryByAlbumId(@Param("id") int id);

    /**
     * @param album 需要添加的专辑的信息
     *              向数据库中插入专辑的信息
     */
    public void addAlbum(@Param("album") Album album);

    /**
     * @param id 专辑的id
     *           更改专辑的上线推荐状态
     */
    public void updateAlbum(@Param("id") int id,@Param("status")boolean status);
    /**
     * @param id 目标专辑的id
     * @param chapter 需要添加的章节的信息
     */
    public void addChapter(@Param("id") int id, @Param("chapter") Chapter chapter);

    /**
     * @param id 章节的id
     * @return 返回需要下载的章节的信息
     */
    public Chapter queryByChapterId(@Param("id") String id);

    /**
     * @param start 开始下标
     * @param limit 每页展示的数量
     * @return 根据分页信息查询到的结果
     */
    public List<Album> queryByPage(@Param("start") int start,@Param("limit") int limit);

    /**

     * @return 统计数量
     */
    public int count();
}
