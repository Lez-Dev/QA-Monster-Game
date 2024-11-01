package Model;
import org.example.Model.Treasure;
import org.example.Model.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TreasureTest {

   @Test
    public void treasurePlayerTest () {
      int expected = 0;

      Player testPlayer = new Player(4,5,"P");
      Treasure testTreasure = new Treasure(4,5);

       int result = testTreasure.distance(testPlayer);

       assertEquals(expected, result);

    }

    @Test

    public void treasurePlayerTest2 () {
        int expected = 7;

        Player testPlayer = new Player(2,0,"P");
        Treasure testTreasure = new Treasure(6,3);

        int result = testTreasure.distance(testPlayer);

        assertEquals(expected, result);

    }

    @Test

    public void treasurePlayerTest3 () {
        int expected = 8;

        Player testPlayer = new Player(0,0,"P");
        Treasure testTreasure = new Treasure(4,4);

        int result = testTreasure.distance(testPlayer);

        assertEquals(expected, result);

    }




}

