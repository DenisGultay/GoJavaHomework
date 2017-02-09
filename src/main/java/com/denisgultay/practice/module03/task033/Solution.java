package com.denisgultay.practice.module03.task033;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {

    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar(2016, 9, 1);

        Course course1 = new Course();
        course1.setStartDate(calendar);
        Course course2 = new Course(calendar, "Denis");
        Course course3 = new Course("Peter", 40, "Samanta");
        Course course4 = new Course();
        course4.setName("Pavlo");
        course4.setHoursDuration(50);
        course4.setStartDate(calendar);
        Course course5 = new Course();
        course5.setStartDate(calendar);
        course5.setName("Viktor");
        course5.setHoursDuration(45);
        course5.setTeacherName("Elvira");

        Student student1 = new Student("Denis", "Gultay", 4);
        Student student2 = new Student("Andrew", new Course[]{course1, course2, course3, course4, course5});

        CollegeStudent collegeStudent1 = new CollegeStudent("KPI", 15, 1122334455L);
        CollegeStudent collegeStudent2 = new CollegeStudent("Ross", "Galler", 25);
        CollegeStudent collegeStudent3 = new CollegeStudent("Green", new Course[]{course3, course4, course5});

        SpecialStudent specialStudent1 = new SpecialStudent("Monika", "Galler", 3);
        SpecialStudent specialStudent2 = new SpecialStudent("Tribbiani", new Course[]{course1, course2});
        SpecialStudent specialStudent3 = new SpecialStudent(999888777666L);


    }


}


