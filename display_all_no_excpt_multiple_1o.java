import java.util.Scanner;

public class display_all_no_excpt_multiple_1o {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            int n = scn.nextInt();
            if(n%10==0){
                continue;

            
            }
            System.out.println(n);
        }while(true);
       //scn.close();
    }

    //scn.close();
}
