class phone{
    public void showtime(){
        System.out.println("Good Morning!");
    }
    public void name(){
        System.out.println("phone is ringing.....  ");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("Playing music !");
    }
    public void name(){
        System.out.println("smartphone is Ringing.....");
    }
}
public class tush_46_dynamicmthod_dispatch {
    public static void main(String[] args) {
        //phone p = new phone(); // it is allowed
        //p.name();

        //smartphone sm = new smartphone();// it is allowed
        //sm.name();

        phone p = new smartphone(); // WOW it is also Allowed
        p.name();

        //smartphone sm = new phone(); //it is not allowed
        //sm.name();
        p.showtime();//Allowed
        //p.music();//not allowed

    }
}
