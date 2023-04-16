class Animal {
    String domesticanimal;

    public String getDomesticanimal() {
        return domesticanimal;
    }

    public void setDomesticanimal(String a) {
        System.out.print("the pet animal is a familiar with ");

        domesticanimal = a;

    }
}
     class dog extends Animal{ //property of inheritance using keyword (extends)
        String petname;

        public String getPetname(){
            return petname;
        }
        public void setPetname(String n){
            System.out.print("my dog name is  ");

            petname = n;
        }
     }

public class tush_inheritanceprac {
    public static void main(String[] args) {
        //Animal class with object domestic animal
        Animal tushar = new Animal();
        tushar.setDomesticanimal("my family\n");
        System.out.println(tushar.getDomesticanimal());
        //dog class with object petname

        dog sourabh = new dog();
        sourabh.setPetname("lancy\n");
        System.out.println(sourabh.getPetname());

    }
}
