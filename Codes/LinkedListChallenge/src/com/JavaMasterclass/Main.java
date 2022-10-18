package com.JavaMasterclass;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*
	    CHALLENGE:
	    ---------
	    Create a program that implements a playlist for songs.
        Create a Song class having Title and Duration for a song.
        The program will have an Album class containing a list of songs.
        The albums will be stored in an ArrayList.
        Songs from different albums can be added to the playlist and will appear in the list in the order they are added.
        Once the songs have been added to the playlist, create a menu of options to:-
        Quit, Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        List the songs in the playlist.
        A song must exist in an album before it can be added to the playlist (so you can only play songs that
        you own).
        Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        started tracking the direction we were going.
        As an optional extra, provide an option to remove the current song from the playlist
        (hint: listiterator.remove())
	*/

        private ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Race", "Sonu Nigam");
        album.addSong("BeIntehaan", 2.36);
        album.addSong("Lat Lag Gayi", 2.40);
        album.addSong("Race", 3.12);
        album.addSong("Allah Duhai Hai", 2.82);

        albums.add(album);

        album.printAlbum();

        album.remove("Lat Lag Gayi");

        album.printAlbum();

        album = new Album("Aashiqui", "Kumar Shanu");
        album.addSong("Tu Meri Zindagi Hai", 4.36);
        album.addSong("Saanson Ki Jarurat Ho Jaise", 4.40);
        album.addSong("Main Duniya Bhula Dunga", 5.12);
        album.addSong("Jaan-E-Jigar Janeman", 5.82);

        albums.add(album);
    }
}
