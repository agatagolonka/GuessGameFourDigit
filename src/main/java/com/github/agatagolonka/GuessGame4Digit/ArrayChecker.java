package com.github.agatagolonka.GuessGame4Digit;

import java.util.Arrays;

public class ArrayChecker {

    int numberRightRight;
    int numberRightWrong;
    int indexFound;


    public ArrayChecker() {
        this.numberRightRight = 0;
        this.numberRightWrong = 0;
        this.indexFound = 0;
    }

    protected void checkWrongAndRight(NumToArray hide, NumToArray guess){
        this.numberRightRight = 0;
        this.numberRightWrong = 0;
        this.indexFound = 0;
        int[] guessArr= guess.giveArr();
        int[] hideArr= hide.giveArr();

                for(int i = 0; i < guessArr.length; i ++){
        System.out.println(hideArr[i]);
        indexFound = findInArray(guessArr,  hideArr[i]);
        //System.out.println(indexFound);
        if (indexFound >= 0){
            if(indexFound == i){
                ++numberRightRight;
            } else {
                ++numberRightWrong;
            }
        }
    }

        System.out.println(numberRightRight+" cyfr jest na prawidłowych miejscach");
        System.out.println(numberRightWrong+" liczb jest na błędnych miejscach");
    }
    public static int findInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
