/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.model;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author BARATH.R.V
 */
@Getter @Setter
public class Count extends EmpCompetency implements Serializable{
    private Integer cmptncyCount;
}
