package com.github.agatagolonka.GuessGame4Digit;

import java.util.Scanner;

public class GetDigit {

    private int userDigit;


    GetDigit() {
    }
   protected void setDigit(){
        this.userDigit = new Scanner(System.in).nextInt();
    }


    public Integer userDigit() {
        //this.userDigit = new Scanner(System.in).nextInt();
        return this.userDigit;
    }
}

