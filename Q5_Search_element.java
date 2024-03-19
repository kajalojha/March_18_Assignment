package March_18_Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5_Search_element
{
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the element that you want treo insert in list");
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
        System.out.println("enter the element to search");
        String elementtoSearch = scanner.nextLine();
        int index = arrayList.indexOf(elementtoSearch);
        if(index != -1){
            System.out.println("element " + elementtoSearch + "is present at index  " + index);
        }else{
            System.out.println("element " + elementtoSearch + " is not found ");
        }
    }
}
