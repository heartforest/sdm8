package com.forest.sdm8.service;

import com.forest.sdm8.entity.fcore.TabInfo;
import com.forest.sdm8.mapper.fcore.TabInfoDao;
import com.forest.sdm8.mapper.fcore.TabInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName TabInfoService
 * Description TODO
 * Author hforest
 * Date 2018/12/27 23:35
 * Version 1.0
 **/
@Service
public class TabInfoService {

    @Resource
    private TabInfoDao tabInfoDao;
    @Resource
    private TabInfoMapper tabInfoMapper;

    /**
     * 根据名字查找用户
     */
    public List<TabInfo> findInfoType(String infoType) {
        return tabInfoDao.findInfoType(infoType);
    }

    public List<TabInfo> findAll() {
        return tabInfoMapper.findAll();
    }

}
