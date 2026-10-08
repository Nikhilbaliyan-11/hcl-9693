package overriding;

public class child extends parent{
    // runtime overriding will be there
    public void display() {
//         if we want to execute the parent method then we can use super.methodname();

        System.out.println(" child method :");
    }
// compile time overriding will be there bw static methods
    public static void print() {
        System.out.println("printing child method:");
    }
    public static void main(String[] args) {
        child obj = new child();
        obj.display();
        parent obj2 = new parent();
        obj2.display();
        parent obj4 = new child();
        obj4.display();
        // not possible condition
//        child obj3 = new parent();
//        obj3.display();

        // static method compile time binding
         obj.print();
         obj2.print();
         // if we take refernce of parent and instantiate it with child  then it should show the  child mehtod but
         // it  will hide the method of child and execute the parent mehtod called as method hiding
         obj4.print();


    }
}
