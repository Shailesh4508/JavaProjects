package ex_05_Type_Casting;

public class Lab051_Type_Casting_Narrowing {
    public static void main(String[] args) {
        int val = 200;
//        byte b = val; //Invalid  - Implicit Casting narrowing is not possible
        byte b = (byte) val; //Valid -> Explicit Casting -- allowed, but it will be overflow
        //data loss;

    }
}
