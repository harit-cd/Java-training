public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,6,5,7};
        int temp;
        for(int i = 0; i < arr.length ; i++){
            for(int j =0 ; j < arr.length ; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i =0 ; i<arr.length ; i ++)
            System.out.println(arr[i]);
    }
}
