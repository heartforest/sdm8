package com.forest.sdm8.mapper.fcore;

import com.forest.sdm8.entity.fcore.TabInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName TabInfoMapper
 * Description TODO
 * Author hforest
 * Date 2019/1/1 22:12
 * Version 1.0
 **/
@Mapper
public interface TabInfoMapper {

    /**
     * @Author hforest
     * @Description //TODO 
     * @Date  22:13
     * @Param [id]
     * @return com.forest.sdm8.entity.fcore.TabInfo
     **/
    @Select("SELECT * FROM tab_info WHERE id = #{id}")
    TabInfo find(@Param("id") String id);

    @Select("SELECT * FROM tab_info")
    List<TabInfo> findAll();
}
