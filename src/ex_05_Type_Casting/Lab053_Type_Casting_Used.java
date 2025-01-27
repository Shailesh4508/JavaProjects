package ex_05_Type_Casting;

public class Lab053_Type_Casting_Used {
    public static void main(String[] args) {
        // GST - 18.45
        int course = 100;
        float GST = 18.45f;
//        int total_i = course+GST; //Narrow Implicit -- Not possible
        int total_int = course+(int) GST; //Narrow Explicit -- Possible but some data will be lost
        float total = course+GST; //Widening Implicit - possible as moving data from smaller to bigger container
        float total2 = (float) course+GST; //Widening Explicit - possible as moving data from smaller to bigger container

        System.out.println(total_int);
        System.out.println(total);
        System.out.println(total2);
    }
}
