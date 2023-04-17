import java.util.HashSet;

public class tus_70_Hashing {
    public static void main(String[] args) {
        //Hashing = hashing is a fastest way to insert and  searching.f(x)=x % array index
        //Method of hashing 1-Hashset 2-Hashmap 3-LinkedHashmap 4-Hash table

        HashSet<Integer> h1 = new HashSet<>(6,0.5f);
        // load factor is a measure that decides when to increase the HashTable capacity to maintain the search and insert operation complexity of O(1)
        h1.add(2);
        h1.add(5);
        h1.add(6);
        h1.add(5);
        System.out.println(h1);

    }
}
