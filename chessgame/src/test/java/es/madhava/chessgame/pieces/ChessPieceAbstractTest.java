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
public class ChessPieceAbstractTest {
    
    public ChessPieceAbstractTest() {
    }

    @Test
    public void testGetTopRightDiagonalPositions() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 14;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(9);
        expResult.add(4);
        Set<Integer> result = instance.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck2() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 33;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(28);
        expResult.add(23);
        Set<Integer> result = instance.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetTopRightDiagonalPositionsToCheck21() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 29;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = instance.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck3() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 30;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(25);
        expResult.add(20);
        expResult.add(15);
        expResult.add(10);
        expResult.add(5);
        Set<Integer> result = instance.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck4() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 0;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = instance.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositions() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 30;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = instance.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck2() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 14;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(7);
        expResult.add(0);
        Set<Integer> result = instance.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck3() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 32;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
                expResult.add(25);
        expResult.add(18);
        Set<Integer> result = instance.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck4() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 29;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(22);
        expResult.add(15);
        expResult.add(8);
        expResult.add(1);

        Set<Integer> result = instance.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 21;
        int size = 36;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(28);
        expResult.add(35);
        Set<Integer> result = instance.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck2() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 35;
        int size = 36;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = instance.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck3() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 33;
        int size = 36;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = instance.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck4() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 9;
        int size = 24;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(16);
        expResult.add(23);
        Set<Integer> result = instance.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomLeftDiagonalPositions() {
        System.out.println("getBottomLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 10;
        int size = 24;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(15);
        expResult.add(20);
        Set<Integer> result = instance.getBottomLeftDiagonalPositions(columns, position,size);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetBottomLeftDiagonalPositionsToCheck2() {
        System.out.println("getBottomLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 5;
        int size = 36;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(10);
        expResult.add(15);
        expResult.add(20);
        expResult.add(25);
        expResult.add(30);
        Set<Integer> result = instance.getBottomLeftDiagonalPositions(columns, position,size);
        assertEquals(expResult, result);
    }
    
       @Test
    public void testGetBottomLeftDiagonalPositionsToCheck3() {
        System.out.println("getBottomLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 21;
        int size = 36;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(26);
        expResult.add(31);
        Set<Integer> result = instance.getBottomLeftDiagonalPositions(columns, position,size);
        assertEquals(expResult, result);
    }
    
}
