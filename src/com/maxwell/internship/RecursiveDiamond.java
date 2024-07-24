package com.maxwell.internship;

public class RecursiveDiamond {
    public static void printDiamond(int rowNumber, int num){
        if(rowNumber == num * 2) return;
        int numberOfSpaces = 0;

        if(num < rowNumber)
            numberOfSpaces = rowNumber - num;
        else
            numberOfSpaces = num - rowNumber;

        int numberOfStars = num - numberOfSpaces;

        StringBuilder string = new StringBuilder();
        for(int i = 0; i < numberOfSpaces; i++)
            string.append(" ");
        for(int i = 0; i < numberOfStars; i++)
            string.append("* ");

        System.out.println(string.toString());
        printDiamond(rowNumber + 1, num);
    }
}
