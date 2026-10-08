package Constructor;

import OOPS.name;

public class construct {
    public construct() {
        System.out.println("construct");
    }
}
//    public static void main(String[] args) {
//        name n = new name(); // access modifier of the constructor is private so we cannot access it
//    }

    // constructor overloading
    class A {
        String name;
        int roll_no;
        A(String name, int roll_no){
            this.name = name;
            this.roll_no = roll_no;
        }
        A(String name){
            this.name = name;
        }

    }

