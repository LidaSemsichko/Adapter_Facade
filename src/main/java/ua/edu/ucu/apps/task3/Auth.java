package ua.edu.ucu.apps.task3;

public class Auth extends Authorization {
    public boolean authorization(Database database) {
        return super.authorize(database);
    }

    
    @Override @Deprecated
    public boolean authorize(Database database) {
        return super.authorize(database);
    }
}
