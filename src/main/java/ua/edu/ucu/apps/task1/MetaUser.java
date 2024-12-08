package ua.edu.ucu.apps.task1;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter @AllArgsConstructor
public class MetaUser {
    private String userMail;
    private String country;
    public LocalDate lastActiveTime;

}