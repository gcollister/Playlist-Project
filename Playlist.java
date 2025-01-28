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

    private ArrayList<Song> list;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

    list = new ArrayList<Song>();
      

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
        list.add(a);
    }

    public void likeSong(Song a){
        list.isLiked(); // edit
    }

    public void removeSong(Song a){
        list.remove(a);
    }

    public void examineSongs(){
        System.out.println() list;
    }

    public void examineLikedSongs(){
        System.out.println() list;
    }

    public double totalDuration(){
        double totalTime = 0;
        for(int i = 0; i < list.size(); i++){
            Song a = list.getDurration(i);
            totalTime += list.getDurration(i);
    }

}
}
