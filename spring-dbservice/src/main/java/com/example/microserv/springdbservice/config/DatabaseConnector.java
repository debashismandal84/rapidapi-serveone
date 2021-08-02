package com.example.microserv.springdbservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Date;

@Configuration

public class DatabaseConnector {
    @Bean(name = "mySqlTemplate")
     JdbcTemplate mySqlTemplate(@Qualifier("db1") DataSource ds){
        return new JdbcTemplate(ds);
    }

    @Autowired
    private JdbcTemplate myJdbcTemplate;

    @Bean(name = "db1")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    public Date getTimestamp(){
        Date dt = myJdbcTemplate.queryForObject("select now()",Date.class);
        System.out.println("current date:"+dt);
        return dt;
    }
}
