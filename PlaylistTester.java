/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author
 * @version
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        //Make your playlist here

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        Playlist p = new Playlist();

        p.addSong(new Song("24K Magic", "Bruno Mars", 225));
        p.addSong(new Song("From The Start", "Laufey",185));
        p.addSong(new Song("Bye Bye Bye", "*NSYNC",200));
        p.addSong(new Song("peach eyes", "wave to earth",185));
        p.addSong(new Song("Apple Cider", "beabadoobee", 178));
        p.addSong(new Song("light", "wave to earth",225));

        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println(p.examineAllSongs());

        System.out.println("\nLiking the songs in position 1, 3, 4\n");
        //Once your songs are 'liked', this should be reflected in the next printout
        p.likeSong(1);
        p.likeSong(3);
        p.likeSong(4);

        System.out.println("Printing the songs...\n");
        System.out.println(p.examineAllSongs());

        System.out.println("\nRemoving the song in position 2\n");
        p.removeSong(2);

        System.out.println("Printing the songs...\n");
        System.out.println(p.examineAllSongs());

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!
        System.out.println(p.getLikedSongs());

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        p.getTotalDuration();

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        p.removeUnlikedSongs();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before
        System.out.println(p.examineAllSongs());
    }
}
