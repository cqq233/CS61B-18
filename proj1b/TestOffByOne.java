import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestOffByOne {

    // You must use this CharacterComparator and not instantiate
    // new ones, or the autograder might be upset.
    //static CharacterComparator offByOne = new OffByOne();
    @Test
    public void TestEqualChars() {
        OffByOne offByOne = new OffByOne();
        assertTrue(offByOne.equalChars('a', 'b'));

        assertTrue(offByOne.equalChars('r', 'q'));

        assertFalse(offByOne.equalChars('a', 'e'));

        assertTrue(offByOne.equalChars('a', 'b'));
        assertTrue(offByOne.equalChars('r', 'q'));
        assertTrue(offByOne.equalChars('&', '%'));

        assertFalse(offByOne.equalChars('a', 'a'));
        assertFalse(offByOne.equalChars('a', 'z'));
        assertFalse(offByOne.equalChars('a', 'e'));
        assertFalse(offByOne.equalChars('a', 'A'));
    }

    // Your tests go here.

}
