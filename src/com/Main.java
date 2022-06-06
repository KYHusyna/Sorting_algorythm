package com;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Input array size ");
        int size = input.nextInt(),
                flor = 97,
                top = 100,
                count = top - flor,
                numb = 0,
                numberArray[] = new int[size],
                keys[][] = new int[2][count];

        if (size < 1 && size > 15)
            return;

        for (int i = 0; i < (count); i++) {
            keys[1][i] = flor + i;
        }

        System.out.println("Array with keys & counts:\n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(keys[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.print("\nArray elements: ");

        for (int i = 0; i < size; i++) {
            numberArray[i] = (int) (Math.random() * 3) + 97;
            System.out.print(numberArray[i] + " ");
            if (numberArray[i] == 97)
                keys[0][0] += 1;
            else if (numberArray[i] == 98)
                keys[0][1] += 1;
            else if (numberArray[i] == 99)
                keys[0][2] += 1;
        }


        System.out.println("\nUpdate array with keys & counts:");
        for (
                int i = 0;
                i < 2; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(keys[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("\ncalculating");
        for (int i = 0; i < size; i++) {
            numberArray[i] = keys[1][numb];
            keys[0][numb] -= 1;
            if (keys[0][numb] == 0)
                numb++;

        }
        System.out.println("\nsorting array");
        for (int j = 0; j < size; j++) {
            System.out.print(numberArray[j] + " ");

        }
    }
}
