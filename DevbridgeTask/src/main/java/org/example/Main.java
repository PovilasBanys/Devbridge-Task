package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        printBonusDatesBetween(2010, 2015);

    }

    public static void printBonusDatesBetween(int fromYear, int toYear){

        LocalDate date = LocalDate.of(fromYear, 1, 1);
        LocalDate endDate = LocalDate.of(toYear, 1,1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        DateTimeFormatter formatterDash = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while (date.isBefore(endDate)){
            String dateFormatted = date.format(formatter);

            if ( dateFormatted.compareTo(new StringBuilder(dateFormatted).reverse().toString()) == 0 ) {
                System.out.println(date.format(formatterDash));
            }
            date = date.plusDays(1);
        }
    }
}