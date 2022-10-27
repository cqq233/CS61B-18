import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestOffByN {

    @Test
    public void testEqualChars() {
        OffByN offbyn = new OffByN(5);

        assertTrue(offbyn.equalChars('a', 'f'));

        assertTrue(offbyn.equalChars('f', 'a'));

        assertFalse(offbyn.equalChars('f', 'h'));


    }

}
