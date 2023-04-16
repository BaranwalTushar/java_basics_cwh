import java.util.Scanner;

public class tushar_practiseset {
    public static void main(String[] args) {

        System.out.println("Convert kilometer to mieters");

        Scanner convert = new Scanner(System.in);
        System.out.println("enter the value");
        int value = convert.nextInt();
         int aftercoversion = 1000*value;
        System.out.println(aftercoversion);

    }
}
