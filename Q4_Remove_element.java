package March_18_Assignment;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Q4_Remove_element {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the element that you want to insert in list");
        while(true){
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("done")){
                break;
            }
            arrayList.add(input);
        }
        for(String input : arrayList){
            System.out.println(input);
        }
        System.out.println("enter the index to remove");
        int indextoRemove = scanner.nextInt();
        scanner.nextLine();
        if(indextoRemove>=0 && indextoRemove< arrayList.size()){
             arrayList.remove(indextoRemove);
            System.out.println("element at index "+ indextoRemove + " removed ");
        }else{
            System.out.println("invalid index ");
        }
        System.out.println("updated arraylist :" + arrayList);
    }
}
