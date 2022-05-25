package campaign;

import java.util.ArrayList;
import java.util.Scanner;

class Input {

    public void getInput(ArrayList<Module> arr) {
        Scanner sc = new Scanner(System.in);
        int num = 1,amount;
        boolean opt = true;
        String name, address, mobile;
        while (opt) {
            System.out.println("Enter option: \n1.Enter value \n2.Display \n3.Exit");
            num = sc.nextInt();
            if (num == 1) {
                System.out.println("Enter Name:");
                sc.nextLine();
                name = sc.nextLine();
                System.out.println("Enter Address:");
                address = sc.nextLine();
                System.out.println("Enter Mobile:");
                mobile = sc.nextLine();
                System.out.println("Enter amount:");
                amount = sc.nextInt();
                Module mod = new Module();
                mod.setName(name);
                mod.setAddress(address);
                mod.setMobile(mobile);
                mod.setAmount(amount);
                arr.add(mod);
            }
            else if (num == 2)
                display(arr);
            else
                opt = false;
        }
    }

    void display(ArrayList<Module> arr) {
        Display dis = new Display();
        Scanner sc = new Scanner(System.in);
        boolean opt = true;
        while (opt) {
            System.out.println("Enter choice: \n1.Total amount \n2.Total no of people attended \n3.Highest amount paid"
                    + "\n4.Name of the people attended \n5.Members with contact info \n6.back ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> dis.displayAmount(arr);
                case 2 -> dis.displayTotalPeople(arr);
                case 3 -> dis.highestAmountPaid(arr);
                case 4 -> dis.attendence(arr);
                case 5 -> dis.contactInfo(arr);
                case 6 -> opt = false;
            }
        }
    }
}


