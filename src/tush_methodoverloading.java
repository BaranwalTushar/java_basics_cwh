public class tush_methodoverloading {
        static void randomjokes(){
        System.out.println("vaishnavi loves me a lot");
    }
    static void changes(int a){
            a = 98;
    }
    static void changes1(int [] arr){
        arr[2] = 98;
    }
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int a ){
        System.out.println("good morning " + a + " bro");
    }
    static void foo(int a, int b ){ //a and b are parameters
        System.out.println("good morning " + a + " bro");
        System.out.println("good morning " + b + " bro");
    }
       public static void main(String[] args) {
//            randomjokes();
//
//            int x= 45;
//            changes(x);
//           System.out.println("the value after change " + x);
//
//           int marks[] = {32,34,45,67,76};
//           changes1(marks);
//           System.out.println("the value after change " + marks[2]);

           // METHODS OVERLOADING
           foo();
           foo(3000);
           foo(2000,3000);//arguments are actual

    }
}
