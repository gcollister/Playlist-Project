import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

    private ArrayList<Song> playlist;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

    public Playlist(){
    playlist = new ArrayList<Song>();
    }

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

    public void addSong(Song a){
        playlist.add(a);
    }

    public void likeSong(int pos){
        Song a = playlist.get(pos);
        a.likeSong();
    }

    public void removeSong(Song a){
        playlist.remove(a);
    }

    public String examineAllSongs(){
        String b = "Songs\n";
        for(Song a : playlist){
            b += a.toString() + "\n";
        
        
        b += "Duration: " + a.getDuration(); 
        }
        return b;
    }

    public String getLikedSongs(){
        String c = "Liked Songs\n";
        for(int i = 0; i < playlist.size(); i++){
            Song a = playlist.get(i);
                if(a.isLiked() == true){
                    c += a.toString() + "\n";
                }
        
        c += "Duration: " + a.getDuration();
            }
        return c;
    }

    public int getTotalDuration(){
        int totalTime = 0;
        for(Song a : playlist){ //equivalent as using for loop + get(i)?
            totalTime += a.getDuration();
        }
        return totalTime;

    }

    public void removeUnlikedSongs(){
        for(Song a : playlist){
            if(a.isLiked() == false){
                playlist.remove(a);
            }
        }
    }

}
