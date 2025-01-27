package ex_05_Type_Casting;

public class Lab052_Type_Casting {
    public static void main(String[] args) {
        long phone_no = 9930734508L;
        //short s = phone_no; //Implicit --Not possible
        short s = (short) phone_no; // Explicit ---possible

    }
}
