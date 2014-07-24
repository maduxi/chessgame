/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.madhava.chessgame;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author madhava
 */
public class CalculateOptionsTest {
    
    public CalculateOptionsTest() {
    }


    @Test
    public void testGetPointFromPosition() {
        System.out.println("getPointFromPosition");
        int position = 44;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(4, 4);
        Point result = CalculateOptions.getPointFromPosition(position, columns, rows);
        assertEquals(expResult, result);
    }
        @Test
    public void testGetPositionFromPoint() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(4, 4);
        int columns = 10;
        int rows = 10;
        int expResult = 44;
        int result = CalculateOptions.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }

        @Test
    public void testGetPointFromPosition2() {
        System.out.println("getPointFromPosition");
        int position = 0;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(0, 0);
        Point result = CalculateOptions.getPointFromPosition(position, columns, rows);
        assertEquals(expResult, result);
    }
        @Test
    public void testGetPositionFromPoint2() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(0, 0);
        int columns = 10;
        int rows = 10;
        int expResult = 0;
        int result = CalculateOptions.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetPointFromPosition3() {
        System.out.println("getPointFromPosition");
        int position = 99;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(9, 9);
        Point result = CalculateOptions.getPointFromPosition(position, columns, rows);
        assertEquals(expResult, result);
    }
        @Test
    public void testGetPositionFromPoint3() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(9, 9);
        int columns = 10;
        int rows = 10;
        int expResult = 99;
        int result = CalculateOptions.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetPointFromPosition4() {
        System.out.println("getPointFromPosition");
        int position = 9;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(9, 0);
        Point result = CalculateOptions.getPointFromPosition(position, columns, rows);
        assertEquals(expResult, result);
    }
        @Test
    public void testGetPositionFromPoint4() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(9, 0);
        int columns = 10;
        int rows = 10;
        int expResult = 9;
        int result = CalculateOptions.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetPointFromPosition5() {
        System.out.println("getPointFromPosition");
        int position = 90;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(0, 9);
        Point result = CalculateOptions.getPointFromPosition(position, columns, rows);
        assertEquals(expResult, result);
    }
        @Test
    public void testGetPositionFromPoint5() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(0, 9);
        int columns = 10;
        int rows = 10;
        int expResult = 90;
        int result = CalculateOptions.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }
        @Test
    public void testGetPointFromPosition6() {
        System.out.println("getPointFromPosition");
        int position = 69;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(9, 6);
        Point result = CalculateOptions.getPointFromPosition(position, columns, rows);
        assertEquals(expResult, result);
    }
    @Test
    public void testGetPositionFromPoint6() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(9, 6);
        int columns = 10;
        int rows = 10;
        int expResult = 69;
        int result = CalculateOptions.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }
    
}
