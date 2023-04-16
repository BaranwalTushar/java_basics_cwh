class employee1{

    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getname(){
        return name;
    }

}
//    class cellphone{
//
//    public void getvibrating(){
//        System.out.println("vibrating....");
//    }
//    public void getringing(){
//        System.out.println("ringing...");
//    }
//
//}
class sqaure{
    int side=4;

        public int area(){
            return side*side;
    }
    public int perimeter(){
            return 4*side;
    }

}
public class  tushar_39ooppractise {
    public static void main(String[] args) {
        //Problem 1
        employee1 tushar = new employee1();
        tushar.name =("Tushar is  a coder and his salary is -");
       tushar.salary = 1000;
        System.out.println(tushar.getname());
        System.out.println(tushar.getSalary());

        //Problem 2
//        cellphone iphone = new cellphone();
//        iphone.getringing();
//        iphone.getvibrating();

        //Problem 3
//      sqaure tushar = new sqaure();
//      int side;
//        System.out.println(tushar.area());
//        System.out.println(tushar.perimeter());

    }
}
