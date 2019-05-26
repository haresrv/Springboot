/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.competency;


//import org.apache.tomcat.jdbc.pool.DataSource;
import javax.sql.DataSource;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/*
Annotating a class with the @Configuration annotation indicates that 
the class will be used by JavaConfig as a source of bean definitions. 
An application may make use of just one @Configuration-annotated class, or many. 
*/

@Configuration
@Log4j
public class SpringBeanBuilder {
    @Autowired
    Environment env;
    /*********************************************************/
    @Bean(name="cmptncyDataSource")
    @ConfigurationProperties(prefix="spring.datasource.cmptncy")   
    @Primary
    public DataSource cmptncyDataSource() {
        return DataSourceBuilder.create().build();
    }
    
    @Bean(name="cmptncyJDBCTemplate")
    public JdbcTemplate cmptncyJdbcTemplate(@Qualifier("cmptncyDataSource") DataSource ds) {
        return new JdbcTemplate(ds);
    }     
    
    @Bean(name="cmptncyJDBCTransactionManager")
    public DataSourceTransactionManager cmptncyJdbcTransactionManager(@Qualifier("cmptncyDataSource") DataSource ds) {
        return new DataSourceTransactionManager(ds);
    }     
}
