package ca.ualberta.cs.lonelytwitter;

public class Calm extends Mood {

    private String message;

    public Calm(){
        this.message = "I am calm";
    }

    public String getMood(){
        return this.message;
    }
}

