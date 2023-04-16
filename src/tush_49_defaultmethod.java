interface mycamera{
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
interface mywifi{
    String[] getnetwork();
    void connecttonetwork(String network);
}
class mycellphone{
    void cellnumber(int phonenumber){
        System.out.println("calling " + phonenumber);
    }
    void pickcall(){
        System.out.println("connecting...");
    }
}
class mysmartphone extends mycellphone implements mycamera,mywifi{
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
public class tush_49_defaultmethod {
    public static void main(String[] args) {
        mysmartphone ms = new mysmartphone();
        ms.takesnap();
        String[] tus = ms.getnetwork();
        for (String item:tus){
            System.out.println(item);
        }
        ms.capturecamera();
        }
    }

