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
public class KingTest {
    
    public KingTest() {
    }

    @Test
    public void testGetType() {
        System.out.println("getType");
        King instance = new King();
        Character expResult = 'k';
        Character result = instance.getType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUnderAttack() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 7;
        King instance = new King();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(0);
        expResult.add(1);
        expResult.add(2);
        expResult.add(6);
        expResult.add(8);
        expResult.add(12);
        expResult.add(13);
        expResult.add(14);
        Set<Integer> result = instance.getUnderAttack(columns, rows, position);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetUnderAttack11() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 10;
        King instance = new King();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(3);
        expResult.add(4);
        expResult.add(5);
        expResult.add(9);
        expResult.add(11);
        expResult.add(15);
        expResult.add(16);
        expResult.add(17);
        Set<Integer> result = instance.getUnderAttack(columns, rows, position);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetUnderAttack12() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 27;
        King instance = new King();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(20);
        expResult.add(21);
        expResult.add(22);
        expResult.add(26);
        expResult.add(28);
        expResult.add(32);
        expResult.add(33);
        expResult.add(34);
        Set<Integer> result = instance.getUnderAttack(columns, rows, position);
        assertEquals(expResult, result);
    }
    
            @Test
    public void testGetUnderAttack13() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 35;
        King instance = new King();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(28);
        expResult.add(29);
        expResult.add(34);
        Set<Integer> result = instance.getUnderAttack(columns, rows, position);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetUnderAttack1() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 4;
        int position = 21;
        King instance = new King();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(14);
        expResult.add(15);
        expResult.add(16);
        expResult.add(20);
        expResult.add(22);
        Set<Integer> result = instance.getUnderAttack(columns, rows, position);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testGetUnderAttack2() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 5;
        King instance = new King();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(4);
        expResult.add(10);
        expResult.add(11);
        Set<Integer> result = instance.getUnderAttack(columns, rows, position);
        assertEquals(expResult, result);
    }
    
        @Test
    public void testGetUnderAttack3() {
        System.out.println("getUnderAttack");
        int columns = 6;
        int rows = 6;
        int position = 30;
        King instance = new King();
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(24);
        expResult.add(25);
        expResult.add(31);
        Set<Integer> result = instance.getUnderAttack(columns, rows, position);
        assertEquals(expResult, result);
    }
}
