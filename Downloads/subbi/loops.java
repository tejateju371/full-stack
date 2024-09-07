
import java.util.Scanner;

class Animal{
String name=" ranbir";
 public static void hello(){
        System.out.println("Ranbir is animal");
    }
public void move() {
    // TODO Auto-generated method stub
    System.out.println("ranbir is killing herer");
}
 } 
public class loops{
    public static void  main(String[] args) {
         int a,b,c;
         

        int n=5 ;  
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*"+"");
            }
            System.out.println();

        }
        Animal ran=new Animal(); 
       System.out.println( ran.name);
       Animal.hello();
         ran.move();




    }
}