package StudyGroupTasks1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LameDB {
    public static String lameDb(String db, String op, String id, String data) {

        String [] dbArray = db.split("#"); // creating an array by separating words with # symbol
        String result = "";
        int index = Integer.parseInt(id); // decoding id from string to int

        switch(op){ // switch statement with 3 blocks for "add" , "edit" , "delete" actions
            case "add":
                ArrayList<String> dbList = new ArrayList<>( Arrays.asList(dbArray));  // turning array into an ArrayList
                dbList.add(index-1," "+data); // using add method to add an " "+element (space -just a random symbol that is needed in front of the string below)
                //since words have index numbers in front of them I added String with space in front of it, as a placeholder, further I will re-numerate the Strings in database with loop and substring() method

                for(int i = 0; i<dbList.size(); i++){ // running loop for my array list with added element to turn it back to a string and to re-numerate the words
                    result += (i+1)+dbList.get(i).substring(1); // COncatinating index+1 to a Strings without the first letter to re-numerate it in database
                    if(i<dbList.size()-1){
                        result+="#"; // add pound symbol in between the words unless its the last word
                    }
                }
                break;

            case "edit": // new block for "edit" function same logic is the "add" block only using set() arrayList method here
                ArrayList<String> dbList1 = new ArrayList<>(Arrays.asList(dbArray));
                dbList1.set(index-1," "+data);
                for(int i = 0; i<dbList1.size(); i++){
                    result += (i+1)+dbList1.get(i).substring(1);
                    if(i<dbList1.size()-1){
                        result+="#";
                    }
                }
                break;

            case "delete": // new block for "delete" function same logic is the "add" block only using remove() arrayList method here
                ArrayList<String> dbList2 = new ArrayList<>(Arrays.asList(dbArray));
                dbList2.remove(index-1);
                for(int i = 0; i<dbList2.size(); i++){
                    result += dbList2.get(i);
                    if(i<dbList2.size()-1){
                        result+="#";
                    }
                }
                if(index == 1){
                    result = "#"+result;
                }
                break;
        }

        return result;

    }//end lameDb

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Print the following data below:\nString db, \nString op, \nString id, \nString data");
        System.out.println(lameDb(in.next(), in.next(), in.next(), in.next()));

    }

}

