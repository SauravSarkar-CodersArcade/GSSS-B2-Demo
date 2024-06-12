package com.gsss.batch2.basics;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextLine();
        String typeOfDay = switch (day) {
            case "MON", "TUE", "WED", "THU", "FRI" -> "WeekDay";
            case "SAT", "SUN" -> "Weekend";
            default ->  {
                if(day.isEmpty()){
                yield "No Input";
            }else{
                yield "Invalid Input";
            }
            }
        };
        System.out.println( day + " is a " + typeOfDay);
    }
}
