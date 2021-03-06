package fr.insa.alarmservice.model;

import java.util.ArrayList;

public class Alarm {

    public static ArrayList<String> historyDatabase = new ArrayList<>();
    private static ArrayList<Alarm> alarmList = new ArrayList<>();
    private int id;
    private boolean status;

    public Alarm() {
        this.setStatus(false);
        alarmList.add(this);
        this.setId(alarmList.indexOf(this));
    }

    public static ArrayList<Alarm> getAlarmList() {
        return alarmList;
    }

    public static void removeAlarm(Alarm alarm) {
        alarmList.remove(alarm);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
