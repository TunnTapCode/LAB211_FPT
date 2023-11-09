package contactmanager;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validate {

    private static Scanner sc = new Scanner(System.in);

    public static int checkIntLimit() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < 1 || n > 4) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.out.println("Please input from 1 to 4");
                System.out.print("Enter again: ");
            }
        }
    }

    public static int checkInt() {
        while (true) {
            try {
                System.out.print("Enter ID: ");
                int n = Integer.parseInt(sc.nextLine());
                if (n < 1) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.out.println("ID is digit");
            }
        }

    }

    public static String checkString() {
        while (true) {
            String n = sc.nextLine();
            if (n.length() == 0) {
                System.out.println("Not Empty");
                System.out.print("Enter again: ");
            } else {
                return n;
            }
        }
    }

    public static String checkPhone() {
        String phone;
        while (true) {
            System.out.print("Phone: ");
            phone = sc.nextLine();
            Pattern p = Pattern.compile("^[0-9]{10}$");
            Pattern p1 = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
            Pattern p2 = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4} (x|ext)[0-9]{4}$");
            Pattern p3 = Pattern.compile("^[0-9]{3}.[0-9]{3}.[0-9]{4}$");
            Pattern p4 = Pattern.compile("^[0-9]{3} [0-9]{3} [0-9]{4}$");
            Pattern p5 = Pattern.compile("^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$");

            if (p.matcher(phone).find() || p1.matcher(phone).find()
                    || p2.matcher(phone).find() || p3.matcher(phone).find()
                    || p4.matcher(phone).find() || p5.matcher(phone).find()) {
                return phone;
            } else {
                System.out.println("Please input Phone flow");
            }
            System.out.printf("123456780\n123-456-7890\n123-456-7890 x1234\n");
            System.out.printf("123-456-7890 ext1234\n(123)-456-7890\n123.456.7890\n123 456 789\n");
        }

    }

}
