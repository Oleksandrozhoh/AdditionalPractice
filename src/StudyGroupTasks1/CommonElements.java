package StudyGroupTasks1;

import java.util.ArrayList;
import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of the 1st array:");
        int [] arr1 = new int[scan.nextInt()];
        System.out.println("Enter the length of the 2nd array:");
        int [] arr2 = new int[scan.nextInt()];


        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the "+(i+1)+" element of the 1st array:");
            arr1[i]=scan.nextInt();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter the "+(i+1)+" element of the 2nd array:");
            arr2[i]=scan.nextInt();
        }

        ArrayList<Integer> commonElements = new ArrayList<>();

        for (int eachArr1 : arr1) {
            for (int eachArr2 : arr2) {
                if (eachArr1 == eachArr2){
                    if (!commonElements.contains(eachArr1)){
                        commonElements.add(eachArr1);
                    }
                }
            }
        }

        System.out.println(commonElements);

    }
}
