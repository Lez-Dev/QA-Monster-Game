package org.example.Model;

public class Treasure extends Character {


    public Treasure(int x, int y) {
        super(x, y, "$");
    }

    public boolean found (Player player){
        return player.getX() == x && player.getY() == y;
    }

    public int distance (Player player){
        return Math.abs(player.getX() - x) + Math.abs(player.getY() - y);
    }


}
