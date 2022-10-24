package com.JavaMasterclass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String albumName;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String albumName, String artist){
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public boolean addSong(String name, double duration){
        if(findSong(name) == null) {
            songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    /*
        For-Each Loop:
        -------------
        It is known as the enhanced for loop.

        It is mainly used to traverse the array or collection elements.

        The advantage of the for-each loop is that it eliminates the possibility of bugs and makes the code more readable.

        Drawbacks of For-Each Loop:
        --------------------------
        1) It cannot traverse the elements in reverse order.
        2) Don't have the option to skip any element because it does not work on an index basis.

        Syntax of For-Each Loop:
        -----------------------
        for(dataType item : array/Collection) {
            ...
        }


        Difference between '==' and 'equals()':
        --------------------------------------
        1) '==', is a operator.
           'equals()', is a method.

        2) '==', is used for reference comparison (address comparison).
           'equals()', is used for content comparison.
    */


    private Song findSong(String title){
        for(Song checkedSong: this.songs){
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if((index >= 0) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album doesn't have a track " + trackNumber);
        return false;
    }

    // 2nd way for adding song to playlist
    public boolean addToPlayList(String songName, LinkedList<Song> playList){
        Song checkSong = findSong(songName);
        if(checkSong != null){
            playList.add(checkSong);
            return true;
        }
        System.out.println("This album doesn't have " + songName + " as a track in it.");
        return false;
    }

    // 3rd Way for adding song to playlist
//    public boolean addToPlayList(String songName, LinkedList<Song> playList){
//        int index = songs.indexOf(findSong(songName));
//        if((index >= 0) && (index <= this.songs.size())){
//            playList.add(this.songs.get(index));
//            return true;
//        }
//        System.out.println("This album doesn't have " + songName + " as a track in it.");
//        return false;
//    }


    public void remove(String name){
        for (int i = 0; i < songs.size(); i++){
            String rmTitle = songs.get(i).getTitle();
            if(rmTitle.equals(name)){
                songs.remove(i);
                System.out.println(rmTitle + " has been removed from the " + albumName + " album.");
                break;
            }
        }
    }

    public void printAlbum(){
        int i = 0;
        while(i < songs.size()){
            System.out.println((i+1) + ") " + songs.get(i).getTitle());
            i++;
        }
    }
}
