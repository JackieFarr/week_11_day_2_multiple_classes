import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RiverTest {

    River river;
    Salmon salmon;

    @Before
    public void before(){
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void riverStartsEmpty(){
        assertEquals(0, river.countFish());
    }

    @Test
    public void canAddFishToRiver(){
        river.addFish(salmon);
        assertEquals(1, river.countFish());
    }

    @Test
    public void canGetSalmon(){
        river.addFish(salmon);
        river.removeFish();
        assertEquals(0, river.countFish());
    }


}
