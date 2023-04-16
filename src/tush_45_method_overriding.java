class A{

    public int tushar(){
        return 5;
    }
    public void tushar2(){
        System.out.println("i am tushar2 of class A");
    }
}
class B extends A{
    @Override
    public void tushar2(){
        System.out.println("i am a tushar 2 of class B");
    }
    public void tushar3(){
        System.out.println("i am a tushar 3 of class B");
    }
}
public class tush_45_method_overriding {
    public static void main(String[] args) {
        A a = new A();
        a.tushar2();
        B b = new B();
        b.tushar2();

    }
}
