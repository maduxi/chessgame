package es.madhava.chessgame.pieces;

import es.madhava.chessgame.Point;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class ChessPieceAbstractTest {

    public ChessPieceAbstractTest() {
    }

    @Test
    public void testGetTopRightDiagonalPositions() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 14;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(9);
        expResult.add(4);
        Set<Integer> result = ChessPieceAbstract.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck2() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 33;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(28);
        expResult.add(23);
        Set<Integer> result = ChessPieceAbstract.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck21() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 29;
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = ChessPieceAbstract.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck3() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 30;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(25);
        expResult.add(20);
        expResult.add(15);
        expResult.add(10);
        expResult.add(5);
        Set<Integer> result = ChessPieceAbstract.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopRightDiagonalPositionsToCheck4() {
        System.out.println("getTopRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 0;

        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = ChessPieceAbstract.getTopRightDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositions() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 30;
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = ChessPieceAbstract.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck2() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 14;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(7);
        expResult.add(0);
        Set<Integer> result = ChessPieceAbstract.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck3() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 32;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(25);
        expResult.add(18);
        Set<Integer> result = ChessPieceAbstract.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetTopLeftDiagonalPositionsToCheck4() {
        System.out.println("getTopLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 29;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(22);
        expResult.add(15);
        expResult.add(8);
        expResult.add(1);

        Set<Integer> result = ChessPieceAbstract.getTopLeftDiagonalPositions(columns, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 21;
        int size = 36;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(28);
        expResult.add(35);
        Set<Integer> result = ChessPieceAbstract.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck2() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 35;
        int size = 36;
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = ChessPieceAbstract.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck3() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 33;
        int size = 36;
        Set<Integer> expResult = new HashSet<Integer>();
        Set<Integer> result = ChessPieceAbstract.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomRightDiagonalPositionsToCheck4() {
        System.out.println("getBottomRightDiagonalPositionsToCheck");
        int columns = 6;
        int position = 9;
        int size = 24;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(16);
        expResult.add(23);
        Set<Integer> result = ChessPieceAbstract.getBottomRightDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomLeftDiagonalPositions() {
        System.out.println("getBottomLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 10;
        int size = 24;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(15);
        expResult.add(20);
        Set<Integer> result = ChessPieceAbstract.getBottomLeftDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomLeftDiagonalPositionsToCheck2() {
        System.out.println("getBottomLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 5;
        int size = 36;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(10);
        expResult.add(15);
        expResult.add(20);
        expResult.add(25);
        expResult.add(30);
        Set<Integer> result = ChessPieceAbstract.getBottomLeftDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetBottomLeftDiagonalPositionsToCheck3() {
        System.out.println("getBottomLeftDiagonalPositionsToCheck");
        int columns = 6;
        int position = 21;
        int size = 36;
        Set<Integer> expResult = new HashSet<Integer>();
        expResult.add(26);
        expResult.add(31);
        Set<Integer> result = ChessPieceAbstract.getBottomLeftDiagonalPositions(columns, position, size);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRow() {
        System.out.println("getRow");
        int columns = 6;
        int rows = 6;
        int position = 19;
        Set<Integer> expResult = new HashSet<Integer>();
        for (int i = 18; i <= 23; i++) {
            expResult.add(i);
        }
        Set<Integer> result = ChessPieceAbstract.getRow(columns, rows, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRow2() {
        System.out.println("getRow");
        int columns = 6;
        int rows = 6;
        int position = 0;
        Set<Integer> expResult = new HashSet<Integer>();
        for (int i = 0; i <= 5; i++) {
            expResult.add(i);
        }
        Set<Integer> result = ChessPieceAbstract.getRow(columns, rows, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetRow3() {
        System.out.println("getRow");
        int columns = 6;
        int rows = 6;
        int position = 30;
        Set<Integer> expResult = new HashSet<Integer>();
        for (int i = 30; i <= 35; i++) {
            expResult.add(i);
        }
        Set<Integer> result = ChessPieceAbstract.getRow(columns, rows, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColumns() {
        System.out.println("getColumn");
        int columns = 6;
        int rows = 6;
        int position = 30;
        Set<Integer> expResult = new HashSet<Integer>();
        for (int i = 0; i <= 30; i += columns) {
            expResult.add(i);
        }
        Set<Integer> result = ChessPieceAbstract.getColumn(columns, rows, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColumns2() {
        System.out.println("getColumn");
        int columns = 6;
        int rows = 6;
        int position = 29;
        Set<Integer> expResult = new HashSet<Integer>();
        for (int i = 5; i <= 35; i += columns) {
            expResult.add(i);
        }
        Set<Integer> result = ChessPieceAbstract.getColumn(columns, rows, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColumns3() {
        System.out.println("getColumn");
        int columns = 6;
        int rows = 6;
        int position = 35;
        Set<Integer> expResult = new HashSet<Integer>();
        for (int i = 5; i <= 35; i += columns) {
            expResult.add(i);
        }
        Set<Integer> result = ChessPieceAbstract.getColumn(columns, rows, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetColumns4() {
        System.out.println("getColumn");
        int columns = 6;
        int rows = 6;
        int position = 0;
        Set<Integer> expResult = new HashSet<Integer>();
        for (int i = 0; i <= 30; i += columns) {
            expResult.add(i);
        }
        Set<Integer> result = ChessPieceAbstract.getColumn(columns, rows, position);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPointFromPosition() {
        System.out.println("getPointFromPosition");
        int position = 44;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(4, 4);
        Point result = new Point(position, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionFromPoint() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(4, 4);
        int columns = 10;
        int rows = 10;
        int expResult = 44;
        int result = Point.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPointFromPosition2() {
        System.out.println("getPointFromPosition");
        int position = 0;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(0, 0);
        Point result = new Point(position, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionFromPoint2() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(0, 0);
        int columns = 10;
        int rows = 10;
        int expResult = 0;
        int result = Point.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPointFromPosition3() {
        System.out.println("getPointFromPosition");
        int position = 99;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(9, 9);
        Point result = new Point(position, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionFromPoint3() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(9, 9);
        int columns = 10;
        int rows = 10;
        int expResult = 99;
        int result = Point.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPointFromPosition4() {
        System.out.println("getPointFromPosition");
        int position = 9;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(9, 0);
        Point result = new Point(position, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionFromPoint4() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(9, 0);
        int columns = 10;
        int rows = 10;
        int expResult = 9;
        int result = Point.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPointFromPosition5() {
        System.out.println("getPointFromPosition");
        int position = 90;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(0, 9);
        Point result = new Point(position, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionFromPoint5() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(0, 9);
        int columns = 10;
        int rows = 10;
        int expResult = 90;
        int result = Point.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPointFromPosition6() {
        System.out.println("getPointFromPosition");
        int position = 69;
        int columns = 10;
        int rows = 10;
        Point expResult = new Point(9, 6);
        Point result = new Point(position, columns, rows);
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPositionFromPoint6() {
        System.out.println("getPositionFromPoint");
        Point p = new Point(9, 6);
        int columns = 10;
        int rows = 10;
        int expResult = 69;
        int result = Point.getPositionFromPoint(p, columns, rows);
        assertEquals(expResult, result);
    }

}
