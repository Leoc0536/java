import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        // constants
        String space = " ";

        // ask for input
        System.out.println("Number of Rows:");
        Scanner scan = new Scanner(System.in);
        int num_of_row = scan.nextInt();
        scan.close();

        // print output
        System.out.println("=====Pattern=====");
        for(int i=1; i<=num_of_row; i++){
            String s = "";
            
            // add space
            for(int j=num_of_row; j>i; j--){
                s += space;
            }
            // add value
            for(int j=1; j<=i; j++){
                s += i + space;
            }
            System.out.println(s);
        }
    }
}