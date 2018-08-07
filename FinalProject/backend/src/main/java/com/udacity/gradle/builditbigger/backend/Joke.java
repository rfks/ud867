package com.udacity.gradle.builditbigger.backend;

public class Joke {

    String joke;

    public Joke(){
        this.joke="This is a backend joke!";
    }

    public String toString(){return this.joke;}

    public String getData(){return this.joke;}

    public String getJoke() {
        return joke;
    }
}
