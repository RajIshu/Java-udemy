package com.JavaMasterclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Race", "Sonu Nigam");
        album.addSong("BeIntehaan", 2.36);
        album.addSong("Lat Lag Gayi", 2.40);
        album.addSong("Race", 3.12);
        album.addSong("Allah Duhai Hai", 2.82);

        albums.add(album);

        album.printAlbum();

//        album.remove("Lat Lag Gayi");

        album.printAlbum();

        album = new Album("Aashiqui", "Kumar Shanu");
        album.addSong("Tu Meri Zindagi Hai", 4.36);
        album.addSong("Saanson Ki Jarurat Ho Jaise", 4.40);
        album.addSong("Main Duniya Bhula Dunga", 5.12);
        album.addSong("Jaan-E-Jigar Janeman", 5.82);

        albums.add(album);

        printAlbumList(albums);

        LinkedList<Song> playList = new LinkedList<Song>();
//        albums.get(0).addToPlayList("Main Duniya Bhula Dunga", playList);
//        albums.get(0).addToPlayList("Jaan-E-Jigar Janeman", playList); // Doesn't Exist
//        albums.get(0).addToPlayList("BeIntehaan", playList);
        albums.get(0).addToPlayList("Lat Lag Gayi", playList);
        albums.get(0).addToPlayList("BeIntehaan", playList);
        albums.get(0).addToPlayList("Allah Duhai Hai", playList);
//        albums.get(0).addToPlayList(3, playList);
//        albums.get(0).addToPlayList(5, playList);
        albums.get(0).addToPlayList(23, playList);  // There is no track 23

        play(playList);
    }

    private static void printAlbumList(ArrayList<Album> albums){
        for(int i = 0; i < albums.size(); i++){
            System.out.println(albums.get(i).getAlbumName() + ": ");
            albums.get(i).printAlbum();
        }
    }

    private  static void play(LinkedList<Song> playList){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in the playlist");
        }
        else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = sc.nextInt();
            sc.nextLine();

            switch (action-1){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replaying" + listIterator.previous().toString());
                            forward = false;
                        }
                        else {
                            System.out.println("We are at the start of the playlist");
                        }
                    }
                    else {
                        if(listIterator.hasNext()){
                            System.out.println("Replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else {
                            System.out.println("We are at the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printPlayList(playList);
                    break;
                case 5:
                    Song songName = listIterator.next();
                    listIterator.previous();
                    listIterator.remove();
                    System.out.println(songName + " removed");
                    printMenu();
                    break;
                case 6:
                    printMenu();
                    break;
            }

        }
    }

    private static void printPlayList(LinkedList<Song> playList){
        for(int i = 0; i < playList.size(); i++){
            System.out.println(playList.get(i).toString());
        }
    }

    private static void printMenu(){
        System.out.println("Available Options:\n" +
                "1. Quit\n" +
                "2. Next Song\n" +
                "3. Previous Song\n" +
                "4. Replay\n" +
                "5. Show Playlist\n" +
                "6. Remove Current Song\n" +
                "7. Show Menu");
    }

}
