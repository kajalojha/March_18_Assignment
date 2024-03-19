package March_18_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1_Iterate_ArrayList
{
    public static void main(String[] args) {
        ArrayList<String>arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the element to add to list");
        while(true){
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            arrayList.add(input);
        }
//iterate through arraylist using enhanced for loop
        for(String element : arrayList){
            System.out.println(element);
        }
    }
}
