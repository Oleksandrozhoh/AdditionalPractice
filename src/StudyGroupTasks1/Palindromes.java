package StudyGroupTasks1;

import java.util.Scanner;
public class Palindromes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the array length below:");
        String [] arr = new String[scan.nextInt()];

        String reversed = "";
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter string below:");
            arr[i] = scan.next();
        }

        for (String each : arr) {
            reversed = "";
            for (int i = each.length()-1; i >= 0; i--) {
                reversed += each.charAt(i);
            }
            if (each.equalsIgnoreCase(reversed)){
                count++;
            }
        }


        System.out.println(count);



    }
}
