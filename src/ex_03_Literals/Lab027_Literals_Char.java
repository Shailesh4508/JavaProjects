package ex_03_Literals;

public class Lab027_Literals_Char {
    public static void main(String[] args) {
        //Chars -Store
        char c1 = 'A';
        //char c2 = "A"; //String - bunch of char(multiple chars)
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space


        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Shailesh" + new_line + "Singh");
        System.out.println("Shailesh" + tab_line + "Singh");
        System.out.println("Shailesh" + back_space + "Singh");
        System.out.println("Shailesh" + carriage_return + "Singh");

        char c10 = 'A';
        //ASCI, (Limited numbers) - A -65
        //UNICODE (india,japan, china) - Rupees - ₹
        char rupees = '₹';
        System.out.println("Shailesh has "+ rupees + 10);
        char my_laugh_smile = '\u1f60';
        System.out.println(my_laugh_smile);
    }
}
