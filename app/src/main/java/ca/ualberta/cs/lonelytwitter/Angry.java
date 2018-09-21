package ca.ualberta.cs.lonelytwitter;

public class Angry extends Mood {
    private String message;

    public Angry (){
        this.message = "I am angry";
    }

    public String getMood(){
        return this.message;
    }

}

