package com.ali;

import com.ali.config.ServerConfig;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@EnableConfigurationProperties
@SpringBootApplication
public class Springboot13ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "datasource")
    public DruidDataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        return ds;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Springboot13ConfigurationApplication.class, args);
        ServerConfig bean = ctx.getBean(ServerConfig.class);
        System.out.println(bean);
//        DruidDataSource ds = ctx.getBean(DruidDataSource.class);
//        System.out.println(ds.getDriverClassName());
    }


}
