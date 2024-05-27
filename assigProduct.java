import java.util.Scanner;

public class assigProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write value of a");
        int a = scn.nextInt();
        System.out.println("Write value of b");
        int b = scn.nextInt();
        int pro = a*b;
        System.out.println("The product of a and b is ..");
        System.out.println(pro);
        scn.close();

    }
    
}
