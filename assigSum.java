import java.util.Scanner;

public class assigSum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Write value of a");
        int a = scn.nextInt();
        System.out.println("Write value of b");
        int b = scn.nextInt();
        int sum = a+b;
        System.out.println("The sum of a abd b will be ..");
        System.out.println(sum);
        scn.close();

    }

}

