
import java.util.HashSet;

public class Hash_Set_Ex {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(29);
        hs.add(78);
        hs.add(89);
        hs.add(69);
        hs.add(45);

        System.out.println("HashSet elements: " + hs);

        hs.add(29);
        System.out.println("After adding duplicate: " + hs);

        hs.remove(78);
        System.out.println("After removing 78: " + hs);

        System.out.println("Contains 69: " + hs.contains(69));

        System.out.println("Size of HashSet: " + hs.size());

        System.out.println("Is empty: " + hs.isEmpty());

        System.out.println("Elements using for-each:");
        for (Integer i : hs) {
            System.out.println(i);
        }

        HashSet<Integer> hs2 = (HashSet<Integer>) hs.clone();
        System.out.println("Cloned HashSet: " + hs2);

        hs.clear();
        System.out.println("After clear: " + hs);
    }
}
