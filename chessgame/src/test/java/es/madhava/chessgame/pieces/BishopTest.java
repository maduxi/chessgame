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
public class BishopTest {

    public BishopTest() {
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        Bishop instance = new Bishop();
        Character expResult = 'i';
        Character result = instance.getType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUnderAttack() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 13;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(6);
        expResult.add(8);
        expResult.add(3);
        expResult.add(18);
        expResult.add(20);
        expResult.add(27);
        expResult.add(34);
        Set<Integer> result = instance.getAttackSquares(columns, rows, position);
        assertEquals(expResult, result);
    }
}
