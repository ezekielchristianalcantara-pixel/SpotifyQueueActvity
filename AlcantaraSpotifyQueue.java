import java.util.LinkedList;

public class AlcantaraSpotifyQueue {

    private LinkedList<Song> songs;

    private static final int MAX_CAPACITY = 12;

    public AlcantaraSpotifyQueue() {
        songs = new LinkedList<Song>();
    }

    public boolean isFull() {
        return songs.size() == MAX_CAPACITY;
    }

    public boolean isEmpty() {
        return songs.isEmpty();
    }

    public int size() {
        return songs.size();
    }

    
}