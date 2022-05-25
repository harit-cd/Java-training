import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0)
            System.out.println("Num is positive");
        else
            System.out.println("Num is negative");

    }
}
