package ex_04_Operators;

public class Lab036_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Shailesh";
        String last_name = "Singh";
        int a =10;
        int b = 20;
        System.out.println(first_name + last_name + a + b);
        //ShaileshSingh1020  -> first operator is performed as concatenation that's why rest operation will be concatenated

        System.out.println(a + b + first_name + last_name);
        //30ShaileshSingh  -> first operator is not as concatenation that's why addition happened

        System.out.println(first_name + last_name + (a + b));
        // if you want operators to be performed as well with strings then you have to take integers values in bracket
        //ShaileshSingh30  -> first operator is performed as concatenation but BODMAS Principle says that if div,multiply,add and sub is in bracket then it will take priority for brackets values first
    }
}
