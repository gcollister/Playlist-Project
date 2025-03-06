/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?
    private String title;
    private String artist;
    private int duration;
    private boolean liked;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */

     public Song(String myTitle, String myArtist, int myDuration){
        title = myTitle;
        artist = myArtist;
        duration = myDuration;
        liked = false;
     }

     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public String getArtist(){
        return artist;
      }

      public String getTitle(){
        return title;
      }

      public int getDuration(){
        return duration;
      }

      public String displayDuration(){
        int seconds = 0;
        int minutes = 0;
        String secondsProject = "";
        
        minutes = duration / 60;
        seconds = duration % 60;
        if(seconds < 10){
          secondsProject = "0" + seconds;
        } else {
          secondsProject = seconds + "";
        }
        return minutes + ":" + secondsProject;
      }

      public boolean isLiked(){
        return liked;
      }

      public void likeSong(){
        if (liked == false){
            liked = true;
        }else {
            liked = false;
        }
      }

      
      public String getSongInfo(){
        String result = "";
        if (isLiked()){
          result = "\"" + title + "\" by " + artist + " (" + displayDuration() + ") -- liked";
        } else {
          result = "\"" + title + "\" by " + artist + " (" + displayDuration() + ")";
        }
        return result;
      }


}
