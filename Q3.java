import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        System.out.println("======Binary Number Checker======\nBinary number checking:");
        // ask for user input
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        
        // print whether input is binary
        System.out.println("=====Result======");
        if(isBinaryOrNot(i)){
            System.out.println(i+" is a binary number");
        }
        else{
            System.out.println(i+" is not a binary number");
        }
    }
    public static boolean isBinaryOrNot(int i){
        while(i != 0){
            // check each digit backwards
            if(i % 10 > 1){
                return false;
            }
            // if last digit is 0 or 1, then check the digit before it.
            i /= 10;
        }
        return true;
    }
}
