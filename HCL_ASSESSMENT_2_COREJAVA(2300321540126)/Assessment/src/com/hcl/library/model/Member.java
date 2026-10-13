package library.model;

import java.util.List;

public class Member {
    int id;
    String name;
    String email;
    public Member(int id, String name, String email) {
         if(!email.contains("@")){
             throw new IllegalArgumentException("Invalid email");
         }
         this.id = id;
         this.name = name;
         this.email = email;
    }
    List<Borrowable> borrowables;

}
