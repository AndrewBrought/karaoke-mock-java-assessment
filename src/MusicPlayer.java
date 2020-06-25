import java.io.IOException;
import java.util.List;

import static java.lang.Thread.sleep;

public class MusicPlayer extends Player{
//    add a class MusicPlayer that extends the Player abstract class and include the following...
//    a private instance string property called voice set to an empty string by default
    private String voice = "";
//    an empty constructor

    public MusicPlayer(){

    }
//    a constructor that sets the value of the voice property

    public MusicPlayer(String voice){
        this.voice = voice;
    }
//    a getter and setter for the voice property
    public void setVoice(String voice){
        this.voice = voice;
    }

    public String getVoice(){
        return voice;
    }

//    an implmentation of the play method that takes in a song instance and does the following...


//            this method will create a runtime instance with the following code Runtime r = Runtime.getRuntime();

//    a command can be issued from Java to the terminal using r.exec() and passing in a string that will be executed by the terminal (this will require handling a checked exception; please use a try-catch for this)

//    you can make your MacBook say text aloud by simply running a command in the terminal using the say command. For example, you can make your computer say "hello world" by typing into the terminal say hello world

//    using the knowledge in the previous bullet points, this method should issue a say command to the terminal for each lyric in the list of song lyrics

//    to avoid saying multiple words at once, issue include a pause after saying "now playing...SONG_TITLE by SONG_ARTIST" using the sleep() method and passing in the INTRO_PAUSE constant (this is the number of milliseconds to wait) and include a sleep() command after each lyric reading command is issued, passing in the constant WORD_CADENCE

//for each say command, you can also pass in a -v flag and include the name of the computer voice you would like the say command to be spoken with (you can use the voice property for this)

//if you get stuck on these steps, an example of a possible implementation of the play(Song s) method is further below
//    an implementation of the play method that takes in an album instance and invokes the play(Song s) method for each song in the album


    @Override
    public void play(Album a) {
        for (Song s : a.getSongs()) {
            play(s);
        }
    }

    @Override
     public void play(Song s) {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("say " + "now playing..." + s.getTitle() + " by " + s.getArtist());
            sleep(INTRO_PAUSE);
            for (String lyric : s.getLyrics()) {
                if (voice.isEmpty()) {
                    r.exec("say " + lyric);
                } else {
                    r.exec("say -v " + voice + " " + lyric);
                }
                sleep(WORD_CADENCE);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
