package March_18_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6_Replace_element {
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
        System.out.println("enter the index to replace ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(index>=0 && index< arrayList.size()){
            System.out.println("enter the element that you want to insert");
            String newElement = scanner.nextLine();
            arrayList.set(index , newElement);
            System.out.println("element at position " + index + " replace with : " + newElement);
        }else {
            System.out.println("index not found ");
        }
        System.out.println("undated arraylist :" + arrayList);

    }

}
