import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}

