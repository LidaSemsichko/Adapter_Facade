package ua.edu.ucu.apps.task3;

public class Authorization {
    public boolean authorize(Database database) {
        @SuppressWarnings("deprecation")
        String userData = database.fetchUserData();
        if (userData != null && !userData.isEmpty()) {
            return true;
        }
        return false;
    }
}
