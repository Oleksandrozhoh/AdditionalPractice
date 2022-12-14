package StudyGroupTasks1;
import java.util.*;
public class Nanuk {
    public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {
        int catched = 0;
        for(int i = 0; i<result.size();i++){
            if( result.get(i).equals("nanuk")){
                if(wayStones >0){
                    wayStones--;
                }else{
                    return false;
                }
            } else{
                catched += Integer.parseInt(result.get(i));
            }
        }

        if(boast <= catched){
            return true;
        }else{
            return false;
        }
    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));

    }

}

