package ua.edu.ucu.apps.task1;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter @AllArgsConstructor
public class TwitterUser {
    private String email;
    private TwitterCountry userCountry;
    private LocalDate userActiveTime;
}