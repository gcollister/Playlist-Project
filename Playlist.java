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

    public void removeSong(int pos){
        playlist.remove(pos);
    }

    public String examineAllSongs(){
        String b = "Songs\n";
        for(Song a : playlist){
            b += a.getSongInfo() + "\n";
        }
        return b;
    }

    public String getLikedSongs(){
        String c = "Liked Songs\n";
        for(int i = 0; i < playlist.size(); i++){
            Song a = playlist.get(i);
                if(a.isLiked()){
                    c += a.getSongInfo() + "\n";
                }
            }
        return c;
    }

    public String getTotalDuration(){
        int seconds = 0;
        int minutes = 0;
        int totalTimeCalc = 0;
        String totalTime = "";
        String secondsProject = "";
        for(Song a : playlist){ 
            totalTimeCalc += a.getDuration();
        }
        minutes = totalTimeCalc / 60;
        seconds = totalTimeCalc % 60;
        if(seconds < 10){
            secondsProject = "0" + seconds;
          } else {
            secondsProject = seconds + "";
          }
        totalTime = minutes + ":" + secondsProject;
        return totalTime;

    }

    public void removeUnlikedSongs(){
        ArrayList <Song> result = new ArrayList <Song>();
        for (int i = playlist.size() - 1; i >= 0; i--) {
            Song a = playlist.get(i);
            if (!a.isLiked()) {
                playlist.remove(i);
            } else {
                result.add(playlist.get(i));
            }
        }
        playlist = result;
    }

}
