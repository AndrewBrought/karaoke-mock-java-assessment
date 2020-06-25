import java.util.List;

public class Album {
//    a private string property for the album name
//    a private property for a list of song objects called songs
    private String name;
    private List<Song> songs;


    //    a constructor that sets both instance properties
    public Album(String albumName, List<Song> songs){
        this.name = albumName;
        this.songs = songs;
    }


    //    getters and setters for both instance properties
    public void setAlbumName(String name){
        this.name = name;
    }

    public String getAlbumName(){
        return this.name;
    }

    public void setSongs(List<Song> songs){
        this.songs = songs;
    }

   public List<Song> getSongs(){
        return this.songs;
   }

    //    a public method with a void return type called printTrackListings that will iterate through all songs for a given album and print output like the following (90s Hits is the example album name):

    public void printTrackListings(){
        System.out.println(getAlbumName());
        for(int i = 0; i < songs.size(); i++){
            System.out.println((i + 1) + ". " + songs.get(i).getTitle() + " by " + songs.get(i).getArtist());
        }
    }

}
