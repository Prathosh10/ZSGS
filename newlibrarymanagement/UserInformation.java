import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInformation {

    private static List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public static void userEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User's Name");
        String userName = scanner.nextLine();
        System.out.println("Enter User's Gender");
        String gender = scanner.nextLine();
        System.out.println("Enter Department");
        String department = scanner.nextLine();
        System.out.println("Enter User Id");
        String userId = scanner.nextLine();

        User userEntry = new User(userName, gender, department, userId);
        users.add(userEntry);
        System.out.println("List of Available users");

        for (User user : users) {
            System.out.println(user.getUserName());
        }

    }
}

class User {
    private String userName, gender, department, userId;

    public User(String userName, String gndr, String dpt, String uId) {
        this.userName = userName;
        this.gender = gndr;
        this.department = dpt;
        this.userId = uId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }
}
