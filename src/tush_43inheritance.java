class base{
    int rollno;
    public int getRollno(){
        return rollno;
    }
    public void setRollno(int x){
        System.out.println("i am in base class now");
        rollno= x;
    }

}
class derived extends base{
    int id;
    public int getId(){
        return id;
    }
    public void setId(int y){
        System.out.println("i am in derived class now");
         id=y;
    }
}
public class tush_43inheritance {
    public static void main(String[] args) {
        //creating an object of f
        base tushar = new base();
        tushar.setRollno(4);
        System.out.println(tushar.getRollno());
        //creating an object of drrived class
       derived vaishnavi = new derived();
        vaishnavi.setId(786);
        System.out.println(vaishnavi.getId());

    }
}
