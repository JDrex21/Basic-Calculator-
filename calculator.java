import java.util.Scanner;

class Input{
    protected int i;
    protected String a;
    protected int j;
    public void value(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first Value: ");
        i = sc.nextInt();
        System.out.print("Enter the second Value: ");
        j = sc.nextInt();

        System.out.print("1. Addition(+)\n2. Substraction(-)\n3. Multiply(*)\n4. Divide(/)\nChoose the operator: ");
        a = sc.next();
        sc.close();
    }   
}

class Operator extends Input{
    public void sign(){
        value();
        switch (a) {
            case "+":
                System.out.println("The sum is: "+ (i+j));
                break;
            case "-":
                System.out.println("The substraction is: "+ (i-j));
                break;
            case "*":
                System.out.println("The multiplication is: "+ (i*j));
                break;
            case "/":
                System.out.println("The division is: "+ (i/j));
                break;
        
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

public class calculator {
    public static void main(String[] args) {
        Operator o = new Operator();
        o.sign();
    }
    
}
