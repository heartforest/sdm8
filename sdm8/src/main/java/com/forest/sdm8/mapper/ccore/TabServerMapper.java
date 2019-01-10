package com.forest.sdm8.mapper.ccore;

import com.forest.sdm8.entity.ccore.TabServer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * InterfaceName TabServerMapper
 * Description TODO
 * Author hforest
 * Date 2019/1/1 22:15
 * Version 1.0
 **/
@Mapper
public interface TabServerMapper {

    /**
     * @Author hforest
     * @Description //TODO
     * @Date  22:13
     * @Param [id]
     * @return com.forest.sdm8.entity.fcore.TabInfo
     **/
    @Select("SELECT * FROM tab_server WHERE id = #{id}")
    TabServer find(@Param("id") String id);

    @Select("SELECT * FROM tab_server")
    List<TabServer> findAll();

}
