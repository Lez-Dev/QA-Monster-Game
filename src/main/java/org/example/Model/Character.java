package org.example.Model;

public abstract class Character {
    int x;
    int y;
    final String token;

    public Character(int x, int y, String token) {
        this.x = x;
        this.y = y;
        this.token = token;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getToken() {
        return token;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
