package com.forest.sdm8.datasource;

import java.lang.annotation.*;

/**
 * 在方法上使用，用于指定使用哪个数据源
 * InterfaceName TargetDataSource
 * Description TODO
 * Author hforest
 * Date 2019/1/2 21:04
 * Version 1.0
 **/
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    String name();

}