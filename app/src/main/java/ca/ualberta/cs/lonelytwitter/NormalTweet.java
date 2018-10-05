/*
 *Class Name: Tweet
 *
 * Author: Zhongaho Lu
 *
 * Version 1.0
 *
 */
package ca.ualberta.cs.lonelytwitter;

public class NormalTweet extends Tweet{
    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}
