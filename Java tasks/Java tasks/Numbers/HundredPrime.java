public class HundredPrime {
    public static void main(String[] args) {
        int count =0;
        int num =1,i=1;
        while(num<=100){
            for(int j = 1 ; j<=i ; j++){
                if(i%j==0)
                    count ++;
            }
            if(count == 2){
                System.out.println(i);
                num++;
            }
            count = 0;
            i++;
        }

    }
}
