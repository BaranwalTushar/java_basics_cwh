import java.util.Scanner;

public class tus_55_nested_trycatch {
    public static void main(String[] args) {
        int marks[] = new int[3];
        marks[0] = 5;
        marks[1] = 56;
        marks[2]= 6;

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of Index");
        int ind = sc.nextInt();

        try{
            System.out.println("Welcome to video 55");
            try {
                System.out.println(marks[ind]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("sorry this index doesnot exist");
                System.out.println("Exception on level 2");
            }
        }
        catch (Exception e){
            System.out.println("Exception on level 1");
        }
    }
}
