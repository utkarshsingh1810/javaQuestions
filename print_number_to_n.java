import java.util.Scanner;

public class print_number_to_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your range");
        int n = scn.nextInt();
        int counter = 0;
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
        scn.close();
    }
        
       
}
