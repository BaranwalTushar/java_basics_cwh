class Mythread1 extends Thread{
    int i;
    @Override

    public void run(){
        while(i<40){
            System.out.println("MY thread1 is running");
            System.out.println("I am a coder");
            i++;
        }

    }
}
class Mythread2 extends Thread{
    int i;
    @Override

    public void run(){

        while(i<40){
            System.out.println("Mythread 2 is running ");
            System.out.println("I am not a coder");
            i++;
        }

    }
}
public class tus_60_thread {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
