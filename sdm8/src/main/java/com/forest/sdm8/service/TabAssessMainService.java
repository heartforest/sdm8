package com.forest.sdm8.service;

import com.forest.sdm8.entity.fexploit.TabAssessMain;
import com.forest.sdm8.mapper.fexploit.TabAssessMainMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName TabAssessMainService
 * Description TODO
 * Author hforest
 * Date 2019/1/3 22:53
 * Version 1.0
 **/
@Service
public class TabAssessMainService {

    @Resource
    private TabAssessMainMapper tabAssessMainMapper;

    public TabAssessMain find(String id) {
        return tabAssessMainMapper.find(id);
    }

    public List<TabAssessMain> findAll() {
        return tabAssessMainMapper.findAll();
    }

}
