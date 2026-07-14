import java.util.*;
class rock{
    public static void main(String args[]){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        c=a+b;
        System.out.println("Sum: " +c);
        sc.close();
    }
}