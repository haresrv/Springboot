/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ws;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.model.Competency;
import java.util.List;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
@RestController
@Log4j
public class CompetencyServices {
    
    @Autowired 
    @Qualifier("cmptncyJDBCTemplate") 
    protected JdbcTemplate cmptncyJdbcTemplate;     
    
    @RequestMapping("/fetchCompetencies")
    public String fetchCompetencies()  {
        try {
            String sql = "select * from CMPTNCY_MAS";
            //Object[] queryParams = new Object[]{};
            List<Competency> cmptncyList =  this.cmptncyJdbcTemplate.query(sql, new BeanPropertyRowMapper(Competency.class));
            return new ObjectMapper().writeValueAsString(cmptncyList);
        } catch (Exception e) {            
            log.error(e.getMessage());
            return "{}";
        }
    }
    
}
