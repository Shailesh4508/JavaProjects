package TASK_PRACTISE_CODE_25_Jan;

import java.util.Scanner;

public class P_002_Task2_vowels_Consonants {
    public static void main(String[] args) {
        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consonants - 4

        int vCount = 0;
        int cCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name: ");
        String name = sc.next();
       // String name = "Shailesh";// without CLI we can use this

        for (int i = 0; i < name.length(); i++)
        {
            char ch = Character.toLowerCase(name.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vCount++;
            }
            else {
                cCount++;
            }
        }

        System.out.println("Vowels Count: " +vCount);
        System.out.println("Consonants Count: " +cCount);


    }
    }