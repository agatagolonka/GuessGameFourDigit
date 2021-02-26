package com.github.agatagolonka.GuessGame4Digit;

public class Main {

    public static void main(String[] args) {

        GenerateDigit num=new GenerateDigit();
        NumToArray hideArr=new NumToArray();
        hideArr.ParsNumberToArray(num.number);

        System.out.println(Messages.START.giveMsg());
        GetDigit userNum=new GetDigit();

        Hints hint= new Hints();
        NumToArray userArr=new NumToArray();
        ArrayChecker checkArray=new ArrayChecker();
        do {
            System.out.println(Messages.ASK.giveMsg());
            userNum.setDigit();
            if (num.compareTo(userNum.userDigit()) == 0) {
                hint = new YouGuess();
            }
            else{
                userArr.ParsNumberToArray(userNum.userDigit());
                checkArray.checkWrongAndRight(hideArr, userArr);
            }
            System.out.println(hint.giveAnswer());
        }while(hint.KeepPlaying);

    }
}
