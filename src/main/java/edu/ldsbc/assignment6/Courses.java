package edu.ldsbc.assignment6;



import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Courses {
    private ArrayList<CourseOffering> courseList = new ArrayList<>();

    static final Comparator<CourseOffering> NAME_ORDER;
    static final Comparator<CourseOffering> NUMBER_ORDER;

    static {
        NAME_ORDER = new Comparator<CourseOffering>() {
            @Override
            public int compare(CourseOffering offering1, CourseOffering offering2) {
                return offering1
                        .getCourseName()
                        .compareToIgnoreCase(offering2.getCourseName());
            }
        };
        NUMBER_ORDER = new Comparator<CourseOffering>() {
            @Override
            public int compare(CourseOffering offering1, CourseOffering offering2) {
                int num1 = offering1.getCourseNumber();
                int num2 = offering2.getCourseNumber();
                if (num1 < num2) {
                    return -1;
                } else if (num1 > num2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
    }

    public Courses(ArrayList<CourseOffering> courseList) {
        this.courseList = courseList;
    }

    public CourseOffering searchByName(String searchName) throws NotFoundException {
        char[] section = {'A', 'A'};
        char[] days = {'M', 'T', 'W', 'T', 'F'};
        CourseOffering requestedCourse = new CourseOffering(0, searchName, "", section, "", LocalTime.now(), days, 0);
        int foundCourse = Collections.binarySearch(courseList, requestedCourse, Courses.NAME_ORDER);


        if (foundCourse >= 0) {
            return courseList.get(foundCourse);
        } else {
            throw new NotFoundException("Course not found");
        }



    };

    public CourseOffering searchByNumber(int searchNumber) throws NotFoundException {
        char[] section = {'A', 'A'};
        char[] days = {'M', 'T', 'W', 'T', 'F'};
        CourseOffering requestedCourse = new CourseOffering(searchNumber, "", "", section, "", LocalTime.now(), days, 0);
        int foundCourse = Collections.binarySearch(courseList, requestedCourse, Courses.NUMBER_ORDER);

        if (foundCourse >= 0) {
            return courseList.get(foundCourse);
        } else {
            throw new NotFoundException("Course not found");
        }

    }
}