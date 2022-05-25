import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digits = 0 , temp =0;
        double arm=0;
        temp = num;
        while(num>0){
            temp /=10;
            digits ++;
        }
        temp = num;
        for(int i = 1; i < digits; i ++){
        temp = num%10;
        arm = arm + Math.pow(temp,digits);
        temp/=10;
        }
        if(arm == num)
            System.out.println("It is armstrong number");
        else
            System.out.println("It is not an armstrong number");
    }
}
