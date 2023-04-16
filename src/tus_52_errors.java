import java.util.Scanner;

public class tus_52_errors {
    public static void main(String[] args) {

        //Syntax error Demo
        //int a=4 No semicolon
        //b=5; b Not Declared

        //write a program to print all prime numbers between 1 to 10
        //Logical Error
//        for(int i=0;i<5;i++){
//            System.out.println(2*i+1);
//        }

        // RunTime Error
        int k;
        Scanner sc= new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+1000/k); //when we divided  by 0 its throw arthimetic exception
    }
}
