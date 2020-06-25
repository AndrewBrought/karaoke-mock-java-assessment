import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {

//    private string properties for title, artist, and a private list of strings for lyrics
    private String title;
    private String artist;
    private List<String> lyrics;

//    a constructor to assign values to all instance properties


    public Song(String title, String artist, List<String> lyrics) {
        this.title = title;
        this.artist = artist;
        this.lyrics = lyrics;
    }


//    getters and setters for all instance properties

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist(){
        return this.artist;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }

    //    a static method parseLyrics that takes in a single string input of possibly several words and returns a list of strings that are the output of splitting all the words in the input string on a single space character " "

    public static List<String> parseLyrics(String words){
//        List<String> song = new ArrayList<>();
//        str was my parameter
//      String[] words = str.split(" ");
//        song = Arrays.asList(words.split(" "));
//        return song;
        return Arrays.asList(words.split(" "));
    }


}
