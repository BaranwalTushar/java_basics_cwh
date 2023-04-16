class MyMainEmployeee{

    private int id;
    private String name;
    //public MyMainEmployeee(){                     //CONSTRUCTOR
      //  id = 45;
        //name = "you are bad boy";
  //  }
//    public MyMainEmployeee(String myname){           //METHOD 1
//        id = 45;
//        name =myname;
//    }
    public MyMainEmployeee(String myname,int salary){          //METHOD 2
        id = salary;
        name =myname;
    }

    public String getname(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }


}
public class tush_41constructor {
    public static void main(String[] args) {


     MyMainEmployeee tushar = new MyMainEmployeee("tushar is a good boy",1000);
//       tushar.setName("Tushar is a coder");
//        System.out.println(tushar.getname());
//        tushar.setId(54);
//        System.out.println(tushar.getId());

        System.out.println(tushar.getId());
        System.out.println(tushar.getname());
    }
}
