public class CharArray {
    public static void main(String[] args) {
        char[] letter = {'a','b','c','d','e','f'};
        String sen = new String();
        for(int i = 0; i < letter.length ; i++){
            sen = sen + letter[i];
        }
        System.out.println(sen);
    }
}
