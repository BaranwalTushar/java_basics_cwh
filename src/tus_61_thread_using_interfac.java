class Threadrunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");System.out.println("I am a thread 1 not threat1");


    }

}
class Threadrunnable2 implements Runnable{
    public void run(){
        System.out.println("i am a thread 2 with  no threat 2");
        System.out.println("i am a thread 2 with  no threat 2");
        System.out.println("i am a thread 2 with  no threat 2");System.out.println("i am a thread 2 with  no threat 2");System.out.println("i am a thread 2 with  no threat 2");
    }

}
public class tus_61_thread_using_interfac {
    public static void main(String[] args) {
        Threadrunnable1 Bullet1 = new Threadrunnable1();//in a new state
        Thread gun1 = new Thread(Bullet1);

        Threadrunnable2 Bullet2 = new Threadrunnable2();
        Thread gun2 = new Thread(Bullet2);
        gun1.start();
        gun2.start();


    }
}
