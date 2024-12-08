package ua.edu.ucu.apps.task3;

public class BaseDatabase {
    public String getUserData() {
        return "User data";
    }

    @Deprecated
    public String fetchUserData() {
        return "User data";
    }

    @Deprecated
    public String getStatisticsData() {
        return "Statistics data";
    }

    public String fetchStatisticsData() {
        return "Statistics data";
    }
}