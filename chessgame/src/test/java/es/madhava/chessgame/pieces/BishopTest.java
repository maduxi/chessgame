/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame.pieces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

//    @Test
//    public void testGetUnderAttack() {
//        System.out.println("getUnderAttack");
//        int columns = 8;
//        int rows = 8;
//        int position = 27;
//        Bishop instance = new Bishop();
//        List<Integer> expResult = null;
//        List<Integer> result = instance.getUnderAttack(columns, rows, position);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    @Test
    public void testGetTopRightDiagonalPositionsToCheck() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 8;
        int position = 27;
        int myCol = 3;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(20);
        expResult.add(13);
        expResult.add(6);
        Set<Integer> result = instance.getTopRightDiagonalPositionsToCheck(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck2() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 8;
        int position = 38;
        int myCol = 6;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(24);
        expResult.add(31);
        Set<Integer> result = instance.getTopRightDiagonalPositionsToCheck(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck3() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 8;
        int position = 57;
        int myCol = 1;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(50);
        expResult.add(43);
        expResult.add(36);
        expResult.add(29);
        expResult.add(22);
        expResult.add(15);
        expResult.add(8);
        Set<Integer> result = instance.getTopRightDiagonalPositionsToCheck(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck4() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 8;
        int position = 0;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = instance.getTopRightDiagonalPositionsToCheck(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 8;
        int position = 57;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = instance.getTopLeftDiagonalPositionsToCheck(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck2() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 8;
        int position = 27;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(18);
        expResult.add(9);
        Set<Integer> result = instance.getTopLeftDiagonalPositionsToCheck(columns, position);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetTopLeftDiagonalPositionsToCheck3() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 8;
        int position = 64;
        Bishop instance = new Bishop();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(18);
        expResult.add(9);
        Set<Integer> result = instance.getTopLeftDiagonalPositionsToCheck(columns, position);
        assertEquals(expResult, result);
    }

//    @Test
//    public void testGetBottomRightDiagonalPositionsToCheck() {
//        System.out.println("getBottomRightDiagonalPositionsToCheck");
//        int columns = 0;
//        int size = 0;
//        int myCol = 0;
//        Bishop instance = new Bishop();
//        List<Integer> expResult = null;
//        List<Integer> result = instance.getBottomRightDiagonalPositionsToCheck(columns, size, myCol);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testGetBottomLeftDiagonalPositionsToCheck() {
//        System.out.println("getBottomLeftDiagonalPositionsToCheck");
//        int columns = 0;
//        int size = 0;
//        int myCol = 0;
//        Bishop instance = new Bishop();
//        List<Integer> expResult = null;
//        List<Integer> result = instance.getBottomLeftDiagonalPositionsToCheck(columns, size, myCol);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
