import java.util.Scanner;
class Pass_or_fail{
    public static void main(String[] args) {
        int marks;
        Scanner in= new Scanner(System.in);
         System.out.println("Enter marks");
         marks=in.nextInt();
         if(marks>=50)
            System.out.println("PASS ");
        else
            System.out.println("FAIL ");
    }

}