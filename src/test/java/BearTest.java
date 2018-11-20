import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    Salmon salmon;
    River river;

    @Before
    public void before(){
        bear = new Bear("Baloo");
        salmon = new Salmon();
        river = new River();
        river.addFish(salmon);
    }

    @Test
    public void bellyStartsEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatSalmon(){
        bear.eat(salmon);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterSleeping(){
        bear.eat(salmon);
        bear.eat(salmon);
        bear.eat(salmon);
        bear.poop();
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void canEatFishFromRiver(){
        bear.takeFishFromRiver(river);
        assertEquals(1, bear.foodCount());
        assertEquals(0, river.countFish());
    }


}
