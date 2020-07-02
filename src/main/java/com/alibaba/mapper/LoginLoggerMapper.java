package com.alibaba.mapper;

import com.alibaba.bean.LoginLogger;
import com.alibaba.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * mapper的具体表达式
 */
@Mapper //标记mapper文件位置，否则在Application.class启动类上配置mapper包扫描
@Repository
public interface LoginLoggerMapper {

    /**
     * 注册  插入一条user记录
     * @param user
     * @return
     */
    @Insert("insert into login_logger values(#{id},#{username},#{loginDate})")
    //加入该注解可以保存对象后，查看对象插入id
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void loginLogger(LoginLogger loginLogger );




}
