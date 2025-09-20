package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numberOfPeople = scanner.nextInt();
       int numOfSlices = scanner.nextInt();
       int numToPoser = numOfSlices;
        int counter = 1;
       while (numOfSlices % numberOfPeople != 0) {
           numOfSlices += numToPoser;
           counter++;
       }
       System.out.println(counter);



    }
}
