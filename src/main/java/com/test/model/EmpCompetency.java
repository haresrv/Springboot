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
 * @author Admin
 */
@Getter @Setter
public class EmpCompetency  implements Serializable {
    private String cmptncyCode;
    private String cmptncyLevel;
}
