import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int vowels =0,consonants = 0;
        for(int i =0;i<text.length();i++) {
            switch (text.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                default:
                    consonants++;
            }
        }
        System.out.println("Occurance of vowels = " + vowels);
        System.out.println("Occurance of consonants = "+ consonants);
    }
}

