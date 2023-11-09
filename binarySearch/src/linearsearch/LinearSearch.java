
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {

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

    public static void bubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;

                }

            }
        }
    }

    static int binarySearch(int a[], int value, int l, int r) {
       while (l < r) {

        int mid = (l + r) / 2;
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] > value) {
            return binarySearch(a, value, l, mid - 1);
        } else {
            return binarySearch(a, value, mid + 1, r);
        }
    } 
       System.out.println("The value searched does not exist in the array!!!");
            return -1;
    }

    public static void display() {
        System.out.print("Enter length of array: ");
        int length = checkInt();

        int a[] = new int[length];
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            a[i] = rd.nextInt(10) + 1;
        }
        bubbleSort(a);

        System.out.print("The array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.print("Enter search value: ");
        int search = checkInt();
        int index = binarySearch(a, search, 0, length - 1);
        System.out.println("\nFound " + search + " at index: " + index);

    }

    public static void main(String[] args) {
        display();
    }
}
