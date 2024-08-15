import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World 3");
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name=sc.nextLine();
        System.out.println("Hello "+name);
        sc.close();
    }
    
}
