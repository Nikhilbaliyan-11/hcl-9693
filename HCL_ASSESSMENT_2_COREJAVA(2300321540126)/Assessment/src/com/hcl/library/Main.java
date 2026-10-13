package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Online Library ------------>");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Add items: ");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow");
            System.out.println("4. Return");
            System.out.println("5. Waitlist");
            System.out.println("6. ListItems");
            System.out.println("7. Search");
            System.out.println("8. Export Report");
            System.out.println("9. Exit");

            int choice = sc.nextInt();
            if(choice > 9 || choice < 1 ) {
                System.out.println("Invalid choice");
            }
            switch (choice){
                case 1:
                    System.out.println("Enter item ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter item name: ");
                    String name = sc.next();
                    System.out.println("Enter item email: ");
                    String email = sc.next();
                    System.out.println("Enter item isbn: ");
                    String isbn = sc.next();
                    System.out.println("Enter item date of borrowed: ");
                    String borrowed = sc.next();

            }
        }
    }
}