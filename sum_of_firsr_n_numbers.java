import java.util.Scanner;

public class sum_of_firsr_n_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum+=i;
            //System.out.println("The sum of n natural number is " + sum);
            i++;
        }
        System.out.println("The sum of n natural number is " + sum);
        scn.close();

    }
        
}
