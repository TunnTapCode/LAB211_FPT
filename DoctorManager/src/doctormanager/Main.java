/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctormanager;

import java.util.ArrayList;


public class Main {
     public static void main(String[] args) {
        ArrayList<Doctor> ld = new ArrayList<>();
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addDoctor(ld);
                    break;
                case 2:
                    Manager.show(ld);
                    break;
                case 3:
                    Manager.updateDoctor(ld);
                    break;
                case 4:
                    Manager.deleteDoctor(ld);
                    break;
                case 5:
                    Manager.searchDoctor(ld);
                    break;
                case 6:
                    return;
            }

        }

    }
    
    
}
