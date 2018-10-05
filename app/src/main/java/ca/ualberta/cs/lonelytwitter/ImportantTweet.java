/*
 *Class Name: Important Activity
 *
 * Author: Zhongaho Lu
 *
 * Version 1.0
 *
 */
package ca.ualberta.cs.lonelytwitter;

public class ImportantTweet extends Tweet {
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return true;
    }
}
