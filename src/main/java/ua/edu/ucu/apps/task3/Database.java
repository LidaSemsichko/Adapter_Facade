package ua.edu.ucu.apps.task3;

public class Database extends BaseDatabase {
    @SuppressWarnings("deprecation")
    public String getUserData() {
        return super.fetchUserData();
    }

    public String getStatisticsData() {
        return super.fetchStatisticsData();
    }

    
    @Override@Deprecated
    public String fetchUserData() {
        return super.fetchUserData();
    }

    
    @Override@Deprecated
    public String fetchStatisticsData() {
        return super.fetchStatisticsData();
    }
}
