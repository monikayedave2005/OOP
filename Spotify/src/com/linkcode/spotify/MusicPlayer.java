package com.linkcode.spotify;
public class MusicPlayer {

    public void playSong(Song s) {
        if (s != null) {
            System.out.println("Now Playing: " + s.getTitle());
        } else {
            System.out.println("Song not found!");
        }
    }
}