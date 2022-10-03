import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("enter the total amount");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if(amount>=10){
            int result = (amount*90)/100;
            System.out.println("u save 10 % ur amount is ;" + result);
        }
        else {
            System.out.println("sorry u have no any discount ur amount is ;" + amount);
        }
    }
}
