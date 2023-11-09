package taskmanager;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static int menu() {
        System.out.println("========== Task Program ==========");
        System.out.println("1. Add task.");
        System.out.println("2. Delete task. ");
        System.out.println("3. Display task.");
        System.out.println("4. Exit\n");
        System.out.print("Please enter your choice: ");
        int choice = Validate.checkIntLimit();
        return choice;
    }

    public static void main(String[] args) {
        int check = 0;
        while (check != 1) {
            int choice = menu();
            switch (choice) {
                case 1:
                    Manager.addTask();
                    break;
                case 2:
                    Manager.deleteTask();
                    break;
                case 3:
                    Manager.getDataTask();
                    break;
                case 4:
                   check = 1 ;
                   
            }
        }
    }

}
