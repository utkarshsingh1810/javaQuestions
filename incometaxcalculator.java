import java.util.Scanner;

public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your income");
        int income = scn.nextInt();
        if (income<500000){
            float tax = 0f;
            System.out.println("The tax wii be  "+ tax);

        }
        else if(income>=500000 && income<1000000){
            float tax = income*(0.2f);
            System.out.println("The tax will be  " + tax);
        }
        else{
            float tax = income*(0.3f);
            System.out.println("The tax will be  " + tax);
        }
        scn.close();

    }
}
