package com.github.agatagolonka.GuessGame4Digit;

public class NumToArray {
    protected int[] numArray;

    public NumToArray() {
        this.numArray = new int[4];
    }

    public void ParsNumberToArray(int num){
        int temp=num;
        for (int i = 3; i >= 0; i--){
            int n = temp%10;
            numArray[i] = n;
            temp /= 10;
        }
    }
    protected int[] giveArr(){
        return numArray;
    }

}
