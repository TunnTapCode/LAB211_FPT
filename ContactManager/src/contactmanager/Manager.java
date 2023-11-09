package contactmanager;

import java.util.ArrayList;

public class Manager {

    private static ArrayList<Contact> list = new ArrayList<>();

    public static void addContact() {
        System.out.println("---------- Add a Contact ----------");
        int id = 1;
        if (!list.isEmpty()) {
            id = list.get(list.size() - 1).getId() + 1;
        }
        System.out.print("Enter Name: ");
        String name = validate.checkString();
        String[] a = name.split(" ");
        String firstname = a[0];
        String lastName = a[a.length - 1];
        System.out.print("Enter Group: ");
        String group = validate.checkString();
        System.out.print("Enter Address: ");
        String address = validate.checkString();
        String phone = validate.checkPhone();

        list.add(new Contact(id, name, firstname, lastName, group, address, phone));
        System.out.println("Successful.");

    }

    public static void display() {
        System.out.println("----------------------------- Display all Contact ---------------------------");
        System.out.printf("%-5s%-17s%-17s%-17s%-17s%-17s%-17s\n","Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        for (Contact o : list) {
            System.out.printf(o.toString());
        }
    }
    public static void deleteContact(){
        int id = validate.checkInt();
        boolean check = false ;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()== id){
                check = true ;
                list.remove(i);
                for (int j = id-1; j < list.size(); j++) {
                    list.get(j).setId(list.get(j).getId()-1);
                }
            }
        }
        if(check){
            System.out.println("Delete successful.");
        }else
            System.out.println("Not found ID need delete");
        
    }
}

