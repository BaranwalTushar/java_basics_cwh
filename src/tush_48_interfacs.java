interface Bicycle{
   int a =  45;
   void applybrake(int decrement);
   void speedup(int increment);
}
interface hornbicycle{
    void blowhornactiva();
    void blowhornbike();
}
class Avoncycle implements Bicycle,hornbicycle{
    void blowhorn(){
        System.out.println("pee pee poo poo");
    }
    public void applybrake(int decrement){
        System.out.println("applying brake");
    }
    public void speedup(int incrment){
        System.out.println("speeding up");
    }
    public void blowhornactiva(){
        System.out.println("activa dhoom dhoom");
    }
    public void blowhornbike(){
        System.out.println("bike pee pee pee peee");
    }
}
public class tush_48_interfacs {
    public static void main(String[] args) {
       Avoncycle tusharcycle = new Avoncycle();
       tusharcycle.applybrake(2);
       tusharcycle.blowhorn();
       tusharcycle.speedup(3);
        System.out.println(tusharcycle.a);// ----You Can Create Property in Interfaces
        //tusharcycle.a = 454;//--You Can Not Modify the  Property in Interfaces as They Are Final
        //System.out.println(tusharcycle.a);
        tusharcycle.blowhornactiva();
        tusharcycle.blowhornbike();
    }
}
