import java.util.Random;
import java.util.Scanner;
public class tushar_rockpaperscissor {
    public static void main(String[] args) {
        //0 for rock
        //1 for paper0
        //2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock ,1 for paper, 2 for  scissor");
        int userinput = sc.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if(userinput==computerinput){
            System.out.println("Match Draw");
        }
        else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1){
            System.out.println("you win!");
        }
        else{
            System.out.println("you lose!");
        }
    }
}
