package campaign;

import java.util.ArrayList;
import java.util.Scanner;

public class   Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Disaster relief campaign: ");
        ArrayList<Module> arr = new ArrayList<>();
        Input input = new Input();
        input.getInput(arr);
        System.out.println("Thank you!");
    }
}
