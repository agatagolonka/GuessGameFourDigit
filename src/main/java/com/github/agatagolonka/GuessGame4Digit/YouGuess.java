package com.github.agatagolonka.GuessGame4Digit;

public class YouGuess extends Hints{


    public YouGuess() {
        this.KeepPlaying=false;
    }

    @Override
    protected String giveAnswer() {
        return "Brawo";
    }
}
