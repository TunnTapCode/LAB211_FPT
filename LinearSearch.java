package linearsearch;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    private static Scanner sc = new Scanner(System.in);

    public static int checkInt() {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                if (n < 0) {
                    System.out.println("Please enter greater than 0");
                    System.out.print("Enter again: ");
                }else
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Please input number!");
                System.out.print("Enter again: ");
            }
        }
    }

    static int linearSearch(int a[], int search) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == search)
                return i;
            
        }
    //    int i = a.length -1; // i = độ dài mảng 
      //  while (i >= 0) { // điều kiện dừng vòng while           
      //      if (a[i] == search) { // duyệt từ đầu mảng tới cuối nếu từng phần tử của a[i] mà bằng với gt value cần tìm thì trả về index i ;
     //           return i; trả về vị trí i ;
     //   }
     //   i--;
//}
    //    for (int i = a.length - 1; i >= 0 ; i--) { // duyệt từ cuối mảng về đầu
     //     if (a[i] == search) {
              // duyệt từ đầu mảng tới cuối nếu từng phần tử của a[i] mà bằng với gt value cần tìm thì trả về index i ;
          //     return i;
       //    }
      // }
        System.out.println("The value searched does not exist in the array!!!");
        return -1;
    }
    public static void display() {
        
        System.out.println("Enter number of array: ");
        int length = checkInt();
       

        int a[] = new int[length];
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(10);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ,");
            
        }
        System.out.println("Enter value search: ");
        int search = checkInt();
        System.out.print("The array: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int index = linearSearch(a, search);
        System.out.println("Found " + search + " at index : " + index);

    }

    public static void main(String[] args) {
        display();
    }

}
