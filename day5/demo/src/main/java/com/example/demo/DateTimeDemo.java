package com.example.demo;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println( sdf.format(date));
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(localDateTime);
    }
}