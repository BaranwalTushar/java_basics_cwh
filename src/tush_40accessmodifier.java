class myemployee{
     int id;
    String name;

   public void setid(int i){
       id = i;

   }
   public int getid(){
       return id;
   }
   public void setname(String n){
       name = n;
   }
   public String getName(){
       return name;
   }

}
public class tush_40accessmodifier {
    public static void main(String[] args) {
        myemployee tushar = new myemployee();
        tushar.setid(1000);
        System.out.println(tushar.getid());
        tushar.setname("Tushar is a Coder");
        System.out.println(tushar.getName());

    }
}
