package TASK_PRACTISE_CODE_29_Jan;

import java.util.Scanner;

public class P_004_Task4_Vowel_Consonant {
    public static void main(String[] args) {

        // Check if a Character is a Vowel or Consonant.

        int vCount = 0;
        int cCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any characters: ");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));
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
