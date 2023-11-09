
package POO53;

import java.util.Scanner;


public class P0053 {
    
    private static final Scanner sc = new Scanner(System.in);
    
     public static int menu() {
      
        System.out.println("=======Bubble Sort program======");
        System.out.println("1.Input Element");
        System.out.println("2.Sort Ascending");
        System.out.println("3.Sort Descending");
        System.out.println("4.Exit\n");
        System.out.print("Please choice one option: ");
        int choice = checkInputLimit();
        return choice ;
        
            
    }
        
    public static int checkInputLimit(){
        while (true)
            try {
                int n = Integer.parseInt(sc.nextLine());
                if(n < 1 || n > 4){
                    throw new NumberFormatException();
                }
                return n ;
            }catch(NumberFormatException e){
                System.err.println("Please enter 1-4 !!! ");
                System.out.print("Enter again: ");
                
            }
    }
    
    public static int checkInt() {
        int n;
        while (true) {
            try {
                n = Integer.parseInt(sc.nextLine().trim());
                return n;
            } catch (NumberFormatException e) {
                System.err.println("Please input number!");
                System.out.print("Enter again: ");
            }
        }

    }
    public static int chekSize() {
        System.out.println("Input Length Of Arrays");
        System.out.print("Enter number: ");
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number greater than zero.");
                System.out.print("Enter again: ");
            }
        }
    }
    public static int[] inputValueOfArray() {
        int n = chekSize();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ":");
            a[i] = checkInt();

        }
        return a;
    }
    public static void sortAscending(int[] a) {
        int len = a.length;
        int temp = a[0];
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (a[j] > a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

        }
        System.out.println("-----Ascending-----");
        for (int i = 0; i < len; i++) {
           if (i == len - 1) {
                System.out.println("[" + a[i] + "]");
                break ;
            } else {
                System.out.print("[" + a[i] + "]-> ");
            }
        }
  }

    public static void sortDescending(int[] a) {
        int len = a.length;
        int temp = a[0];
        for (int i = 0; i < len-1; i++) {
            for (int j = 0; j < len-i-1; j++) {
                if (a[j] < a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("-----Descending-----");
        for (int i = 0; i < len; i++) {
           if (i == len  - 1) {
                System.out.println("[" + a[i] + "]");
                break ;
            } else {
                System.out.print("[" + a[i] + "]<- ");
            }
        }
   }

    public static void main(String[] args) {
        int []a = new int [0];
        while (true){
            int choice = menu();
            switch(choice){
                case 1:
                  a = inputValueOfArray();
                   break ;
                case 2 :
                    sortAscending(a);
                    break ;
                case 3 :
                    sortDescending(a);
                    break ;
                case 4:
                    return ;
                    
            }
                
        }
                
            
    }


    
}
