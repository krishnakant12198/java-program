import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Arithmatic {


    public void circle() {
        Scanner sc = new Scanner(System.in);


        int r = sc.nextInt();
        int reslut = (int) (3.14 *r*r);
        System.out.println(reslut);
    }

    public void square(){
        Scanner sc = new Scanner(System.in);


        int A = sc.nextInt();
        int result = A*A;
        System.out.println("area of square" + result);
    }
    public void rightTriangle(){
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a*b/2;
        System.out.println("div " + result);
    }


    public static void main(String[] args) {
        System.out.println("enter 2 numb.");
        Arithmatic obj = new Arithmatic();
        obj.circle();
        obj.square();
        obj.rightTriangle();

    }


}







