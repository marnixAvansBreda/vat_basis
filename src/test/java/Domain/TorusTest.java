package Domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TorusTest {
    @Test
    public void calculateVolume() throws Exception {
        Torus t = new Torus(3, 2);
        assertEquals(236.87051, t.calculateVolume(), 0.00001);
    }

}
