import java.util.Scanner;
class Simple_if_user_defined {
    public static void main(String[] args) {
        int a;
        Scanner in= new Scanner(System.in);
         System.out.println("Enter a");
         a=in.nextInt();
        if(a>0)
        System.out.println(a+ "is positive number");
    }
}
