class Mythread3 extends Thread{
    String name;
    Mythread3(String name){
       super(name);
    }
    public void run(){

        System.out.println("I am a thread " +getName());
    }
}
public class tus_62_thread_constructor {
    public static void main(String[] args) {
          Mythread3 t1= new Mythread3("tushar");

          Mythread3 t2 = new Mythread3(("sayak"));
        t1.start();
        t2.start();

        System.out.println("The id no. is "+t1.getId());
        System.out.println("the id name is "+t1.getName());
        System.out.println("The id no. is "+t2.getId());
        System.out.println("the id name is "+t2.getName());
    }
}
