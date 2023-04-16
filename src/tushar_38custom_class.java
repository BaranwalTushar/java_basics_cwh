 class employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("my id is " + id);

        System.out.println("and my name is " + name);
        System.out.println("my salary is " + salary);

    }

}
public class tushar_38custom_class {
public static void main(String[] args) {
    System.out.println("this is our custom class");
         employee tushar = new employee();//Instantiating a New Employee Oject

         employee Vaishnavi = new employee();//Instantiating a New Employee Oject
    //setting Ojects
         tushar.id = 12;
         tushar.name = "tushar ";
         tushar.salary = 10000;

         Vaishnavi.id = 54;
         Vaishnavi.name = "Vaishnavi";
         Vaishnavi.salary = 12000;

         //Printing The Attributes
    //System.out.println(tushar.id);
    //System.out.println(tushar.name);
    //        OR
    tushar.printdetails();



    Vaishnavi.printdetails();

    }
}