package taskmanager;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {

    private static Scanner sc = new Scanner(System.in);
    private static Pattern p = Pattern.compile("^[0-9]{1,2}\\.5|[0-9]{1,2}$");

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

    public static String checkFrom() {
        while (true) {
            System.out.print("From: ");
            String n = checkString();
            if (p.matcher(n).find() && Double.parseDouble(n) >= 8
                    && Double.parseDouble(n) <= 17.5) {
                return n;
            } else {
            }
        }
    }

    public static String checkTo(String from) {
        while (true) {
            System.out.print("To: ");
            String to = checkString();
            if (p.matcher(to).find() && Double.parseDouble(to) >= 8
                    && Double.parseDouble(to) <= 17.5) {
                if (Double.parseDouble(to) > Double.parseDouble(from)) {
                    return to ;
                }
            }else {
            }
                
        }
    }

    public static String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date;
        sdf.setLenient(false);
        while (true) {
            try {
                System.out.print("Date: ");
                date = sdf.parse(sc.nextLine());
                Date now = new Date();
                if (date.after(now)) {
                    System.out.println("Date invalid !");
                    continue;
                }
                break;
            } catch (ParseException e) {
                System.out.println("Date invalid !");
            }
        }
        return sdf.format(date);
    }

    public static int checkInt() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < 1) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException ex) {
                System.out.println("Please enter number");
                System.out.print("Enter again: ");
            }
        }

    }

    public static String getType() {
        int n = checkIntLimit();
        switch (n) {
            case 1:
                return "Code";
            case 2:
                return "Test";
            case 3:
                return "Design";
            case 4:
                return "Review";
        }
        return "";

    }
}
