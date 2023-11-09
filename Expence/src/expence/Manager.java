package expence;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Manager {

    public static List<Expence> list = new ArrayList<>();

    public static void addExpence() {

        System.out.println("=========== Add an expence ==========");
        int id = 1;
        if (!list.isEmpty()) {

            id = list.size() + 1;

        }
        Date dateInput = Validate.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        String date = sdf.format(dateInput);
        System.out.print("Enter amount: ");
        double amount = Validate.checkDouble();
        System.out.print("Enter content: ");
        String content = Validate.checkInputString();

        list.add(new Expence(id, date, amount, content));
    }

    public static void Display() {
        if (list.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Sort();
            Collections.reverse(list);
            System.out.println("============= Display all expence =============");
        }
        double total = 0;
        System.out.println("ID\tDate\t\t\tAount of money\t\tContent");
        for (Expence o : list) {
            System.out.println(o.getId() + "\t" + o.getDate() + "\t\t" + o.getNumber() + "\t\t\t" + o.getContent());
            total += o.getNumber();

        }

        System.out.println("Total: " + total);
    }

    public static void Sort() {
        Collections.sort(list, (Expence o1, Expence o2) -> {
            if (o1.getNumber() < o2.getNumber()) {
                return 1;
            } else {
                return -1;
            }
        });
    }

    public static void sort1() {
        Collections.sort(list, new Comparator<Expence>() {
            @Override
            public int compare(Expence o1, Expence o2) {
                return o1.getContent().compareTo(o2.getContent());
            }
        });
    }

    public static void find() {

        List<Expence> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getNumber() >= 5000) {
                l.add(list.get(i));
            }
        }

        if (l.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            Sort();
            Collections.reverse(l);
            System.out.println("============= Display all expence =============");
        }
        double total = 0;
        System.out.println("ID\tDate\t\t\tAount of money\t\tContent");
        for (Expence o : l) {
            System.out.println(o.getId() + "\t" + o.getDate() + "\t\t" + o.getNumber() + "\t\t\t" + o.getContent());
            total += o.getNumber();

        }

        System.out.println("Total: " + total);
    }

    public static void delete() {
        System.out.print("Enter ID: ");
        int id = Validate.checkInt();
        boolean check = false;
        for (Expence o : list) {
            if (o.getId() == id) {
                list.remove(o);
                check = true;
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId() > id) {
                        list.get(i).setId(list.get(i).getId() - 1);
                    }
                }
                break;
            }
        }
        if (check) {
            System.out.println("");
            System.out.println("Delete successful.");

        } else {
            System.out.println("Not Found ID need delete");
        }

    }
}
