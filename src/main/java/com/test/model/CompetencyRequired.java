/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.test.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/** @author Admin */
@Getter @Setter
public class CompetencyRequired implements Serializable {
    private String jobFamily;
    private Competency competency;
    private String jobGrade;
    private String mandLevel;
    private String desiredLevel;
}
