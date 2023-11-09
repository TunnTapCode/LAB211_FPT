
package J1.S.P0068;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortStudent {

    private static Scanner sc = new Scanner(System.in);
    public static List<Person> list = new ArrayList<>();

    public static float checkFloat() {
        while (true) {
            try {
                float n = Float.parseFloat(sc.nextLine());
                if (n < 0) {
                    throw new NumberFormatException();
                } else {
                    return n;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter positive number");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkString() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 0) {
                System.out.println("Not empty.");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    private static boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.print("Enter again: ");
        }
    }

    public static void createStudent() {
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = checkString();
        System.out.print("Classe: ");
        String classes = checkString();
        System.out.print("Mark: ");
        float mark = checkFloat();
        list.add(new Person(name, mark, classes));

    }

    public static void sortByName() {
        Collections.sort(list, (Person o1, Person o2) -> o1.getName().compareTo(o2.getName()));
    }

    public static void display() {
        System.out.println("========= Collection Sort Program ========");
        createStudent();
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (checkInputYN()) {
                createStudent();
            } else {
                break;
            }
        }
        if (list.isEmpty()) {
            System.out.println("Not Empty");
            return;
        }
        sortByName();
        for (int i = 0; i < list.size(); i++) {
            System.out.println("----------- " + "Student " + (i + 1) + " ------------ ");
            System.out.println("Name: " + list.get(i).getName());
            System.out.println("Classes: " + list.get(i).getClasses());
            System.out.println("Mark: " + list.get(i).getMark());
        }

    }

    public static void main(String[] args) {
        display();

    }

}
