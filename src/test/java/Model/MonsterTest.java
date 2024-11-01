package Model;

import org.example.Model.Monster;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonsterTest {

    @Test
    public void monsterGreetingTest() {
        String expected = "Roar!";

        Monster testMonster = new Monster(1,1,"@", "Roar!");
        String result = testMonster.Greeting();

        assertEquals(expected, result);

    }
}
