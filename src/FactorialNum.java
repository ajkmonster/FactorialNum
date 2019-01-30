import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args){
        int i;
        int sum=1;
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter a number from 1-100: ");
        i = key.nextInt();
        for (int j=i;j>=1;j--){
            sum = sum* j;
        }
        System.out.println("Factorial from " +i+ "-1 is: "+ sum);
    }
}
