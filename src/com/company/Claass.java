package com.company;

import java.util.Arrays;

public class Claass {
    private int number;
    private String words;
    private int[] array;


    public Claass(int number, String words, int... array) {

        System.out.println(" This is a numbers : " + number);
        this.number = number;

        System.out.println(" This is a words : " + words);
        this.words = words;

        System.out.print(" This is an Arrays: ");
        for (int i : array) {
            System.out.print(i + " ,");
        }
            this.array = array;
    }
}

