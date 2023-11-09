package doctormanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {

    public static int menu() {

        System.out.println("1. Add doctor");
        System.out.println("2. Display doctor");
        System.out.println("3. Update doctor");
        System.out.println("4. Delete doctor");
        System.out.println("5. Search doctor");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkLimit();
        return choice;

    }

    public static void addDoctor(ArrayList<Doctor> list) {
        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        //check code exist or not
        if (!Validation.checkCodeExist(list, code)) {
            System.err.println("Code exist.");
            return;
        }
        System.out.print("Enter name: ");
        String name = Validation.checkInputString();
        System.out.print("Enter specialization: ");
        String specialization = Validation.checkInputString();
        System.out.print("Enter availability: ");
        int availability = Validation.checkInputInt();
        //check worker duplicate
        if (!Validation.checkDuplicate(list, code, name, specialization, availability)) {
            System.err.println("Duplicate.");
            return;
        }
        list.add(new Doctor(code, name, specialization, availability));
        System.err.println("Add successful.");
    }

    public static void updateDoctor(ArrayList<Doctor> list) {
        System.out.print("Enter code: ");
        String codeUpdate = Validation.checkInputString();
        if (Validation.checkCodeExist(list, codeUpdate)) {
            System.err.println("Not found doctor");
            return;
        }
        boolean checkExit = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(codeUpdate)) {
                checkExit = true;
                System.out.print("Enter code: ");
                String code = Validation.checkInputString();
                System.out.print("Enter name: ");
                String name = Validation.checkInputString();
                System.out.print("Enter specialization: ");
                String specialization = Validation.checkInputString();
                System.out.print("Enter availability: ");
                int availability = Validation.checkInputInt();

                list.get(i).setCode(code);
                list.get(i).setName(name);
                list.get(i).setSpecialization(specialization);
                list.get(i).setAvailability(availability);
                break;
            }
        }
            if (checkExit) {
                System.out.println("Update successful");
               
            } else {
                System.out.print("Code does not exits\nUpdate failed!\n");
               
            }

        
    }

    public static void deleteDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter code: ");
        String code = Validation.checkInputString();

        for (Doctor o : ld) {
            if (o.getCode().equals(code)) {
                ld.remove(o);
                break;
            }

        }
        System.err.println("Delete successful.");
    }
     public static void SortByCode(ArrayList<Doctor> list){
         Collections.sort(list, (Doctor o1, Doctor o2) -> o1.getCode().compareTo(o2.getCode()));
         
     }
     
    public static void Sort(ArrayList<Doctor> list){
        Collections.sort(list, (Doctor o1, Doctor o2) -> {
            if(o1.getAvailability()< o2.getAvailability()){
                
                return 1 ;
            }else
                return -1 ;
        });
        
    }

    public static void show(ArrayList<Doctor> list) {
       
        System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                "Specialization", "Availability");
        for (Object o : list) {
            System.out.println(o.toString());
            
        }

    }

    public static void searchDoctor(ArrayList<Doctor> ld) {
        System.out.print("Enter code: ");
        String code = Validation.checkInputString();
        ArrayList<Doctor> searchDoctor = new ArrayList<>();
        if (ld.isEmpty()) {
            System.err.println("List empty.");
        } else {
            for (Doctor o: ld) {
                if(o.getCode().equals(code)){
                    searchDoctor.add(o);
                }
            }
            System.out.printf("%-10s%-15s%-25s%-20s\n", "Code", "Name",
                    "Specialization", "Availability");
            for (Doctor doctor : searchDoctor) {
                System.out.printf("%-10s%-15s%-25s%-20d\n", doctor.getCode(),
                        doctor.getName(), doctor.getSpecialization(),
                        doctor.getAvailability());
            }
        }

    }

}
