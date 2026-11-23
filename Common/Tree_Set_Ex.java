
import java.util.TreeSet;

public class Tree_Set_Ex {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(89);
        ts.add(76);
        ts.add(45);
        ts.add(98);
        ts.add(29);

        System.out.println("TreeSet elements: " + ts);

        ts.add(89);
        System.out.println("After adding duplicate: " + ts);

        ts.remove(76);
        System.out.println("After removing 76: " + ts);

        System.out.println("Contains 89: " + ts.contains(89));

        System.out.println("Size of TreeSet: " + ts.size());

        System.out.println("Is empty: " + ts.isEmpty());

        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());

        System.out.println("Lower than 76: " + ts.lower(76));
        System.out.println("Higher than 76: " + ts.higher(76));

        System.out.println("Elements using for-each:");
        for (Integer i : ts) {
            System.out.println(i);
        }

        System.out.println("Descending order: " + ts.descendingSet());

        TreeSet<Integer> ts2 = (TreeSet<Integer>) ts.clone();
        System.out.println("Cloned TreeSet: " + ts2);

        ts.clear();
        System.out.println("After clear: " + ts);
    }
}
