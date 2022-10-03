import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        System.out.println("give the values of angle");

        Scanner sc = new Scanner(System.in);
        int angle = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();

        if( angle+angle2+angle3==180 && angle!=0 && angle2 !=0 && angle3!=0){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
    }

    }