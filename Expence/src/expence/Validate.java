package expence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Validate {

    private static Scanner sc = new Scanner(System.in);

    public static int checkIntLimit() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < 1 || n > 5) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.err.println("Please input from 1 to 5");
                System.out.println("Enter again: ");
            }
        }
    }

    public static double checkDouble() {
        while (true) {
            try {
                double n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (NumberFormatException ex) {
                System.err.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.length() == 0) {
                System.err.println("Enter again: ");
            } else {
                return result;
            }

        }
    }

    public static int checkInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Enter again: ");
            }
        }
    }

    public static Date getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = null;
        sdf.setLenient(false);// check ngay hợp lí
        while (true) {
            try {
                System.out.print("Enter Date: ");
                date = sdf.parse(sc.nextLine());
                
                Date now = new Date();// check ngày k vượt quá ngày hôm nay
                if (date.after(now)) {
                    System.out.println("date greater than today");
                    continue;
                }
                return date;
            } catch (ParseException ex) {
                System.out.println("Date Invalid");

            }

        }

    }
}
