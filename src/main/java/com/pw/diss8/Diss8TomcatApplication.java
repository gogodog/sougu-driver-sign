package com.pw.diss8;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@MapperScan("com.pw.diss8.mapper")
@Slf4j
public class Diss8TomcatApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的启动类
        return builder.sources(Diss8TomcatApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Diss8TomcatApplication.class, args);
    }

}
