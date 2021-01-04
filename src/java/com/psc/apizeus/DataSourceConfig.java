/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.psc.apizeus;

import java.util.Properties;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author AVV
 */
@Configuration
@EnableWebMvc
@ComponentScans(value = { @ComponentScan("com.psc"),
    @ComponentScan("com.psc.Repository"),
          @ComponentScan("com.psc.Model"),  
          @ComponentScan("com.psc.Controler"),  
          @ComponentScan("com.psc.Dao"),  
          @ComponentScan("com.psc.apizeus"), 
           @ComponentScan("com.psc.Entity"),  
          @ComponentScan("com.psc.Service"),
          @ComponentScan("com.psc.Configuration.**"),
          @ComponentScan("com.psc.Configuration.WebSecurity")})  

@EnableTransactionManagement

//@EnableAutoConfiguration(exclude = { HibernateJpaAutoConfiguration.class})
@PropertySource(value = { "classpath:application.properties" })

	public class DataSourceConfig extends WebMvcConfigurerAdapter  {
  
      
	    @Bean
	    public LocalSessionFactoryBean sessionFactory() {
	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	        sessionFactory.setDataSource(dataSource());
	        sessionFactory.setPackagesToScan("com.psc.Entity" );
            Properties hibernateProperties = new Properties();  
            hibernateProperties.setProperty("hibernate.hbm2ddl.auto", "update");
	        hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
                hibernateProperties.setProperty("hibernate.show_sql", "true");
                 hibernateProperties.setProperty("hibernate.check_nullability","false");
	        sessionFactory.setHibernateProperties(hibernateProperties);
	 
	        return sessionFactory;
	    }
	 
	    @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/zeus_db");
	        dataSource.setUsername("atenea");
	        dataSource.setPassword("12qwaszx");
	 
	        return dataSource;
	    }
	 
	    @Bean
	    public PlatformTransactionManager hibernateTransactionManager() {
	        HibernateTransactionManager transactionManager
	          = new HibernateTransactionManager();
	        transactionManager.setSessionFactory(sessionFactory().getObject());
	        return transactionManager;
	    }
//             @Bean  
//        public HibernateTransactionManager transactionManager() {  
//                 HibernateTransactionManager txManager = new HibernateTransactionManager();  
//            txManager.setSessionFactory(sessionFactory().getObject()); 
//            txManager.setDataSource(dataSource());  
//            return txManager;  
//        }    
        
        	    
   
     @Bean
 public InternalResourceViewResolver getInternalResourceViewResolver(){
 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
 resolver.setPrefix("/WEB-INF/jsp/");
 resolver.setSuffix(".jsp");
 return resolver;
 }
 
 
       @Override
	public void addResourceHandlers(final ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/***").addResourceLocations("/resources/");
		registry.addResourceHandler("/img/**").addResourceLocations("/resources/vendor/img/");
	}
    
 
	}
