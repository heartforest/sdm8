package com.forest.sdm8.service;

import com.forest.sdm8.entity.ccore.TabServer;
import com.forest.sdm8.mapper.ccore.TabServerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName TabServerService
 * Description TODO
 * Author hforest
 * Date 2019/1/3 22:53
 * Version 1.0
 **/
@Service
public class TabServerService {

    @Resource
    private TabServerMapper tabServerMapper;

    public TabServer find(String id) {
        return tabServerMapper.find(id);
    }

    public List<TabServer> findAll() {
        return tabServerMapper.findAll();
    }

}
