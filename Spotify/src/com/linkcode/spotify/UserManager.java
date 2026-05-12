package com.linkcode.spotify;
import java.io.*;
import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;
    private final String FILE_NAME = "users.txt";
    public UserManager() {
        users = new ArrayList<>();
        loadUsers();
    }
    

  public void register(String username, String password) {

        for (User u : users) {
            if (u.getUsername().equals(username)) {
                System.out.println("Username already exists!");
                return;
            }
        }

        users.add(new User(username, password));
        saveUsers(); // 🔥 save to file

        System.out.println("User registered successfully!");
    }

    public User login(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.checkPassword(password)) {
                System.out.println("Login successful!");
                return u;
            }
        }
        System.out.println("Invalid credentials!");
        return null;
    }
    private void loadUsers() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                users.add(new User(data[0], data[1]));
            }

        } catch (IOException e) {
           
        }
    }
    private void saveUsers() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {

            for (User u : users) {
                bw.write(u.getUsername() + "," + u.getPassword()); // ✅ HERE
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error saving users!");
        }
    }
}