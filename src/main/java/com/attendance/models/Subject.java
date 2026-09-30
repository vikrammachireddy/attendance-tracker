package com.attendance.models;

public class Subject {

    private int id;
    private String name;
    private String faculty;

    public Subject(int id, String name, String faculty) {
        this.id = id;
        this.name = name;
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }
}
