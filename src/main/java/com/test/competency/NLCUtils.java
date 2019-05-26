/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.competency;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import javax.annotation.PostConstruct;
import lombok.extern.log4j.Log4j;
/**
 *
 * @author Administrator
 */
@Log4j
public class NLCUtils {
  //  private static final log log = log.getlog(NLCUtils.class);

    public NLCUtils() {

    }

    @PostConstruct
    public void init() {

    }
    
    public static java.sql.Date getSQLDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }

    public static java.util.Date getUtilDate(LocalDate localDate) {
        return java.sql.Date.valueOf(localDate);
    }
    
    public static LocalDate getLocalDate(java.sql.Date date) {
        return date.toLocalDate();
    }
    
    public static LocalDate getLocalDate(java.util.Date date) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).toLocalDate();
    }    
    
    public static Date getDate(String date, String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(date);
    }
    
    public static String getDateAsText(LocalDate date, String pattern) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }    
    
    public static Date getToday(String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(sdf.format(new Date()));
    }    
    
    public static Date getTomorrow(String pattern) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.parse(sdf.format(new Date()));
    }    
    
    public void test_add_to_date() {
        LocalDate today = LocalDate.now();
        LocalDate oneMonthFromNow = today.plusDays(30);
        LocalDate nextMonth = today.plusMonths(1);
        LocalDate future = today.plus(4, ChronoUnit.WEEKS);
    }    
}
