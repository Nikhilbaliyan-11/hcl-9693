import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkListPractice {
    public static void main(String[] args) {


                List<String> basket  = new LinkedList<>(List.of("fruitsAre"));
                List<String> basket2  = new LinkedList<>(List.of("fruitsAre"));
        basket2.add("Apple");
        basket2.add("Banana");
        basket2.add("Orange");
        basket2.add("Watermelon");
        basket2.add(1,"Pineapple");
                // addition of fruits
                basket.add("Apple");
                basket.add("Banana");
                basket.add("Orange");
                basket.add("Watermelon");
                basket.add(1,"Pineapple"); // at a specific index
                // stream()
                basket.stream().forEach(System.out::println);
                // equals()
                 boolean isequal = basket.equals(basket2);
        System.out.println(isequal + "*** they are equal? ***");
                // read
                String firstfruit = basket.get(0);
                System.out.println(firstfruit);

                // update
                basket.set(2, "Blueberry");
                System.out.println(basket);

                // remove
                basket.remove(2);
                System.out.println(basket);

                // how to check size and search an element in list

                System.out.println("no. of fruits inside basket" +basket.size());
                Boolean hasApple = basket.contains("Apple");
                System.out.println("Is apple in the basket?" + hasApple);
                int indexofApple = basket.indexOf("Apple");
                System.out.println("index of apple " + indexofApple);

                // for sorting the list we can use basket.sort();

                // iteration of list
                System.out.println("Iterating the basket");
                for(String fruit : basket) {
                    System.out.println(fruit);
                }

                // clear
                basket.clear();
                System.out.println(basket);

                // element is given and not the address of the element
             //    and we have to add element init it will take O(n) time if the reference to the iterator is not given and if given then it will take O(1) time.

            }

        }


