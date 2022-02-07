package com.company;

import java.util.Arrays;

public class Claass {

    private int number;
    private String words;
    private int[] array;

    public Claass() {
    }

    public Claass(int number, String words, int[] array) {
        this.number = number;
        this.words = words;
        this.array = array;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
    public void info(){
        System.out.println("Number: " + getNumber() + "\n Words: " + getWords());
        System.out.print(" Arrays: ");
        for (int i : array) {
            System.out.print(i + ",");
        }
    }
}