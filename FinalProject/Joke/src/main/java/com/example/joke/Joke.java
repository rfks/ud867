package com.example.joke;

public class Joke {

    String joke;

    public Joke(){
        this.joke="This is a java joke!";
    }

    public String toString(){return this.joke;}

    public String getData(){return this.joke;}

    public String getJoke() {
        return joke;
    }
}
