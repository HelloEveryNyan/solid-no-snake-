package homework;


public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        user.report();

        DataSaver userPersister = new UserPersister(user);
        user.save(userPersister);
    }
}