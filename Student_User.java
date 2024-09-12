/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.student_user;

/**
 *
 * @author pc
 */import java.util.Scanner;
public class Student_User {
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static String university;
    private static int studentCount = 0;

    public Student_User(int id, String name, String department, double cgpa) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
        studentCount++;
    }
        public static void setUniversity(String university) {
    }
    public void displayStudentDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println();
    }
    public static void displayTotalStudents() {
        System.out.println("Total Number of Students: " + studentCount);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        System.out.print("Enter the university name: ");
        String universityInput = scanner.nextLine();
        Student_User.setUniversity(universityInput);
     
        Student_User[] students = new Student_User[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();
            scanner.nextLine(); 
            students[i] = new Student_User(id, name, department, cgpa);
        }
        for (Student_User student : students) {
            student.displayStudentDetails();
        }     
        Student_User.displayTotalStudents();
        scanner.close();
    }
}

