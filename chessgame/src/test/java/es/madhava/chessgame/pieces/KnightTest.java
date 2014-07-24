/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.madhava.chessgame.pieces;

import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author madhava
 */
public class KnightTest {
    
    public KnightTest() {
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        Knight instance = new Knight();
        Character expResult = 'n';
        Character result = instance.getType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUnderAttack() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 14;
        Knight instance = new Knight();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(1);
        expResult.add(3);
        expResult.add(6);
        expResult.add(10);
        expResult.add(18);
        expResult.add(22);
        expResult.add(25);
        expResult.add(27);
        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetUnderAttack2() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 5;
        Knight instance = new Knight();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(9);
        expResult.add(16);
        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
    
            @Test
    public void testGetUnderAttack3() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 29;
        Knight instance = new Knight();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(21);
        expResult.add(16);
        expResult.add(33);
        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
    
                @Test
    public void testGetUnderAttack4() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 32;
        Knight instance = new Knight();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(19);
        expResult.add(21);
        expResult.add(24);
        expResult.add(28);
        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetUnderAttack5() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 0;
        Knight instance = new Knight();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(8);
        expResult.add(13);
        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetUnderAttack6() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 27;
        Knight instance = new Knight();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(19);
        expResult.add(14);
        expResult.add(16);
        expResult.add(23);
        expResult.add(35);
        expResult.add(31);
        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
    
}
