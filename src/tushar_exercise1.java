import java.util.Scanner;

public class tushar_exercise1 {
    public static void main(String[] args) {
        System.out.println("taking input form the user");
        Scanner marks = new Scanner(System.in);
        System.out.println("Marks of subject 1 :");
        float a = marks.nextFloat();
        System.out.println("Marks of subject 2 :");
        float b = marks.nextFloat();
        System.out.println("marks of subject 3 :");
        float c = marks.nextFloat();
        System.out.println("total marks :");
        float sum = a + b+ c;
        System.out.println(sum);

         float percentage = (sum/300)*100;
        System.out.println(percentage);





    }
}
