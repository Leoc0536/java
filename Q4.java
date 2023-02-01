import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void equalPair(int target, List<Integer> list){
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(list.get(i) + list.get(j) == target){
                    System.out.println(list.get(i) + " + " + list.get(j) + " = " + target);
                    list.remove(j);
                }
            }
        }
    }
    public static void main(String[] args){
        System.out.println("Enter the target value:");
        Scanner scan = new Scanner(System.in);
        int target = scan.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        
        System.out.println("=====Array With " + target +" Items=====");
        for(int i=0;i<6;i++){
            System.out.println("Enter " + i + " Integer:");
            int num = scan.nextInt();
            l.add(num);
        }
        scan.close();       
        System.out.println("=====Addition of Items Equal to " + target + " =====");
        equalPair(target, l);
    }
}
