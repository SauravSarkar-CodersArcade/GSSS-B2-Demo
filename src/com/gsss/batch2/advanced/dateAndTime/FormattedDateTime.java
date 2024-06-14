package com.gsss.batch2.advanced.dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattedDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("The unformatted date and time are: " +
                localDateTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                "D, MM dd yyyy"
        );
        /*
        E - Day of the week (Mon - Sun)
        D -> Day of the year (1 - 366)
        d -> Day of the month (1 - 31)
        MMM -> Name of the month (Jan - Dec)
        MM -> Month Number (1 - 12)
         */
        String formattedDT = localDateTime.format(formatter);
        System.out.println("Formatted Date & Time: " +
                formattedDT);
    }
}
