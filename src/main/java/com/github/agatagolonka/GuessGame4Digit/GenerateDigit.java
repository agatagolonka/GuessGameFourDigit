package com.github.agatagolonka.GuessGame4Digit;

import java.util.Random;

public class GenerateDigit implements Comparable<Integer>{
    protected int number;


    public GenerateDigit() {
        this.number =new Random().nextInt(9999-1000) + 1000;
        System.out.println(number);
    }

    @Override
    public int compareTo(Integer o) {
        return Integer.compare(o.intValue(), this.number);
    }
}
