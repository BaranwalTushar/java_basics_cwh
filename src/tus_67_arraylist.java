
import java.util.*;
public class tus_67_arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(3);//iniial caacity
        list.add(6);
        list.add(6);
        list.add(5);
        list.add(8);
        list.add(0,9);
      list1.add(56);
        list.addAll(list1);
       // System.out.println(list.indexOf(9));
        list.set(1,45);
        list.removeAll(list1);//remove all the data which are present in list1.


        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));

        }
        System.out.println(list.contains(8));//To show 8 are present or  not

    }
}
