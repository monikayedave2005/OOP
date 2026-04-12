package com.linkcode.spotify;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Playlist> playlists;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.playlists = new ArrayList<>();
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String pass) {
        return this.password.equals(pass);
    }

    public void createPlaylist(String name) {
        playlists.add(new Playlist(name));
        System.out.println("Playlist created!");
    }
    public void showPlaylists() {
        if (playlists.isEmpty()) {
            System.out.println("No playlists available!");
            return;
        }

        for (int i = 0; i < playlists.size(); i++) {
            System.out.println(i + " -> " + playlists.get(i).getName());
        }
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }
}