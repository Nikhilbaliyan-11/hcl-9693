package Map;

import java.util.HashMap;
import java.util.Map;

public class implOfMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        map.forEach((s, e) -> System.out.println(s + " " + e));

        Map<String, Integer> map2 = new HashMap<>(); // thread safe and synchronised
        map2.put("one", 1);
        map2.put("two", 2);
        map2.put("three", 3);

        System.out.println(map2.get("one"));
        map2.forEach((k, v) -> System.out.println(k + " " + v));

//        name rollno and age arraylist of student after that we have to sort on the basis of age and print
    }
}
