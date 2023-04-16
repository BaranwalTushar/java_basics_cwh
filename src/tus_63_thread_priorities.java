class Thr extends Thread{
    String name;
    Thr(String name){
     super(name);
    }

    public void run(){
        while(true){
            System.out.println("I am a Thread " +getName());

        }

    }
}
public class tus_63_thread_priorities {
    public static void main(String[] args) {
        Thr t1 = new Thr("Tushar1");
        Thr t2 = new Thr("Tushar2");
        Thr t3 = new Thr("Tushar3");
        Thr t4 = new Thr("Tushar4");
        Thr t5 = new Thr("Tushar5");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();




    }
}
