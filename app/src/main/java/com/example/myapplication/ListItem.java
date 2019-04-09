package com.example.myapplication;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ListItem {
    private String title;
    private String address;
    private String ifOpen;
    private String openTime;

    public ListItem(String title, String address, String ifOpen, String openTime) {
        this.title = title;
        this.address = address;
        this.ifOpen = ifOpen;
        this.openTime = openTime;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getIfOpen() {
        return ifOpen;
    }

    public String getOpenTime() {
        return openTime;
    }
}
