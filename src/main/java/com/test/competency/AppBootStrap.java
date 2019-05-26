/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.competency;

import lombok.extern.log4j.Log4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author Administrator
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.test.ws,com.test.competency"} )
@EnableScheduling
@EnableAsync
@Log4j
public class AppBootStrap {
    public static void main( String[] args )
    {
        SpringApplication app = new SpringApplication(AppBootStrap.class);
        app.run(args);
    }  
}
