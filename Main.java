public class Main {
    
    public static void main(String[] args) {

        AlcantaraSpotifyQueue queue = new AlcantaraSpotifyQueue();

        System.out.println("=== Loading My Spotify Queue");

        queue.enqueue(new Song("Watching Us (with Leon Thomas)", "Wale, Leon Thomas"));
        queue.enqueue(new Song( "How Many Drinks", "Miguel"));
        queue.enqueue(new Song( "like it was.", "Brent Fiayaz"));
        queue.enqueue(new Song( "Shabang", "Drake"));
        queue.enqueue(new Song( "Slap the City", "Drake"));
        queue.enqueue(new Song( "melt", "Kehlani"));
        queue.enqueue(new Song( "My Love (feat. T.I.)", "Justin Timberlake, T.I."));
        queue.enqueue(new Song( "Fashion Killa", "A$AP Rocky"));
        queue.enqueue(new Song( "Is There Someone Else?", "The Weekend"));
        queue.enqueue(new Song( "Practice", "Drake"));

        System.out.println("Total songs in queue: " + queue.size());
        System.out.println("Is the queue full?" + queue.isFull());
        System.out.println("Up next to playl " + queue.peek());

        System.out.println();

        System.out.println("=== Skipping Initial Tracks ===");

        for (int i = 0; i < 3; i++) {
            Song skipped = queue.dequeue();
            System.out.println("Skipped: " + skipped);
        }

        System.out.println();

        System.out.println("=== Adding User Requests ===");

        queue.enqueue(new Song( "Fu**in' Problems (feat. Drake, 2 Chainz & Kendrick Lamar)", "A$AP Rocky, Drake, 2 Chainz, Kendrick Lamar"));
        queue.enqueue(new Song( "Headlines", "Drake"));
        queue.enqueue(new Song( "Kiss Me Thru The Phone", "Soulja Boy, Sammie"));

        System.out.println("Added 3 more songs successfully. Current Size: " + queue.size());

        System.out.println();

        System.out.println("=== Testng Queue Capacity Limit ===");

        queue.enqueue(new Song( "Make Them Know", "Drake"));
        queue.enqueue(new Song( "Ice Melts", "Drake"));
        System.out.println("Added 2 more songs successfully. Current size: " + queue.size());

        queue.enqueue(new Song("Where Them Girls At (feat. Nicki Minaj & Flo Rida)", "David Guetta, Flo Rida, Nicki Minaj"));

        System.out.println();

        System.out.println("=== Playing Remaining Queue ===");

        while (!queue.isEmpty()) {
            Song nowPlaying = queue.dequeue();
            System.out.println("Now Playing: " + nowPlaying);
        }

        System.out.println();

        System.out.println("=== End of Playlist ===");
        System.out.println("Queue Cleared. Tracks Remaining: " + queue.size());
    }
}
