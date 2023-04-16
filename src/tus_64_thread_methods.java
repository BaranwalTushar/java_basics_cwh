class Mynewthread1 extends Thread{
    int i;
    public void run(){

        while(i<100){
            System.out.println("Tushar is a coder:");
            i++;
        }
    }
}
class Mynewthread2 extends Thread{
    int i;
    public void run(){
        while(i<50){
            System.out.println("i love vaishnavi");
            try {
                Thread.sleep(50);
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        }
    }
}
public class tus_64_thread_methods {
    public static void main(String[] args) {
        Mynewthread1 t1 = new Mynewthread1();
        Mynewthread2 t2 = new Mynewthread2();

        t1.start();


//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();

    }
}
