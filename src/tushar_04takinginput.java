package com.company;
import java.util.Scanner;

public class tushar_04takinginput {
    public static void main(String[] args) {
        System.out.println("it works");
        System.out.println("taking input form the users");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. 1");
        int a = sc.nextInt();
        System.out.println("enter no. 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of two no. is: ");
        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String s1 = sc.next();// reading only one word
       // String s1 = sc.nextLine();// reading full sentences
        //System.out.println(s1);
    }
}
