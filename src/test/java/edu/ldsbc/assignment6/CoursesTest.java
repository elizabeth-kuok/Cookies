package edu.ldsbc.assignment6;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalTime;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class CoursesTest extends TestCase{
    @Test
        public void testSearchByName(){
            char[] days = {'M', 'T', 'W', 'T', 'F'};
            char[] section = {'A', 'A'};
            CourseOffering course1 = new CourseOffering(
                    1,
                    "Astronomy",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            CourseOffering course2 = new CourseOffering(
                    2,
                    "Java",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            CourseOffering course3 = new CourseOffering(
                    3,
                    "C++",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            CourseOffering course4 = new CourseOffering(
                    4,
                    "Physics",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            ArrayList<CourseOffering> courseList = new ArrayList<>();
            courseList.add(course1);
            courseList.add(course2);
            courseList.add(course3);
            courseList.add(course4);

            Courses courses = new Courses(courseList);

            try {
                CourseOffering foundCourse = courses.searchByName("Java");
                System.out.println(foundCourse);
                assertEquals(foundCourse, course2);
            }
            catch (NotFoundException ex) {
                System.out.println(ex);
            }

            try {
                CourseOffering foundCourse = courses.searchByName("asdf");
                System.out.println(foundCourse);
                assertEquals(foundCourse, course2);
            }
            catch (NotFoundException ex) {
                System.out.println(ex);
            }
    }

    @Test
    public void searchByNumber(){

            char[] days = {'M', 'T', 'W', 'T', 'F'};
            char[] section = {'A', 'A'};
            CourseOffering course1 = new CourseOffering(
                    1,
                    "Astronomy",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            CourseOffering course2 = new CourseOffering(
                    2,
                    "Java",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            CourseOffering course3 = new CourseOffering(
                    3,
                    "C++",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            CourseOffering course4 = new CourseOffering(
                    4,
                    "Physics",
                    "",
                    section,
                    "",
                    LocalTime.now(),
                    days,
                    0
            );

            ArrayList<CourseOffering> courseList = new ArrayList<>();
            courseList.add(course1);
            courseList.add(course2);
            courseList.add(course3);
            courseList.add(course4);

            Courses courses = new Courses(courseList);

            try {
                CourseOffering foundCourse = courses.searchByNumber(2);
                System.out.println(foundCourse);
                assertEquals(foundCourse, course2);
            }
            catch (NotFoundException ex) {
                System.out.println(ex);
            }

            try {
                CourseOffering foundCourse = courses.searchByNumber(99);
                System.out.println(foundCourse);
                assertEquals(foundCourse, course2);
            }
            catch (NotFoundException ex) {
                System.out.println(ex);
            }
        }
}