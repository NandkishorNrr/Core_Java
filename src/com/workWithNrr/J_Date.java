package com.workWithNrr;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class J_Date {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern(("HH:mm:ss"));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");

        String formattedDate = dateFormatter.format(localDate);
        String formattedTime = timeFormatter.format(localTime);
        String formattedDateTime = dateTimeFormatter.format(localDateTime);

        System.out.println(formattedDate);
        System.out.println(formattedTime);
        System.out.println(formattedDateTime);
    }
}
