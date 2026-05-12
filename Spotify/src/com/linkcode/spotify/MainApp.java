package com.linkcode.spotify;
import java.util.Scanner;

public class MainApp {
    static Scanner sc = new Scanner(System.in);
    static MusicLibrary library = new MusicLibrary();
    static MusicPlayer player = new MusicPlayer();
    static UserManager userManager = new UserManager();

    public static void main(String[] args) {

        initializeSongs();

        while (true) {
            System.out.println("$$$____ ***____ Spotify Console ____***____$$$");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> registerUser();
                case 2 -> {
                    User user = loginUser();
                    if (user != null) {
                        userMenu(user);
                    }
                }
                case 3 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }
    public static void registerUser() {
        System.out.print("Enter username: ");
        String uname = sc.next();
        System.out.print("Enter password: ");
        String pass = sc.next();
        userManager.register(uname, pass);
    }

    public static User loginUser() {
        System.out.print("Enter username: ");
        String uname = sc.next();
        System.out.print("Enter password: ");
        String pass = sc.next();
        return userManager.login(uname, pass);
    }
    public static void userMenu(User user) {
        while (true) {
            System.out.println("\n***----- Welcome " + user.getUsername() + " -----***");
            System.out.println("1. Show Songs");
            System.out.println("2. Play Song");
            System.out.println("3. Create Playlist");
            System.out.println("4. Add Song to Playlist");
            System.out.println("5. Show Playlist");
            System.out.println("6. Search Song");
            System.out.println("7. Filter");
            System.out.println("8. Logout");
            System.out.println("Enter your choice : ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> library.showAllSongs();

                case 2 -> {
                    System.out.print("Enter Song ID: ");
                    String id = sc.next();
                    player.playSong(library.findSongById(id));
                }

                case 3 -> {
                    System.out.print("Enter Playlist Name: ");
                    String name = sc.next();
                    user.createPlaylist(name);
                }

                case 4 ->  {
                    if (!user.getPlaylists().isEmpty()) {

                        user.showPlaylists();

                        System.out.print("Select playlist index: ");
                        int index = sc.nextInt();

                        if (index >= 0 && index < user.getPlaylists().size()) {

                            System.out.print("Enter Song ID: ");
                            String id = sc.next();

                            Song s = library.findSongById(id);

                            if (s != null) {
                                user.getPlaylists().get(index).addSong(s);
                                System.out.println("Song successfully added!");
                            } else {
                                System.out.println("❌ Song not found! Please enter correct ID.");
                            }

                        } else {
                            System.out.println("❌ Invalid playlist index!");
                        }

                    } else {
                        System.out.println("❌ Create playlist first!");
                    }
                }

                case 5 -> {
                    if (!user.getPlaylists().isEmpty()) {

                        user.showPlaylists();

                        System.out.print("Select playlist index: ");
                        int index = sc.nextInt();

                        if (index >= 0 && index < user.getPlaylists().size()) {
                            user.getPlaylists().get(index).showSongs();
                        } else {
                            System.out.println("Invalid index!");
                        }

                    } else {
                        System.out.println("No playlists found!");
                    }
                }

                case 6 ->{
                    System.out.print("Enter song name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    library.searchSongByName(name);
                }

                case 7 -> {
                    System.out.println("Filter Options:");
                    System.out.println("1. Artist");
                    System.out.println("2. Genre");
                    System.out.println("3. Type");
                    System.out.print("Enter choice: ");

                    int opt = sc.nextInt();
                    sc.nextLine(); 

                    switch (opt) {
                        case 1 -> {
                            System.out.print("Enter artist name: ");
                            String artist = sc.nextLine();
                            library.filterByArtist(artist);   
                        }

                        case 2 -> {
                            System.out.print("Enter genre: ");
                            String genre = sc.nextLine();
                            library.filterByGenre(genre);
                        }

                        case 3 -> {
                            System.out.print("Enter type (Bollywood/Hollywood/Devotional): ");
                            String type = sc.nextLine();
                            library.filterByType(type);
                        }

                        default -> System.out.println("Invalid option!");
                    }
                }

                case 8 -> {
                    System.out.println("Logged out!");
                    return;
                }

                default -> System.out.println("Invalid choice");
            }
        }
    }

    public static void initializeSongs()  {
        library.addSong(new Song("S1", "Kesariya  ", "Arijit Singh  ", 4.5, "Romantic ", "Bollywood"));
        library.addSong(new Song("S2", "Believer  ", "Imagine Dragon", 3.2, "Rock     ", "Hollywood"));
        library.addSong(new Song("S3", "ShapeOfYou", "Ed Sheeran    ", 3.8, "Pop      ", "Hollywood"));
        library.addSong(new Song("S4", "SochLiya  ", "Arijit Singh  ", 4.6, "Sad      ", "Bollywood"));
        library.addSong(new Song("S5", "MauliMauli", "Adarsh Shinde ", 7.6, "Spiritual", "Devotional"));
    }
}