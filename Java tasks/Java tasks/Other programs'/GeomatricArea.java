package com.company;

class Calcualtion{
    void shape(int side){//square
        int sArea = side * side ;
        System.out.println("Area of a square is "+sArea);
    }
    void shape(int length, int breath){//rectangle
        int rArea = length * breath;
        System.out.println("Area of a rectangle is " + rArea);
    }




}

public class GeomatricArea {
    public static void main(String[] args) {
        Calcualtion cal = new Calcualtion();
        cal.shape(4);
        cal.shape(4,5);
    }
}
