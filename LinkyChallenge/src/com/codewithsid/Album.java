package com.codewithsid;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null) {
            Song song = new Song(title, duration);
            songs.add(song);
            return true;
        }else return false;
    }
    private Song findSong (String title){
        for (Song checkedSong : songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlayList(int tracker, LinkedList<Song> playlist){
        int index = tracker - 1;
        if (index>0 && index<=songs.size()){
            playlist.add(songs.get(index));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        if (findSong(title) != null){
            Song song = findSong(title);
            playlist.add(song);
            return true;
        }
        return false;
    }
}
