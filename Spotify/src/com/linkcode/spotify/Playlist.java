package com.linkcode.spotify;

import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<Song> songs;

    public String getName() {
        return name;
    }
    
    public Playlist(String name) {
        this.name = name;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song s) {
        songs.add(s);
        System.out.println("Song added!");
    }

   public void showSongs() {
        System.out.println("Playlist: " + name);

        if (songs.isEmpty()) {
            System.out.println("⚠ No songs in this playlist!");
            return;
        }

        for (Song s : songs) {
            if (s != null) {
                s.displayInfo();
            }
        }
    }
}