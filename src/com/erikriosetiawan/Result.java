package com.erikriosetiawan;

import java.time.LocalDate;

public class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().toString();
    }
}
