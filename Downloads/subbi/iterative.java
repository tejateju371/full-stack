import java.util.*;
public class iterative {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        Scanner sc2=new Scanner(System.in);

        int num2= sc2.nextInt();


        while( true){
            System.out.println("prees 1 for addition 2 for multiplication 3 for division");
         int operation = sc.nextInt();
         switch (operation) {
            case 1: System.out.println(num1+num2);
             break;
             case 2: System.out.println(num1*num2);
             break;
             case 3:System.err.println(num1/num2);
             default: System.out.println("enter a valid option ");
         }


        }
        
    }

    
}
