package com.forest.sdm8.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源
 *
 * ClassName DynamicDataSource
 * Description TODO
 * Author hforest
 * Date 2018/12/30 22:47
 * Version 1.0
 **/
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DynamicDataSourceContextHolder.getDataSourceType();
    }
}
