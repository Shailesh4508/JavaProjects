package ex_16_Arrays;

public class Lab138_Array_Maximum_Value {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        //Maximum Number
        int max_output = give_max(array);
        System.out.println(max_output);

        //Minimum Number
        int min_output = give_min(array);
        System.out.println(min_output);

    }

    //Logic Building for maximum Number//
    static int give_max(int[] array){
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    static int give_min (int[] array){
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }

        }

        return min;
    }
}
