import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        // create first array
        System.out.println("= = = = =1st Array= = = = =");
        Scanner scan = new Scanner(System.in);
        List<String> l_one = new ArrayList<String>();
        // first array input
        for(int i=1;i<6;i++){
            System.out.println("Enter " + i + " Integer:");
            String s = scan.nextLine();
            if(s == ""){
                System.out.print("Empty (or null) input provided.");
            }
            l_one.add(s);
        }

        // create second array
        System.out.println("=====2nd Array=====");
        List<String> l_two = new ArrayList<String>();
        // second array input
        for(int i=1;i<6;i++){
            System.out.println("Enter " + i + " Integer:");
            String s = scan.nextLine();
            if(s == ""){
                System.out.print("Empty (or null) input provided.");
            }
            l_two.add(s);
        }
        scan.close();   
        // print result    
        System.out.println("=====Result=====");
        if(testEqual(l_one, l_two)){
            System.out.println("Array: Equal");
        }
        else{
            System.out.println("Array: Not Equal");
        }
    }
    public static boolean testEqual(List<String> first_list, List<String> second_list){
        // check each element by looping through every index
        for(int i=0; i<first_list.size(); i++){
            if(first_list.get(i) != second_list.get(i)){
                return false;
            }
        }
        return true;
    }
}
