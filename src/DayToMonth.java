import com.sun.security.jgss.GSSUtil;

import java.time.Month;
import java.util.Scanner;

public class DayToMonth {
    public static void main(String[] args) {
        System.out.println("enter days");
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int month, day;

        month= (days /30);
        day = days-(30*month);


            System.out.println("month is " + month);
        System.out.println("day is " + day);
    }
}
