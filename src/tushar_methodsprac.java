//PROBLEM 1
public class tushar_methodsprac {
    //    static void multiplication(int x){
//
//        for(int i=1;i<=10;i++){
//            System.out.format("%d x %d = %d",x ,i,x*i);
//            System.out.println(" ");
//
//        }
//
//
//    }
//    static void pattern(int n){
//        for(int i=0;i<n;i++){
//            for(int j=0;j<i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static int sumrec_natural(int n) {
////        sum(n) = 1+2+3+...n
////        sum(n) = 1+2+3+...n-1+n
////        sum(n) = sum(n-1)+n
////        sum(3) = 3+sum(2)
////        sum(3) = 3+2+sum(1)
////        sum(3) = 3+2+1
//        if (n == 1) {//Base condition
//            return 1;
//
//        } else {
//            return n + sumrec_natural(n - 1);
//        }
//    }
//static void pattern2() {
//    for (int i = 1; i<=4; i++) {
//        for (int j = 1; j <= 4; j++) {
//            if (j <= 5 - i) {
//                System.out.print("*");
//            } else {
//                System.out.print(" ");
//            }
//
//        }
//        System.out.println();
//    }
//}
//    static int fabinacci(int n) { //Best Logic To Find Fabinnacci Series
//        if (n == 1) {
//            return 0;
//        } else if (n == 2) {
//            return 1;
//
//        }
//        else {
//            return fabinacci(n-1) + fabinacci(n-2);
//        }
//
//    }


    public static void main(String[] args) {


       // System.out.println("the multiplication of 5 is:");
        //multiplication(5);
        //PROBLEM 2
       // pattern(9);

        //problem 3
//        System.out.println("the sum of 5 natural number is: " +sumrec_natural(5));
        //Problem 4
//        pattern2();
        //Problem 4
       // fibonnacci series = 0,1,1,2,3,5,8,13,21,34
//        System.out.println("the fabinacci series of 5 is " + fabinacci(5));


    }

}

