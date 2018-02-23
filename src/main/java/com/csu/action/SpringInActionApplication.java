package com.csu.action;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author sharp
 * @date 2018-2-23 23:28:43
 * 应用启动器
 */
@SpringBootApplication
@MapperScan("com.csu.jx.mapper")
public class SpringInActionApplication extends SpringBootServletInitializer {
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringInActionApplication.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(SpringInActionApplication.class, args);
        System.out.println("sharp : 启动成功");
    }
}
