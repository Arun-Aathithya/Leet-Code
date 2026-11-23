import java.util.HashMap;

public class Hash_Map_Ex {
    public static void main(String args[]) {
        HashMap<Integer, String> m = new HashMap<>();

        m.put(1, "Ram");
        m.put(2, "Shyam");
        m.put(3, "Mohan");

        System.out.println(m.get(1));
        System.out.println(m.containsKey(2));
        System.out.println(m.containsValue("Mohan"));
        System.out.println(m.size());
        System.out.println(m.isEmpty());

        m.remove(3);
        System.out.println(m);

        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.entrySet());

        m.clear();
        System.out.println(m);
    }
}