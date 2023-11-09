package markstudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public static int checkInputMark(String nameSubject) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < 0 || result > 10) {
                    System.err.println(nameSubject + "mark must from 0 to 10 ");
                    System.out.print(nameSubject + ":");
                } else {
                    return result;
                }
            } catch (NumberFormatException e) {
                System.err.println(nameSubject + " is digit");
                System.out.print(nameSubject + ":");
            }
        }
    }

    public static boolean checkYN() {

        while (true) {
            String result = checkInputString();
            if (result.length() == 1 && result.equalsIgnoreCase("y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("n")) {
                return false;
            }

            System.out.println("Enter again: ");
        }
    }

    public static void createStudent(List<Student> ls) {
        System.out.println("========= Management Student Program ========");
        while (true) {
            System.out.print("Name: ");
            String name = checkInputString();
            System.out.print("Classes: ");
            String className = checkInputString();
            System.out.print("Maths: ");
            double math = checkInputMark("Maths");
            System.out.print("Chemistry: ");
            double chemistry = checkInputMark("Chemistry");
            System.out.print("Physics: ");
            double physics = checkInputMark("Physics");
            double average = (math + chemistry + physics) / 3;
            char type;
            if (average > 7.5) {
                type = 'A';
            } else if (average >= 6 && average <= 7.5) {
                type = 'B';
            } else if (average >= 4 && average < 6) {
                type = 'C';
            } else {
                type = 'D';
            }
            ls.add(new Student(name, className, math, physics, chemistry, average, type));
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (!checkYN()) {
                return;
            }
        }
    }

    public static void displayInfor(List<Student> ls) {
        for (int i = 0; i < ls.size(); i++) {
            System.out.println("----- Student " + (i+1) + " info -----");
            System.out.println("Name: " + ls.get(i).getName());
            System.out.println("Classes: " + ls.get(i).getClassName());
            System.out.printf("AVG: %.1f\n", ls.get(i).getAvg());
            System.out.println("Type: " + ls.get(i).getType());
        }
    }

    public static HashMap<String, Double> getPercentTypeStudent(List<Student> ls) {
        HashMap<String, Double> getPercent = new HashMap<>();
        int totalStudent = ls.size();
        double typeA = 0;
        double typeB = 0;
        double typeC = 0;
        double typeD = 0;
        for (int i = 0; i < totalStudent; i++) {
            if (ls.get(i).getType() == 'A') {
                typeA++;
            }
            if (ls.get(i).getType() == 'B') {
                typeB++;
            }
            if (ls.get(i).getType() == 'C') {
                typeC++;
            }
            if (ls.get(i).getType() == 'D') {
                typeD++;
            }
        }
        getPercent.put("A", typeA / totalStudent * 100);
        getPercent.put("B", typeB / totalStudent * 100);
        getPercent.put("C", typeC / totalStudent * 100);
        getPercent.put("D", typeD / totalStudent * 100);
        return getPercent;
    }

    public static void display() {
        List<Student> ls = new ArrayList<>();
        createStudent(ls);
        displayInfor(ls);
        HashMap<String, Double> hasmap = getPercentTypeStudent(ls);
        System.out.println("-------- Classification Info ---------");
        hasmap.forEach((key, value) -> System.out.println(key + ": " + value +"%"));

    }

    public static void main(String[] args) {
        display();
    }

}
