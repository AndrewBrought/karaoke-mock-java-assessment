import java.util.Arrays;
import java.util.Scanner;

public class KaraokeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userChoice = null;

        Player musicPlayer = new MusicPlayer("victoria"); // can change the voice
        Player lyricsPlayer = new LyricsPlayer("red"); // can change the color

        Album a = new Album("90s Hits", Arrays.asList(
           new Song("Big Pa pa", "Biggie Smalls", Song.parseLyrics(" I like it when they call me big  pa...   pa ...  Throw your hands  in the ay ir  if you a true  play er   ")),

                new Song("The Best of What's Around", "Dave Matthews Band", Song.parseLyrics("Heyy  my  friend  \n" +
                   " It seems  your  eyes  are  troubled  \n" +
                   " Care  to  share    your time   with  me")),
           new Song("Nuthin' But AG Thang", "Dr. Dre  featuring Snoop Dog", Song.parseLyrics("One,  two,  three 'n to the fo' \n" +
                   " Snoop  Doggy-  Dogg- and Dr.  Dre is at tha doe'"))
        ));

        runKaraokeMachine(scanner, userChoice, musicPlayer, lyricsPlayer, a);

    }

    public static void runKaraokeMachine(Scanner scanner, String userChoice, Player musicPlayer, Player lyricsPlayer, Album a) {
        a.printTrackListings();

        System.out.println("\nWould you like to listen to this album (type 's') or sing karaoke with it (type 'k')? [s/k]");
        do {
            userChoice = scanner.next();
            if (!userChoice.equalsIgnoreCase("k") && !userChoice.equalsIgnoreCase("s")) {
                System.out.println("Must select either 's' or 'k'");
            }
        }
        while (!userChoice.equalsIgnoreCase("k") && !userChoice.equalsIgnoreCase("s"));

        if (userChoice.equalsIgnoreCase("k")) {
            lyricsPlayer.play(a);
        } else {
            musicPlayer.play(a);
        }
    }

}
