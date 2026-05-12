package com.linkcode.spotify;

import java.util.ArrayList;

public class MusicLibrary {
    private ArrayList<Song> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(Song s) {
        songs.add(s);
    }

    public void showAllSongs() {
        System.out.println("-----All Songs-----");
        for (Song s : songs) {
            s.displayInfo();
        }
    }

    public Song findSongById(String id) {
        for (Song s : songs) {
            if (s.getSongId().equals(id)) {
                return s;
            }
        }
        return null;
    }

public void searchSongByName(String name) {
    boolean found = false;

    for (Song s : songs) {
        if (s.getTitle().toLowerCase().contains(name.toLowerCase())) {
            s.displayInfo();
            found = true;
        }
    }

    if (!found) {
        System.out.println("No song found with name: " + name);
    }
}
public void filterByArtist(String artistName) {
    boolean found = false;

    System.out.println("Songs by " + artistName + ":");

    for (Song s : songs) {
        if (s.getArtist().toLowerCase().contains(artistName.toLowerCase())) {
            s.displayInfo();
            found = true;
        }
    }

    if (!found) {
        System.out.println("No songs found for artist: " + artistName);
    }
}
public void filterByGenre(String genre)  {
    boolean found = false;

    for (Song s : songs) {
        if (s.getGenre().trim().toLowerCase().contains(genre.trim().toLowerCase())) {
            s.displayInfo();
            found = true;
        }
    }

    if (!found) {
        System.out.println("No songs found for genre: " + genre);
    }
}
 public void filterByType(String type) {
    boolean found = false;

    for (Song s : songs) {
        if (s.getType().trim().toLowerCase().contains(type.trim().toLowerCase())) {
            s.displayInfo();
            found = true;
        }
    }

    if (!found) {
        System.out.println("No songs found for type: " + type);
    }
}

}
