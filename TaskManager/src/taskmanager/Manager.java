package taskmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Manager {

    public static ArrayList<Task> list = new ArrayList<>();

    public static void addTask() {
        int id = 1;
        if (!list.isEmpty()) {
            id = list.get(list.size() - 1).getId() + 1;
        }
        System.out.print("Requirement Name: ");
        String name = Validate.checkString();
        System.out.print("Task Type: ");
        String taskTypeId = Validate.getType();
        String date = Validate.getDate();
        String from = Validate.checkFrom();
        String to = Validate.checkTo(from);
        for (Task o : list) {
            if (date.equals(o.getDate())) {
                while (true) {
                        if (Double.parseDouble(from) > Double.parseDouble(o.getTo()) && Double.parseDouble(to) >= Double.parseDouble(o.getTo())) {
                            break;
                        } else if (Double.parseDouble(from) <= Double.parseDouble(o.getFrom()) && Double.parseDouble(to) < Double.parseDouble(o.getFrom())) {
                            break;
                        } else {
                            System.out.println("Please enter trung thoi diem");
                            from = Validate.checkFrom();
                            to = Validate.checkTo(from);
                        }
                    }
            } else {
                break;
            }
        }
        System.out.print("Assignee: ");
        String assignee = Validate.checkString();
        System.out.print("Reviewer: ");
        String reviewer = Validate.checkString();

        list.add(new Task(id, name, taskTypeId, date, from, to, assignee, reviewer));
        System.out.println("Add successful.");

    }

    public static void getDataTask() {
        System.out.println("------------------------------------------- TASK ---------------------------------------------");
        System.out.println("ID\tNAME\t\tTASK TYPE\tDATE \t\tTIME\t\tASSIGNEE\tREVIEWER");
//        sortTime();
        for (Task o : list) {
            double time = Double.parseDouble(o.getTo()) - Double.parseDouble(o.getFrom());
            System.out.println(o.getId() + "\t" + o.getName() + "\t\t" + o.getTaskTypeId()
                    + "\t\t" + o.getDate() + "\t" + time
                    + "\t\t" + o.getAssign() + "\t\t" + o.getReviewer());
        }
    }

//    public static void sortTime() {
//        Collections.sort(list, (Task o1, Task o2) -> {
//            double time1 = Double.parseDouble(o1.getTo()) - Double.parseDouble(o1.getFrom());
//            double time2 = Double.parseDouble(o2.getTo()) - Double.parseDouble(o2.getFrom());
//            if (time1 > time2) {
//                return 1;
//            } else {
//                return -1;
//            }
//        });
//    }

    /*
    public static void searchByName(){                      //  tìm kiếm theo tên có thể tìm 1 kí tự trong tên hoặc tất cả
        System.out.print("Enter name search: ");
        String name = Validate.checkString();
        ArrayList<Task> ls = new ArrayList<>();
        for (Task o : list) {
            if(o.getName().contains(name)){
                ls.add(o);
            }
        }
        System.out.println("------------------------------------------- TASK ---------------------------------------------");
        System.out.println("ID\tNAME\t\tTASK TYPE\tDATE \t\tTIME\t\tASSIGNEE\tREVIEWER");
        sortTime();
        for (Task o: ls) {
            System.out.println(o.getId()+"\t"+ o.getName()+"\t\t"+ o.getTaskTypeId()+
                    "\t\t"+ o.getDate()+"\t"+(o.getTo()-o.getFrom())+
                    "\t\t"+ o.getAssign()+"\t\t"+o.getReviewer());
        }
        
        
    }
    
    public static void UpdateById() {    // sửa thông tin task theo id nhập vào 
        boolean check = false;
        System.out.print("Enter Id Update: ");
        int id = Validate.checkInt();
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getId() == id) {
                check = true;
                System.out.print("Requirement Name: ");
                String name = Validate.checkString();
                System.out.print("Task Type: ");
                String taskTypeId = Validate.getType();
                String date = Validate.getDate();
                double from = Validate.checkFrom();
                double to = Validate.checkTo(from);
                System.out.print("Assignee: ");
                String assignee = Validate.checkString();
                System.out.print("Reviewer: ");
                String reviewer = Validate.checkString();
                 list.get(i).setId(id);
                 list.get(i).setAssign(assignee);
                 list.get(i).setDate(date);
                 list.get(i).setFrom(from);
                 list.get(i).setName(name);
                 list.get(i).setReviewer(reviewer);
                 list.get(i).setTo(to);
                 list.get(i).setTaskTypeId(taskTypeId);
                 
            }if(check){
                System.out.println("");
                System.out.println("Update successful.");
            }else
                System.out.println("Not found ID need update");
        }
    }
     */
    public static void deleteTask() {
        boolean check = false;
        System.out.print("Enter ID delete: ");
        int id = Validate.checkInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                check = true;
                list.remove(i);
                for (int j = id - 1; j < list.size(); j++) {
                    list.get(j).setId(list.get(j).getId() - 1);
                }
            }
        }
        if (check) {
            System.out.println("");
            System.out.println("Delete successful.");
        } else {
            System.out.println("Not found ID need delete");
        }
    }

}
