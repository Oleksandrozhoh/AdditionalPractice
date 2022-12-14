package StudyGroupTasks1;
import java.util.*;

public class FuelReplitTask {
    public static int refuels(ArrayList<Integer> deliveries,int gasTank) {

        int fuelRemained = gasTank;
        int numberOfRefuels = 0, leftToGO=0;

        for ( int i=0; i<deliveries.size();i++){
            if(fuelRemained>deliveries.get(i)){
                fuelRemained = fuelRemained-deliveries.get(i);
                continue;
            }
            leftToGO = deliveries.get(i) - fuelRemained;
            numberOfRefuels++;
           while(leftToGO>gasTank){
               leftToGO = leftToGO-gasTank;
               numberOfRefuels++;
           }
           fuelRemained=gasTank-leftToGO;
        }
        return numberOfRefuels;
    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of deliveries:");
        int size = in.nextInt();
        System.out.println("Enter the gasTank size:");
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            System.out.println("Enter number of gallons that required to complete the delivery:");
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));

    }
}

