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

    public void enqueue(Song song) {
        if (isFull()) {
            System.out.println("Queue Full: Cannot add " + song + ".");
            return;
        }
        songs.addLast(song);
    }

    public Song dequeue() {
        if (isEmpty()) {
            return null;
        }
        return songs.removeFirst();
    }

    public Song peek() {
        if (isEmpty()) {
            return null;
        }
        return songs.getFirst();
    }
}