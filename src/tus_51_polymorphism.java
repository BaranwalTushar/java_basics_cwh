interface mycamera2{
    void takesnap();
    void recordvideo();
    default void capturecamera(){ //We Can NOt use Private Method Directly But We can use Private method body in Default
        greet();
        System.out.println("capturing camera...");
    }
    private void greet(){
        System.out.println("good morning");
    }
}
interface mywifi2{
    String[] getnetwork();
    void connecttonetwork(String network);
}
class mycellphone2{
    void cellnumber(int phonenumber){
        System.out.println("calling " + phonenumber);
    }
    void pickcall(){
        System.out.println("connecting...");
    }
}
class mysmartphone2 extends mycellphone2 implements mycamera2,mywifi2{
    public void takesnap(){
        System.out.println("taking snap");
    }
    public void recordvideo(){
        System.out.println("recoring video...");
    }
    public String[] getnetwork(){
        System.out.println("Getting List Of networks:");
        String[] networklist = {"Tushar","VAibhav","Tarique"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("connect to network" + network);

    }
//    public void capturecamera(){ //By Default this method will be run Instead of default method
//        System.out.println("capture camera of vaishnavi");
//    }
}
public class tus_51_polymorphism {
    public static void main(String[] args) {
     mycamera2 cam1 = new mysmartphone2();//this is a smartphone but,use it as camera
        //cam1.getnetworks();-->error
     cam1.capturecamera();

     //IF WE MAKE A OBJECT OF (MYSMARTPHONE 2) THEN ALL METHOD WILL BE RUN
    }
}
