
class thread4 extends Thread{
    int i;
    public void run(){
        while (true) {
            System.out.println("Good morning");
            i++;
        }
    }

    }
    class thread5 extends  Thread{
    int i;
    public void run(){
        while(true){
          try{
              Thread.sleep(20);
                  }
          catch(Exception e){
              System.out.println(e);
                  }
            System.out.println("Welcome....");
            i++;
        }

    }
    }




public class tus_65_thread_practise {
    public static void main(String[] args) {
        //question 1
        thread4 t4 = new thread4();
        thread5 t5 = new thread5();
        t4.setPriority(5);
        t5.setPriority(6);
        System.out.println(t4.getPriority());
        System.out.println(t5.getPriority());
        t4.start();
        t5.start();
//        System.out.println(t5.getState());
//        System.out.println(t4.getState());
//        System.out.println(Thread.currentThread().getState()); //-->when we have to chech getstate plz comment the while loop

    }
}
