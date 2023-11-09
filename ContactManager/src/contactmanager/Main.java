/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanager;

public class Main {
    public static int menu(){
        System.out.println("========== Contact Program ==========");
        System.out.println("1. Add a Contact.");
        System.out.println("2. Display all Contact.  ");
        System.out.println("3. Delete a Contact.");
        System.out.println("4. Exit\n");
        System.out.print("Please enter your choice: ");
        int choice = validate.checkIntLimit();
        return choice;
    }
    public static void main(String[] args) {
        int check = 0;
        while (check != 1) {
            int choice = menu();
            switch (choice) {
                case 1:
                    Manager.addContact();
                    break;
                case 2:
                    Manager.display();
                    break;
                case 3:
                    Manager.deleteContact();
                    break;
                case 4:
                   check = 1 ;
                   
            }
        }
    }
    
}
