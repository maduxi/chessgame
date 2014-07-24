package es.madhava.chessgame.pieces;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class RookTest {

    public RookTest() {
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        Rook instance = new Rook();
        Character expResult = 'r';
        Character result = instance.getType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUnderAttack() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 13;
        Rook instance = new Rook();
        Set<Integer> expResult = new HashSet<Integer>();

        for (int i = 1; i <= 31; i += columns) {
            expResult.add(i);
        }
        for (int i = 12; i <= 17; i++) {
            expResult.add(i);
        }

        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }

        @Test
    public void testGetUnderAttack2() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 0;
        Rook instance = new Rook();
        Set<Integer> expResult = new HashSet<Integer>();

        for (int i = 0; i <= 30; i += columns) {
            expResult.add(i);
        }
        for (int i = 0; i <= 5; i++) {
            expResult.add(i);
        }

        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
    
            @Test
    public void testGetUnderAttack3() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 35;
        Rook instance = new Rook();
        Set<Integer> expResult = new HashSet<Integer>();

        for (int i = 5; i <= 35; i += columns) {
            expResult.add(i);
        }
        for (int i = 30; i <= 35; i++) {
            expResult.add(i);
        }

        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
}
