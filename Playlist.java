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
<<<<<<< HEAD

    private ArrayList<Song> list;
=======
    private ArrayList<Song> playlist;
>>>>>>> fc147af9798efbf1867bb3e6d74bec9ee5ac8d38



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

    public void likeSong(Song a){
        playlist.isLiked(); // edit
    }

    public void removeSong(Song a){
        playlist.remove(a);
    }

}
