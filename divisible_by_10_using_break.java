import java.util.Scanner;

public class divisible_by_10_using_break{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Enter the number"  );
            int n = scn.nextInt();
            if(n % 10 ==0){
                break;

            }
            System.out.println(n);
        }while(true);
        scn.close();
    }   
}      
        
    
