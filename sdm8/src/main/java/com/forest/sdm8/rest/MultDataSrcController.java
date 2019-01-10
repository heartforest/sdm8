package com.forest.sdm8.rest;

import com.forest.sdm8.entity.ccore.TabServer;
import com.forest.sdm8.entity.fcore.TabInfo;
import com.forest.sdm8.entity.fexploit.TabAssessMain;
import com.forest.sdm8.service.MulDataSrcService;
import com.forest.sdm8.service.TabAssessMainService;
import com.forest.sdm8.service.TabInfoService;
import com.forest.sdm8.service.TabServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName SingeDataSrcController
 * Description TODO
 * Author hforest
 * Date 2019/1/3 22:51
 * Version 1.0
 **/
//@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
@RequestMapping("/mult")
public class MultDataSrcController {

    @Autowired
    Environment environment;

    @Autowired
    private TabInfoService tabInfoService;

    @Autowired
    private TabServerService tabServerService;

    @Autowired
    private TabAssessMainService tabAssessMainService;

    @Autowired
    private MulDataSrcService mulDataSrcService;

    @RequestMapping("/tabinfo/all")
    public List<TabInfo> findAll() {
        return tabInfoService.findAll();
    }

    @RequestMapping("/tabserver/all")
    public List<TabServer> findAll1() {
        return tabServerService.findAll();
    }

    @RequestMapping("/tabassessmain/all")
    public List<TabAssessMain> findAll2() {
        return tabAssessMainService.findAll();
    }

    @RequestMapping("/likeNameByDefaultDataSource")
    public List<TabInfo> findMult1() {
        return mulDataSrcService.likeNameByDefaultDataSource();
    }

    @RequestMapping("/list/get")
    public List<TabInfo> findMult2() {
        return mulDataSrcService.getList();
    }

    @RequestMapping("/list/fexploit")
    public List<TabAssessMain> findMult3() {
        return mulDataSrcService.getListByDs1();
    }

    @RequestMapping(value = "/environment", method = RequestMethod.GET)
    public Object environment() {
        //输出environment 类型
        System.out.println(environment.getClass());
        System.out.println(environment.getActiveProfiles());
        System.out.println(environment.toString());
        String[] activeProfiles = environment.getActiveProfiles();
        for(String ap: activeProfiles) {
            Object o = environment.getProperty(ap);
            System.out.println(o);
        }
        return environment.toString();
    }

}
