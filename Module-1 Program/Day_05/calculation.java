public class calculation{
    public static void main(String[] args) {
     lambaexp add = (a,b)->  a+b;
      lambaexp sub = (a,b)->a-b;
      lambaexp mul = (a,b)->a*b;
      lambaexp div = (a,b)->a/b;

      add.calculate(10,20);
      sub.calculate(10,20);
      mul.calculate(10,20);
      div.calculate(10,20);

       evenOrOdd isEven = (int a) -> a%2==0;
        System.out.println("is even" + isEven.evenOrOdd(10));


    }



}
