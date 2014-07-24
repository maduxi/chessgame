package es.madhava.chessgame.pieces;

import es.madhava.chessgame.Point;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public abstract class ChessPieceAbstract implements ChessPiece {

    public int compareTo(Object o) {
        if (o instanceof ChessPiece) {
            return this.getType().compareTo(((ChessPiece) o).getType());
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return this.getType().toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean equals(Object object) {
        if (object != null && object instanceof ChessPieceAbstract && ((ChessPieceAbstract) object).getType().equals(this.getType())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        final int seed = 43;
        return seed * this.getType().hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected static Set<Integer> getTopRightDiagonalPositions(int columns, int position) {
        int myCol = position % columns;
        int loops = columns - myCol -1;
        int rightAmount = -(columns - 1);
        Set<Integer> pos = loopDiagonalUp(loops, position, rightAmount);
        return pos;
    }

    protected static Set<Integer> getTopLeftDiagonalPositions(int columns, int position) {
        int myCol = position % columns;
        int loops = myCol;
        int rightAmount = -(columns + 1);
        Set<Integer> pos = loopDiagonalUp(loops, position, rightAmount);
        return pos;
    }

    protected static Set<Integer> getBottomRightDiagonalPositions(int columns, int position, int size) {
        int myCol = position % columns;
        int loops = columns - myCol;
        int rightAmount = (columns + 1);
        Set<Integer> pos = loopDiagonalDown(loops, position, rightAmount, size);
        return pos;
    }

    protected static Set<Integer> getBottomLeftDiagonalPositions(int columns, int position, int size) {
        int myCol = position % columns;
        int loops = myCol;
        int rightAmount = (columns - 1);
        Set<Integer> pos = loopDiagonalDown(loops, position, rightAmount, size);
        return pos;
    }

    protected static Set<Integer> loopDiagonalDown(int loops, int position, int rightAmount, int size) {
        Set<Integer> pos = new HashSet<Integer>();
        int at;
        for (int i = 1; i <= loops; i++) {
            at = position + ((i) * rightAmount);
            if (at < size) {
                pos.add(at);
            } else {
                break;
            }
        }
        return pos;
    }

    protected static Set<Integer> loopDiagonalUp(int loops, int position, int rightAmount) {
        Set<Integer> pos = new HashSet<Integer>();
        int at;
        for (int i = 1; i <= loops; i++) {
            at = position + ((i) * rightAmount);
            if (at >= 0) {
                pos.add(at);
            } else {
                break;
            }
        }
        return pos;
    }
    
    protected static Set<Integer> getRow(int columns, int rows, int position) {
        Set<Integer> result = new HashSet<Integer>();
        Point originalPoint = getPointFromPosition(position, columns, rows);
        for(int i=0;i<columns;i++){
            result.add(getPositionFromPoint(new Point(i, originalPoint.getRow()),columns,rows));
        }
        return result;
    }
    
        protected static Set<Integer> getColumn(int columns, int rows, int position) {
        Set<Integer> result = new HashSet<Integer>();
        Point originalPoint = getPointFromPosition(position, columns, rows);
        for(int i=0;i<rows;i++){
            result.add(getPositionFromPoint(new Point(originalPoint.getColumn(), i),columns,rows));
        }
        return result;
    }

    public static Point getPointFromPosition(int position, int columns, int rows) {
        int col = position % columns;
        int row = (position / columns);
        return new Point(col, row);
    }

    public static int getPositionFromPoint(Point p, int columns, int rows) {
        int rowValue = columns*p.getRow();
        return rowValue+p.getColumn();
    }
}
