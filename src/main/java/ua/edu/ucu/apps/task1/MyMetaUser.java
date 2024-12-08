package ua.edu.ucu.apps.task1;
import java.time.LocalDate;

public class MyMetaUser implements User {
    MetaUser user;
    public MyMetaUser(MetaUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public LocalDate getActiveTime() {
        return user.getLastActiveTime();
    }
}