class base1{

   base1(){
       System.out.println("i am a constructor");
   }
   base1(int a){
       System.out.println("i am an overloaded constructor with value of a as :" + a);
   }
}
class derived1 extends base1{
    derived1(){
       // super(6);
        System.out.println("i am a derived class instructor");
    }
    derived1(int a, int b){
             super(a);
        System.out.println("i am a overloaded constructor with value of b as  :" + b);

    }


}
class childderived extends derived1{
    childderived(){
        System.out.println("i am a constructor of class childderived ");
    }
    childderived(int a,int b,int c){
        super(a, b);
        System.out.println("i am an overloaded counstructor wit value of c as:" + c);
    }

}
public class tush_44constructorin_inHERITance {
    public static void main(String[] args) {

        //base1 b = new base1();
        //derived1 d  = new derived1();
       // derived1 d = new derived1(5,6);
         childderived tushar = new childderived(4,5,6);
    }
}