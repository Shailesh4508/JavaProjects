package ex_15_String_Functions;

public class Lab133_String_Builder {
    public static void main(String[] args) {


        // String - > 90%
        // StringBuilder -> 5-7% (Thread safety - we avoid it)
        // ThreadLocal -> Multi Threading ->


        StringBuffer stringBuffer = new StringBuffer("Shailesh");
        stringBuffer.append("Singh");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Shailesh");
        stringBuilder.append("Thakur");
        System.out.println(stringBuilder);

        stringBuilder.append(" World!"); // Modifies sb to "Hello World!"
        System.out.println(stringBuilder); // Output: Hello World!


        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

    }
}
