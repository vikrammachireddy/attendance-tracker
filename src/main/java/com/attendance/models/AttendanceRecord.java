package com.attendance.models;

public class AttendanceRecord {

    private String date;
    private int period;
    private int subjectId;
    private String status;

    public AttendanceRecord(String date, int period, int subjectId, String status) {
        this.date = date;
        this.period = period;
        this.subjectId = subjectId;
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public int getPeriod() {
        return period;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getStatus() {
        return status;
    }
}
