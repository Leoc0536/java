import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q4 {
    public static void equalPair(int target, ArrayList<Integer> list){
        // harder approach
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<list.size();i++){
            int current_num = list.get(i);
            /* check if the index of last occurance is equal to current index 
             * check if complement value exist
             * check if key with complement value exist, add key with current value if it does not exist.
             * i.e. 2=18, while 18=2 does not exist as key value (20-18) exists, so as to prevent repeating values
            */
            if(list.lastIndexOf(target-current_num) != list.indexOf(current_num) && 
            list.indexOf(target-current_num) >= 0 && 
            !map.containsKey(target-current_num)){
                map.put(current_num, target-current_num);
            }
        }
        // print all possibility without repeating, i.e. 2=18 only, there are no 18=2.
        if(map.size()>0){
            System.out.println(map);
        }
        // print if none of the elements in the list match with others
        else{
            System.out.println("No pair adds up to target value("+ target+").");
        }
        
        /* easier approach
        int count_print = 0
        for(int i=0;i<list.length; i++){
            for(int j=i; j<list.length;j++){
                if(list[i] + list[j] == target){
                    System.out.println(list[i] + " + " + list[j] + " = " + target)
                    count_print +=1;
                }
            }
        }
        if(count_print == 0){
            System.out.println("No pair adds up to " + target);
        }
         */
        
    }
    public static void main(String[] args){
        // ask for target
        System.out.println("Enter the target value:");
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        
        // declare and initiate array
        ArrayList<Integer> l = new ArrayList<Integer>();
        System.out.println("=====Array With 6 Items=====");
        for(int i=0; i<6; i++){
            System.out.println("Enter " + (i+1) + " Integer:");
            int num = scan.nextInt();
            l.add(num);
        }
        scan.close(); 
        // result      
        System.out.println("=====Addition of Items Equal to " + target + " =====");
        equalPair(target, l);
    }
}
