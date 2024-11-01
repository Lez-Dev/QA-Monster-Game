package org.example.Model;

public class Monster extends Character {

    public Monster(int x, int y, String token, String greeting) {
        super(x, y, token);
        this.greeting = greeting;
    }

    String greeting;

    public String Greeting() {
        return greeting;
    }


}
