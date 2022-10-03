import java.util.Scanner;

public class VoteProj {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18 || age<110){
            System.out.println("u can give vote");

        }
        else {
            System.out.println("u can't give vote");
        }
    }

}
