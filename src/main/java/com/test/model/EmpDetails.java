/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.test.model;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/** @author Admin */
@Getter @Setter
public class EmpDetails implements Serializable {
    private String empName;
    private Integer empCode;
    
    private String sbu;
    private LocalDate relievedDate;
    private String posTitle;
    private LocalDate joinDate;
    private String  jobRole;
    private String  jobGrade;
    private String  jobFamily;
    private Float resiExp;    
    private Float factExp;
    private Float commExp;
    private String  currLocation;
}
