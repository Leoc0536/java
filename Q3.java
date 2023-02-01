import java.util.Scanner;

public class Q3 {
    public static boolean isBinaryOrNot(int i){
        while(i != 0){
            if(i % 10 > 1){
                return false;
            }
            i /= 10;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("======Binary Number Checker======\nBinary number checking:");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        scan.close();
        System.out.println("=====Result======");
        if(isBinaryOrNot(i)){
            System.out.println(i+" is a binary number");
        }
        else{
            System.out.println(i+" is not a binary number");
        }
    }
}
