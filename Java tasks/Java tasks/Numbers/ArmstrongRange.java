import java.util.Scanner;
import  java.lang.Math;
public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end numbers:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int digits = 0, temp;
        int arm = 0, mod;
        while(start <= end) {
            temp = start;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
            temp = start;
            for (int i = 1; i <= digits; i++) {
                mod = temp % 10;
                arm =arm + (int)Math.pow(mod, digits);
                temp /= 10;
            }
            if (arm == start)
                System.out.println(arm);
            arm=0;
            digits =0;
            start++;
        }
    }
}
