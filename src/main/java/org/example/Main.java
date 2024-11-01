package org.example;

import org.example.Model.Monster;
import org.example.Model.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(10);
        Monster monster1 = new Monster(1,1,"@", "Blargh!");
        Monster monster2 = new Monster(2,2,"*", "Roar!");
        //Monster monster3 = new Monster(3,2,"M3", "Gotya!");
        List<Monster> monsterList = new ArrayList<>();
        monsterList.add(monster1);
        monsterList.add(monster2);
        //monsterList.add(monster3);
        Player player = new Player(3,3,"P");

        grid.printGrid(player, monsterList);


    }
}