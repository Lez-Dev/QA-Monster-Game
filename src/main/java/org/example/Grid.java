package org.example;

import org.example.Model.Monster;
import org.example.Model.Player;

import java.util.List;

public class Grid {

    // print out a game grid
    // we want the size of it to be customisable by the player (within reason) - limit 10 x 10

    // player, monsters and treasure, we want plot them on the grid with no overlaps
    private int size;
    private String[][] grid;

    public Grid(int size) {
        this.size = size;
        this.grid = new String[size][size];
    }

    public void printGrid(Player player, List<Monster> monsters) {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(player.getX() == i && player.getY() == j) {
                    System.out.print(player.getToken() + " ");
                } else {
                    for(Monster monster : monsters) {
                        if (monster.getX() == i && monster.getY() == j){
                            System.out.print(monster.getToken() + " ");
                            break;
                        }
                    }
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("test");
    }
}
