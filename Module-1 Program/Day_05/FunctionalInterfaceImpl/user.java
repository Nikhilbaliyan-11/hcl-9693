package FunctionalInterfaceImpl;

public class user {
    private int id;
    private String username;
    private int age;
    private String email;
    private String password;

    public user(int id, String username, int age, String email, String password) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.email = email;
        this.password = password;

    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.username = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + username + "', username='" + username + "', email='" + email + "'}";
    }
}
