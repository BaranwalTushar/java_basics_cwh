abstract class parent {
    public void parent() {
        System.out.println("i am a costructor of parent");
    }

    public void sayhello() {
        System.out.println("hello !");
    }

    abstract public void greet();

    abstract public void greet1();

    abstract public void greet2();

}
class child extends parent {
    public void greet() {
        System.out.println("good morning!");
    }

    public void greet1() {
        System.out.println("good afternoon");
    }

    public void greet2() {
        System.out.println("good night");
    }

}
 abstract class child1 extends parent {
    public void tush(){
        System.out.println("i am a tushar");
    }
}


public class tush_47_abstract {
    public static void main(String[] args) {

        child tushar = new child();
        //parent p = new parent();  ---->error
        //child1 ch = new child1(); ----->error

        tushar.greet();
        tushar.greet1();
        tushar.greet2();

    }
}