package ua.edu.ucu.apps.task1;

import java.time.LocalDate;

public class MyXUser implements User{
    TwitterUser user;
    public MyXUser(TwitterUser user) {
        this.user = user;
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry().toString();
    }

    @Override
    public LocalDate getActiveTime() {
        return user.getUserActiveTime();
    }
}