package slip10;

import java.util.*;
import java.io.*;

public class StudentInfo {
    int rollno;
    String name;
    int classs;
    float per;

    public StudentInfo(int rollno, String name, int classs, float per) {
        this.rollno = rollno;
        this.name = name;
        this.classs = classs;
        this.per = per;
    }

    public void display() {
        System.out.println("Roll no:" + rollno);
        System.out.println("Name:" + name);
        System.out.println("classs:" + classs);
        System.out.println("per:" + per);
    }
}

class Studentper {

    public static float percentage(int total) {
    	 return total / 6.0f ;
    }
}

class stud {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no");
        int rollno = sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter class");
        int classs = sc.nextInt();
        System.out.println("Enter the marks of 6 subjects out off 100");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        int m6 = sc.nextInt();
        int total = m1 + m2 + m3 + m4 + m5 + m6;
        float percent = Studentper.percentage(total); // Corrected here
        StudentInfo su = new StudentInfo(rollno, name, classs, percent);
        su.display();
    }
}