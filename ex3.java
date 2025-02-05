import java.util.Optional;

interface UserService {

    // Default method that returns the default welcome message
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

    // Method that returns an Optional containing the user's name, or empty if name is null
    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {

    // Implementing the getUser method
    @Override
    public Optional<String> getUser(String name) {
        return Optional.ofNullable(name);
    }
}

public class ex3 {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Case 1: User name is provided
        Optional<String> userWithName = userService.getUser("John");
        System.out.println(userWithName.map(name -> "Welcome, " + name + "!")
                                      .orElse(userService.getWelcomeMessage()));

        // Case 2: No user name provided
        Optional<String> userWithoutName = userService.getUser(null);
        System.out.println(userWithoutName.map(name -> "Welcome, " + name + "!")
                                         .orElse(userService.getWelcomeMessage()));
    }
}
