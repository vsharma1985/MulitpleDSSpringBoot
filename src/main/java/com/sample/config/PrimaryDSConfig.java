package com.sample.config;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(
	  basePackages="com.sample.repo.prime",
	  entityManagerFactoryRef = "primeManagerFactory"
      )
public class PrimaryDSConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource primaryDataSource() {
	    return DataSourceBuilder.create().build();
	}
	
	@Bean(name="primeManagerFactory")
	@Primary
	public LocalContainerEntityManagerFactoryBean primeManagerFactory(
	        EntityManagerFactoryBuilder builder){       
	    return builder.dataSource(primaryDataSource())                
	            .packages("com.sample.domain")
	            .build();
	}   
}
