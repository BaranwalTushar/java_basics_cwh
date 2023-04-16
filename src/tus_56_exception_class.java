import java.util.Scanner;

class MyException extends Exception{

    @Override
    public String toString() {
        return  "I am a tostring()";
    }

    @Override
    public String getMessage() {
        return  "I am a getMessage()";
    }
}
public class tus_56_exception_class {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        a=sc.nextInt();
        if(a<9){
            try{
                //throw new MyException();
                throw  new ArithmeticException("This ia a exception class");
//                throw new ArrayIndexOutOfBoundsException("This is exception class");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
        System.out.println("Program Done");

    }
}
