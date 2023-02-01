import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2 {
    public static boolean testEqual(List<Integer> first_l, List<Integer> second_l){
        for(int i=0;i<first_l.size();i++){
            if(first_l.get(i) != second_l.get(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("= = = = =1st Array= = = = =");
        Scanner scan = new Scanner(System.in);
        List<Integer> l_one = new ArrayList<Integer>();
        for(int i=1;i<6;i++){
            System.out.println("Enter " + i + " Integer:");
            int num = scan.nextInt();
            l_one.add(num);
        }
        
        System.out.println("=====2nd Array=====");
        List<Integer> l_two = new ArrayList<Integer>();
        for(int i=1;i<6;i++){
            System.out.println("Enter " + i + " Integer:");
            int num = scan.nextInt();
            l_two.add(num);
        }
        scan.close();       
        System.out.println("=====Result=====");
        if(testEqual(l_one, l_two)){
            System.out.println("Array: Equal");
        }
        else{
            System.out.println("Array: Not Equal");
        }
    }
}
