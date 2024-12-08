package ua.edu.ucu.apps.task3;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Database db = new Database();
        Auth auth = new Auth();

        if (auth.authorize(db)) {
            System.out.println(db.getUserData());
        }
    }
}