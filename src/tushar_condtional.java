import java.util.Scanner;
public class tushar_condtional {
    public static void main(String[] args) {
       int age;
        System.out.println("enter your age sir :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
//
//        if(age>56){
//            System.out.println("you are experienced");
//        } else if(age>46){
//            System.out.println("you are semi experienced");
//
//        }
//        else if(age>36){
//            System.out.println("you are semi semi experienced");
//
//        }
//        else{
//            System.out.println("you are not experienced");
//        }

        switch (age){
            case 18:
                System.out.println("you are going to became an adult");
                break;
            case 23:
                System.out.println("you are going to became an employee");
                break;
            case 60:
                System.out.println("you are going to became an retired");
                break;
            default:
                System.out.println("enjoy ur life!");
                break;

        }

    }

}
