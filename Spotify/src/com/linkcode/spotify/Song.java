package com.linkcode.spotify;

public class Song {
    private String songId;
    private String title;
    private String artist;
    private double duration;
    private String genre;
    private String type;

    public Song(String songId, String title, String artist, double duration, String genre, String type) {
        this.songId = songId;
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println(songId + " | " + title + " | " + artist + " | " + duration + " mins | " + genre + " | " + type);
    }

	public String getSongId() {
		return songId;
	}

	public void setSongId(String songId) {
		this.songId = songId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getGenre() {
	    return genre;
	}

	public String getType() {
	    return type;
	}

   
}