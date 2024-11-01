package org.example;

import org.example.Model.Monster;
import org.example.Model.Player;
import org.example.Model.Treasure;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    // print out a game grid
    // we want the size of it to be customisable by the player (within reason) - limit 10 x 10

    // player, monsters and treasure, we want plot them on the grid with no overlaps
    private int size;
    private String[][] grid;
    private List<Monster> monsters;

    public Grid(int size) {
        this.size = size;
        this.grid = new String[size][size];
        this.monsters = new ArrayList<>();
    }

    public void addMonster(Monster monster) {
        monsters.add(monster);
    }

    public void printGrid(Player player, Treasure treasure) {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(player.getX() == i && player.getY() == j) {
                    System.out.print(" " + player.getToken() + " ");
                } else {
                    boolean monsterPrinted = false;
                    for(Monster monster : monsters) {
                        if (monster.getX() == i && monster.getY() == j){
                            System.out.print(" " + monster.getToken() + " ");
                            monsterPrinted = true;
                            break;
                        }
                    }
                    if(!monsterPrinted) {
                        System.out.print(" . ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println("test");
    }
}
