package com.github.agatagolonka.GuessGame4Digit;

enum Messages {
        START("Wylosowałem liczbę 4 cyfrową"),
        ASK("Proszę spróbuj zgadnąć, Jak myślisz jaką liczbę wylosowałem?");



        String msg;

    Messages(String s) {
        msg=s;
    }

    String giveMsg(){
            return msg;
        }
}
