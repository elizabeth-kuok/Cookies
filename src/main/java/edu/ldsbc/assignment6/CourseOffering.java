package edu.ldsbc.assignment6;

import java.time.LocalTime;
import java.util.Arrays;


public class CourseOffering{

    private int courseNumber;
    private String courseName;
    private String instructor;
    private char[] section = new char[2];
    private String room;
    private LocalTime time;
    private char[] days = new char[5];
    private int capacity;

    public CourseOffering(
            int courseNumber,
            String courseName,
            String instructor,
            char[] section,
            String room,
            LocalTime time,
            char[] days,
            int capacity
    ) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.instructor = instructor;
        this.section = section;
        this.room = room;
        this.time = time;
        this.days = days;
        this.capacity = capacity;
    }

    public String getDays() {
        return new String(days);
    }

    @Override
    public String toString() {
        return "CourseOffering{" +
                "courseNumber = " + courseNumber + ',' +'\n' +
                "courseName = '" + courseName + '\'' + ',' + '\n' +
                "instructor = '" + instructor + '\'' + ',' + '\n' +
                "section = " + Arrays.toString(section) +',' + '\n' +
                "room = '" + room + '\'' + ',' + '\n' +
                "time = " + time +',' + '\n' +
                "days = " + Arrays.toString(days) + ',' + '\n' +
                "capacity = " + capacity +
                '}';
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }
}

