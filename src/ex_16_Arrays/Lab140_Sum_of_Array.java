package ex_16_Arrays;

public class Lab140_Sum_of_Array {
    public static void main(String[] args) {

        int[] array = {31,42,89,41};

        int sum = 0;

//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//
//        }
//        System.out.println(sum);


        // Using for each loop ---using n
        System.out.println( "  ---- --- -- ");
        for (int n : array){
            sum  = sum+ n;
        }
        System.out.println(sum);
    }
}
