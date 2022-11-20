package com.arioc.jsf.Configuracion;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Configuracion {

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.url("jdbc:sqlserver://localhost;databaseName=infoPer;TrustServerCertificate=true");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("123456");
        return dataSourceBuilder.build();
    }
}
