import java.util.Scanner;
class MyException1 extends Exception{
    @Override
    public String toString() {
        return  "I am a tostring()";
    }

    @Override
    public String getMessage() {
        return  "I am a getMessage()";
    }
}
public class tus_59_error_practise {
    public static void main(String[] args) {
        //problem 1
        // syntax error int a = 7

//        int age = 78;
//        int year_born = 2000-78; // logical error
//
//        System.out.println(6/0);

        //problem 2
//
//        try{
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("hehe");
//        }
//        catch (ArithmeticException e){
//            System.out.println("haha");
//        }
        //problem 3
        boolean flag = true;
        int marks[] = new int[3];
        marks[0] = 5;
        marks[1] = 45;
        marks[2] = 56;
        int index;
        int i=0;
        Scanner sc  = new Scanner(System.in);



        while(flag &&  i<5){
            try{
                System.out.println("Enter the index ");
                index = sc.nextInt();

                System.out.println("The value of marks[index] "+marks[index]);
                throw new MyException1();

            }
            catch (Exception e){
                System.out.println("Invalid Index");
                System.out.println(e.getMessage());
                System.out.println(e.toString());

                i++;
            }
        }
    }
}
