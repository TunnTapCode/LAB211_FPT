package selectionSort;

import java.util.Random;
import java.util.Scanner;
// thuat toan sap xep chon
public class selectionSort {

    private static Scanner sc = new Scanner(System.in);

    public static int checkInt() {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n > 0) {
                    break;
                } else {
                    System.err.println("Please enter positive number!");
                    System.out.print("Enter again: ");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please input number!");
                System.out.print("Enter again: ");
            }
        }
        return n;
    }

    public static void display() {
        System.out.print("Enter number of array: ");
        int n = checkInt();
        int a[] = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(100) + 1;
        }
        System.out.print("Unsorted array: [");
        for (int i = 0; i < n; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("]");
        selectionSort(a);
        System.out.print("Sorted array: [");
        for (int i = 0; i < n; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        System.out.println("]");

    }

    public static void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdex]) {
                    minIdex = j;
                }
            }

            int tmp = a[minIdex];
            a[minIdex] = a[i];
            a[i] = tmp;

        }
    }

    public static void main(String[] args) {
        display();
    }

}
// vd : 
// 5 1 12 -5 16 2 12 14
//-5 1 12 5 16 2 12 14
// -5 1 12 5 16 2 12 14
// -5 1 2  5 16 12 12 14
// .....
// -5 1 2  5 12  16 12 14
// -5 1 2 5 12 12 16 14
// -5 1 2 5 12 12 14 16  
