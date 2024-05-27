import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = scn.nextInt();
        System.out.println("Enter value of b");
        int b = scn.nextInt();
        System.out.println("Enter operator ");
        char operator = scn.next().charAt(0);
        switch(operator){
            case '+': System.out.println(a+b);
                        break;
            case '-': System.out.println(a-b);
                        break;
            case '*': System.out.println(a*b);
                        break;
            case '/': System.out.println(a/b);
                        break;
            case '%': System.out.println(a%b);
                        break;
            default: System.out.println("Wrong operator");
                        break;
                       

            
        }
        scn.close();
    }
}
