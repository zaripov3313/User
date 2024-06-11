/*
package uz.pdp.workingwithtime.timeapi;

import java.time.DayOfWeek;
import java.time.YearMonth;

public class AdditionalTypesExample {
    public static void main(String[] args) {
        for ( DayOfWeek value : DayOfWeek.values() ) {
            System.out.println(value);
        }
        YearMonth yearMonth = YearMonth.of(1995, 1);
        System.out.println(yearMonth);
    }
}*/

package uz.pdp.workingwithtime.timeapi;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate time = LocalDate.of(1995, 1, 23);
        LocalDate now = LocalDate.now();
        Period between = Period.between(time, now);
        System.out.println(between);
        Period period = Period.ofYears(40);
        System.out.println(period.toTotalMonths());
    }
}