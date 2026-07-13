import java.util.*;
public class rectangle {
    int l,b;
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle(5,10);
        r1.display();
        r2.display();
        sc.close();
    }
    rectangle(){
        System.out.println("enter length and breadth");
        l=sc.nextInt();
        b=sc.nextInt();
    }
    rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    void display(){
        System.out.println("Length: "+l);
        System.out.println("Breadth: "+b);
        System.out.println("Area: "+(l*b));
    }

    
}
