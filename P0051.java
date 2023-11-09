package p0051;

import java.util.Scanner;

public class P0051 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    nomalCalculator();
                    break;
                case 2:
                    calculatorBmi();
                    break;
                case 3 : 
                    return;
            }
        }

    }

    public static int menu() {
        System.out.println("======== Calculator Program ========");
        System.out.println("1.Normal Calculator");
        System.out.println("2.BMI Calculator");
        System.out.println("3.Exit\n");
        System.out.print("Please choice one option: ");
        int choice = checkIntLimit();
        return choice;
    }

    public static int checkIntLimit() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine());
                if (n < 1 || n > 3) {
                    throw new NumberFormatException();
                }
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Please enter 1-3 !!! ");
                System.out.print("Enter again: ");

            }
        }
    }

    public static double checkDoubleBmi() {
        double n;
        while (true) {
            try {
                n = Double.parseDouble(sc.nextLine());
                if(n < 0){
                    System.out.println("Please enter greater than 0");
                    System.out.print("Enter again: ");
                }else
                return n;
            } catch (NumberFormatException e) {
                System.err.println("BMI is digit");
                System.out.print("Enter again: ");
            }
        }

    }

    public static double checkDouble() {
        double n;
        while (true) {
            try {
                n = Double.parseDouble(sc.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Please input double!");
                System.out.print("Enter again: ");
            }
        }

    }

    public static String checkOperator() {
        while (true) {
            String op = sc.nextLine();
            if (op.isEmpty()) {
                System.err.println("Not empty!");
            } else if (op.equalsIgnoreCase("+") || op.equalsIgnoreCase("-")
                    || op.equalsIgnoreCase("*") || op.equalsIgnoreCase("/")
                    || op.equalsIgnoreCase("^") || op.equalsIgnoreCase("=")) {
                return op;
            } else {
                System.err.println("Please input(+, -, *, /, *, ^)");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double inputDouble() {
        System.out.print("Enter number: ");
        double num = checkDouble();
        return num;
    }

    public static void nomalCalculator() {
        System.out.print("Enter number: ");
        double memory = checkDouble();
        int check = 0;
        while (check != 1) {
            System.out.print("Enter operator: ");
            String op = checkOperator();
            switch (op) {
                case "+":
                    memory += inputDouble();
                    System.out.println("Memory: " + memory);
                    break;

                case "-": {
                    memory -= inputDouble();
                    System.out.println("Memory: " + memory);
                    break;
                }
                case "*": {
                    memory *= inputDouble();
                    System.out.println("Memory: " + memory);
                    break;
                }
                case "/": {
                    double memory1 = inputDouble();
                    if (memory1 == 0) {
                        System.out.println("If you enter 0 it will become infinity");
                        System.out.println("Memory: " + memory);
                        break ;

                    } else 
                        memory /= memory1;
                        System.out.println("Memory: " + memory);
                        break;

                }
                case "^": {
                    memory = Math.pow(memory, inputDouble());
                    System.out.println("Memory: " + memory);
                    break;
                }
                case "=": {
                    System.out.println("Result:" + memory);
                    check = 1;
                    return;

                }

            }

        }

    }

    public static void checkStatus(double bmi) {
        if (bmi < 19) {
            System.out.println("UNDER-STANDARD");
        } else if (bmi >= 19 && bmi <= 25) {
            System.out.println("STANDARD");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("OVERWEIGHT");
        } else if (bmi > 30 && bmi <= 40) {
            System.out.println("FAT-SHOULD LOSE WEIGHT");
        } else {
            System.out.println("VERY FAT-SHOULD LOSE WEIGHT IMMEDIATELY");
        }
    }

    public static void calculatorBmi() {
        System.out.print("Enter Weight(kg): ");
        double weight = checkDoubleBmi();
        System.out.print("Enter Height(cm): ");
        double height = checkDoubleBmi();
        double BMI = (weight * 10000) / (height * height);
        System.out.printf("BMI Number: %.2f\n", BMI);
        checkStatus(BMI);

    }
}
