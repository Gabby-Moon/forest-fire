import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireTest {
    @Test
    public void testTimeToBurnExample() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 2;
        int matchC = 6;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample2() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','.','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 0;
        int matchC = 3;

        int expected = 3;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample3() {
        char[][] forest = {
            {'t','.','t','t','t','t','t','.','t'},
            {'t','.','t','.','.','.','t','.','t'},
        };

        int matchR = 0;
        int matchC = 3;

        int expected = 4;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample4() {
        char[][] forest = {
            {'t','.','t','t','t','.','t','.','t'},
            {'t','.','t','t','t','.','t','.','t'},
            {'t','.','t','t','t','.','t','.','t'},
            {'t','.','.','.','.','.','t','.','t'},
        };

        int matchR = 1;
        int matchC = 3;

        int expected = 2;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample5() {
        char[][] forest = {
            {'t','.','t','t','t','.','t','.','t'},
            {'t','.','t','t','t','.','t','.','t'},
            {'t','.','t','t','.','.','t','.','t'},
            {'t','.','.','.','t','.','t','.','t'},
        };

        int matchR = 3;
        int matchC = 4;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample6() {
        char[][] forest = {
            {'t','t','t','t','t','t','t','t','t'}
        };

        int matchR = 0;
        int matchC = 1;

        int expected = 7;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample7() {
        char[][] forest = {
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
            {'t','t','t','t'},
        };

        int matchR = 4;
        int matchC = 1;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
    @Test
    public void testTimeToBurnExample8() {
        char[][] forest = {
            {'t','t','t','.','.','.','t','t','t'}
        };

        int matchR = 0;
        int matchC = 4;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
}
