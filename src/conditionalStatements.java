import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        System.out.println(" enter tow number");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();;
        if(num1>num2){
            System.out.println("greater number is :" + num1);
        }
        else {
            System.out.println("greater number is :" + num2);
        }
    }
}
