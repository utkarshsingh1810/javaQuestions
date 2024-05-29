import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scn.nextInt();

        if(n==2){
            System.out.println("n is a  prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=n-1;  i++){   // we can also use math.squart for optimum solution
                if(n%i==0){
                     isPrime= false;
    
                }
            }
            if(isPrime==true){
                System.out.println("n is a prime number");
            }
            else{
                System.out.println("n is not a  prime number");
            }
    
    
            }
   
        }


       
}
