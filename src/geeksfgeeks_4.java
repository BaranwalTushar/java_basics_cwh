import java.util.Scanner;
public class geeksfgeeks_4 {
    public static void main(String[] args) {
        Scanner tus = new Scanner(System.in);
        char ch = tus.next().charAt(0);

        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch== 'u' )

            System.out.println("this i a vowels");


        else{
            System.out.println("not vowels");
        }
        System.out.println(ch);

    }
}
