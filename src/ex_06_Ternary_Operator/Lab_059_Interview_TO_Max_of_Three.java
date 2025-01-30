package ex_06_Ternary_Operator;

public class Lab_059_Interview_TO_Max_of_Three {
    public static void main(String[] args) {
        // Finding the Largest Number: N1, N2, N3 => max(N1, N2, N3)

        //Step 1 : Find inputs/ outputs
        // N1, N2, N3 -> data type -> int
        // o/p -> int
        // 23, 34, 10 -> 34

        // Step 2: Rough Logic
//        N1 >= N2 -> Y1 : N1
//        Y1 -> N1 >= N3 : Y(N1) : N(N3)
//        N1 -> N2 > N3 : Y(N2) : N(N3)

        int n1 = 23, n2 =34 ,n3 = 10;
        int largest = (n1 >= n2)? ((n1 >= n3)? n1 :n3) : ((n2 >= n3)? n2 : n3);
        System.out.println("Largest Number:" + largest);
    }
}
