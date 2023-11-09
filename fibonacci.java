public class fibonacci {

    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci");
        fibonnaci(45, 1, 0);
        
    }

    public static int fibonnaci(int term, int lower, int higher) {
        if (term < 2) {
            return higher;
        }
        System.out.print(higher + " ");
        return fibonnaci(term - 1, higher, higher + lower);
        // 0 1 1 2 3 5 
        // t 44 , 0 , 1
        // 43 , 
    }

}
// 