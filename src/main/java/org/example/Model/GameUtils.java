package org.example.Model;

import org.example.Grid;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameUtils {
    private Grid grid;
    private Player player;
    private Treasure treasure;
    private Random random = new Random();


    public GameUtils(int size) {
        this.grid = new Grid(size);
        this.player = new Player(random.nextInt(size), random.nextInt(size), "P");
        this.treasure = new Treasure(random.nextInt(size), random.nextInt(size));

        Monster monster1 = new Monster(random.nextInt(size), random.nextInt(size), "@", "Blargh!");
        Monster monster2 = new Monster(random.nextInt(size), random.nextInt(size),"*", "Roar!");
        Monster monster3 = new Monster(random.nextInt(size), random.nextInt(size),"%", "Gotya!");
        List<Monster> monsterList = new ArrayList<>();
        monsterList.add(monster1);
        monsterList.add(monster2);
        monsterList.add(monster3);
        // Make sure there are no overlaps between Monsters, Treasure and Player
        for (Monster monster : monsterList) {
            while((monster.getX() == player.getX() && monster.getY() == player.getY())
            || (monster.getX() == treasure.getX() && monster.getY() == treasure.getY())) {
                monster.setPosition(random.nextInt(size), random.nextInt(size));
            }
            grid.addMonster(monster);
        }
    }

    public void startGame(){
        System.out.println("Welcome to the Game!");
        grid.printGrid(player, treasure);
    }

}
