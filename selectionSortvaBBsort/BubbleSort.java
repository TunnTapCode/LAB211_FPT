/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionSort;

import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

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
            a[i] = rd.nextInt(10) + 1;
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
        BubbleSort(a);

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

    public static void BubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                }

            }

        }

    }
    public static void main(String[] args) {
        display();
    }
}
