package March_18_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2_retrieve_element
{
    public static void main(String[] args) {
        ArrayList<String>arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the element to add to list :");
//        arrayList.add("red");
//        arrayList.add("white");
//        arrayList.add("orange");
//        arrayList.add("yellow");
//        arrayList.add("black");
        while(true){
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            arrayList.add(input);
        }
       for(String element : arrayList){
           System.out.println(element);
       }
        System.out.println("enter the index :");
        int index = scanner.nextInt();
        if(index>=0 && index< arrayList.size()){
            String element = arrayList.get(index);
            System.out.println("element " + element + " found at index "+ index);
        }
        else{
            System.out.println("index not found");
        }

    }
}
