package com.attendance.models;

public class TimetableEntry {

    private int period;
    private String time;
    private int subjectId;

    public TimetableEntry(int period, String time, int subjectId) {
        this.period = period;
        this.time = time;
        this.subjectId = subjectId;
    }

    public int getPeriod() {
        return period;
    }

    public String getTime() {
        return time;
    }

    public int getSubjectId() {
        return subjectId;
    }
}
