package campaign;

import java.util.ArrayList;

class Display {
    void displayAmount(ArrayList<Module> arr){
        int total=0;
        for(int i =0 ; i<arr.size();i++)
            total +=arr.get(i).getAmount();
        System.out.println("Total amount = "+total);
    }
    void displayTotalPeople(ArrayList<Module> arr){
        int noOfPeople=arr.size();
        System.out.println("Total Number of people = "+noOfPeople);
    }
    void highestAmountPaid(ArrayList<Module> arr){
        int highAmount =arr.get(0).getAmount();
        String name="";
        for(int i =0;i< arr.size();i++){
            if(highAmount<arr.get(i).getAmount())
                highAmount = arr.get(i).getAmount();
            if(highAmount == arr.get(i).getAmount()){
                name = arr.get(i).getName();
            }
        }
        System.out.println("Highest amount deposited = "+highAmount+ " by " + name);
    }
    void attendence(ArrayList<Module> arr){
        System.out.println("Members who participated are:");
        for(int i =0 ; i<arr.size(); i++)
            System.out.println(arr.get(i).getName());
    }
    void contactInfo(ArrayList<Module> arr){
        for (int i = 0 ; i<arr.size();i++)
            System.out.println("Name: "+ arr.get(i).getName()
                                + " Location: " +arr.get(i).getAddress()
                                + " Mobile: " + arr.get(i).getMobile());
    }
}
