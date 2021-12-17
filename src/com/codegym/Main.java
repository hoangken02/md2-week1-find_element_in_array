package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String studentName;
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExit = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name’s student:");
        studentName = scanner.nextLine();

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(studentName)){
                System.out.println("Position of the students in the list " + studentName + " is: " + i);
                isExit = true;
                break;
            }
        }

        if (!isExit){
            System.out.println("Not found" + studentName + " in the list.");

        }

    }
}
