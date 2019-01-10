package com.forest.sdm8.service;

import com.forest.sdm8.datasource.TargetDataSource;
import com.forest.sdm8.entity.fcore.TabInfo;
import com.forest.sdm8.entity.fexploit.TabAssessMain;
import com.forest.sdm8.mapper.fcore.TabInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * ClassName MulDataSrcService
 * Description TODO
 * Author hforest
 * Date 2019/1/1 22:06
 * Version 1.0
 **/
@Service
public class MulDataSrcService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // MyBatis的Mapper方法定义接口
    @Resource
    private TabInfoMapper tabInfoMapper;
//
//    @TargetDataSource(name="fcore")
//    public TabInfo likeName(String id){
//        return tabInfoMapper.find(id);
//    }
//
    public List<TabInfo> likeNameByDefaultDataSource(){
        return tabInfoMapper.findAll();
    }

    /**
     * 不指定数据源使用默认数据源
     *
     * @return
     * @author SHANHY
     * @create  2016年1月24日
     */
    public List<TabInfo> getList(){
        String sql = "SELECT ID, INFO_TYPE, INFO_BODY, INFO_SRC, INFO_TAG FROM TAB_INFO";
        return (List<TabInfo>) jdbcTemplate.query(sql, new RowMapper<TabInfo>(){

            @Override
            public TabInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
                TabInfo stu = new TabInfo();
                stu.setId(rs.getString("ID"));
                stu.setInfoType(rs.getString("INFO_TYPE"));
                stu.setInfoBody(rs.getString("INFO_BODY"));
                stu.setInfoSrc(rs.getString("INFO_SRC"));
                stu.setInfoTag(rs.getString("INFO_TAG"));
                return stu;
            }

        });
    }

    /**
     * 指定数据源
     *
     * @return
     * @author SHANHY
     * @create  2016年1月24日
     */
    @TargetDataSource(name="fexploit")
    public List<TabAssessMain> getListByDs1(){
        String sql = "SELECT ID, TITLE, ABS_UP, ABS_DOWN FROM TAB_ASSESS_MAIN";
        return (List<TabAssessMain>) jdbcTemplate.query(sql, new RowMapper<TabAssessMain>(){

            @Override
            public TabAssessMain mapRow(ResultSet rs, int rowNum) throws SQLException {
                TabAssessMain stu = new TabAssessMain();
                stu.setId(rs.getDouble("ID"));
                stu.setTitle(rs.getString("TITLE"));
                stu.setAbsUp(rs.getString("ABS_UP"));
                stu.setAbsDown(rs.getString("ABS_DOWN"));
                return stu;
            }

        });
    }

//    /**
//     * 指定数据源
//     *
//     * @return
//     * @author SHANHY
//     * @create  2016年1月24日
//     */
//    @TargetDataSource(name="ccore")
//    public List<TabServer> getListByDs2(){
//        String sql = "SELECT ID, SERVER_NAME, SERVER_CLASSPATH, SERVER_ADRESS FROM TAB_SERVER";
//        return (List<TabServer>) jdbcTemplate.query(sql, new RowMapper<TabServer>(){
//
//            @Override
//            public TabServer mapRow(ResultSet rs, int rowNum) throws SQLException {
//                TabServer stu = new TabServer();
//                stu.setId(rs.getDouble("ID"));
//                stu.setServerName(rs.getString("SERVER_NAME"));
//                stu.setServerClasspath(rs.getString("SERVER_CLASSPATH"));
//                stu.setServerAdress(rs.getString("SERVER_ADRESS"));
//                return stu;
//            }
//
//        });
//    }

}
