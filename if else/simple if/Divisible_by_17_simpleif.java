import java.util.Scanner;
public class Divisible_by_17_simpleif {
     public static void main(String[] args) {
        int a;
        Scanner in= new Scanner(System.in);
         System.out.println("Enter a");
         a=in.nextInt();
        if(a%17==0)
        System.out.println(a+ "is divisible by 17");
    }
}

