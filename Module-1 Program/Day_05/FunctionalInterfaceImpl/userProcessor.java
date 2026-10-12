package FunctionalInterfaceImpl;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class userProcessor {
    public static  void main(String[] args) {
       final Predicate<user> isValidEmail = user ->
                user.getEmail() != null && user.getEmail().contains("@");
        final Predicate<user> isValidAge = user -> user.getAge() >= 18;
        final Supplier<String> idGenerator = () -> "id -  " + UUID.randomUUID().toString().substring(0,8).toUpperCase();
        final Function<user, user> enrichUser = user -> {
            user.setId(Integer.parseInt(idGenerator.get()));
            user.setName(user.getEmail().toLowerCase().split("@")[0]);
            return user;
        };
        // 4. Consumer: Performs an operation on an input without returning anything
        final Consumer<user> saveToDatabase = user ->
                System.out.println("SUCCESS: Saved user to database -> " + user);

        final Consumer<user> sendWelcomeEmail = user ->
                System.out.println("NOTIFICATION: Sending welcome email to " + user.getEmail());
         void processUser(user user){
          Predicate<user> isValidUser = isValidEmail.and(isValidAge);

        }
    }
}
