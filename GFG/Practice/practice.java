package GFG.Practice;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // while (true) {
        // System.out.print("Enter 0 to break else continue : ");
        // // System.out.print("Enter Your Number : ");
        // int a = sc.nextInt();
        // if(a == 0){
        // break;
        // }else{
        // System.out.println("Entered Number : " + a);
        // }
        // }

        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("I am case 1");
                break;
            case 2:
                System.out.println("I am case 2");
            default:
                break;
        }
    }
}
