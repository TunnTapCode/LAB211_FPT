
package expence;


public class Main {
    public static int menu(){
        System.out.println("===== Handy Expance Program =====");
        System.out.println("1. Add an expence");
        System.out.println("2. Dispaly all expence");
        System.out.println("3. Delete an expence");
        System.out.println("4. Find expence");
        System.out.println("5. Exit\n");
        System.out.print("Your choice: ");
        int choice = Validate.checkIntLimit();
        return choice ;
    }
    public static void main(String[] args) {
        boolean check = true;
         while (check) {
            int choice = menu();
            switch (choice) {
                case 1:
                  Manager.addExpence();
                  break ;   
                case 2:
                    Manager.sort1();
                    Manager.Display();
                    break;
                case 3:
                    Manager.delete();
                    break;
                case 4:
                    Manager.find();
                    break;
                case 5:
                    check = false ;
                    return;
            }

        }

    }
}
