/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.madhava.chessgame.pieces;

import es.madhava.chessgame.GameConfig;
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
//
//    @Test
//    public void testCheckPosition() {
//        System.out.println("checkPosition");
//        ChessPiece[] c = null;
//        GameConfig conf = null;
//        int line = 0;
//        int column = 0;
//        Bishop instance = new Bishop();
//        boolean expResult = false;
//        boolean result = instance.checkPosition(c, conf, line, column);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testCheckDiagonal() {
//        System.out.println("checkDiagonal");
//        int line = 0;
//        int column = 0;
//        ChessPiece[][] board = null;
//        int incCol = 0;
//        int incRow = 0;
//        Bishop instance = new Bishop();
//        boolean expResult = false;
//        boolean result = instance.checkDiagonal(line, column, board, incCol, incRow);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    @Test
    public void testCheckTopLeft() {
        System.out.println("checkTopLeft");
        int line = 0;
        int column = 0;
        ChessPiece[][] board = null;
        Bishop instance = new Bishop();
        boolean expResult = false;
        boolean result = instance.checkTopLeft(line, column, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckTopRight() {
        System.out.println("checkTopRight");
        int line = 0;
        int column = 0;
        ChessPiece[][] board = null;
        Bishop instance = new Bishop();
        boolean expResult = false;
        boolean result = instance.checkTopRight(line, column, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckBottomRight() {
        System.out.println("checkBottomRight");
        int line = 0;
        int column = 0;
        ChessPiece[][] board = null;
        Bishop instance = new Bishop();
        boolean expResult = false;
        boolean result = instance.checkBottomRight(line, column, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckBottomLeft() {
        System.out.println("checkBottomLeft");
        int line = 0;
        int column = 0;
        ChessPiece[][] board = null;
        Bishop instance = new Bishop();
        boolean expResult = false;
        boolean result = instance.checkBottomLeft(line, column, board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
