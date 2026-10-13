package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class basics {
    static List<Integer> list = new ArrayList<>();
    static List<String> list2 = new ArrayList<>();
    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.stream().
                filter((e) -> e%2 == 0).
                forEach(System.out::println);

        // now string

        list2.add("apple");
        list2.add("orange");
        list2.add("banana");
        list2.add("pineapple");
        list2.add("banana");
        list2.add("orange");
        list2.add("pear");
        list2.add("grape");
        list2.add("lemon");

      Set s =   list2.stream().
                filter((e) -> e.contains("A") ).
                collect(Collectors.toSet());
      s.forEach(System.out::println);
      // task 1
      list2.stream().filter((e) -> e.contains("A")).map(String::toUpperCase).forEach(System.out::println);
      // task 2
        List<employee> employees = new ArrayList<>();
        employees.add(new employee(1, "Alice Smith", "Engineering", 85000.00, 28));
        employees.add(new employee(2, "Bob Jones", "HR", 60000.00, 34));
        employees.add(new employee(3, "Charlie Brown", "Finance", 95000.00, 41));
        employees.add(new employee(4, "Diana Prince", "Marketing", 72000.00, 29));
        employees.add(new employee(5, "Evan Wright", "Engineering", 110000.00, 35));
        employees.add(new employee(6, "Fiona Gallagher", "Operations", 65000.00, 26));
        employees.add(new employee(7, "George Clark", "Legal", 125000.00, 45));

        employees.stream().collect(Collectors.groupingBy(employee::getDepartment));

    }
}
