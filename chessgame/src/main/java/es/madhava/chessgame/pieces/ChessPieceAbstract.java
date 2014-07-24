/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame.pieces;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author madhava
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
    
    protected Set<Integer> getTopRightDiagonalPositions(int columns, int position) {
        int myCol = position % columns;
        int loops = columns - myCol -1;
        int rightAmount = -(columns - 1);
        Set<Integer> pos = loopDiagonalUp(loops, position, rightAmount);
        return pos;
    }

    protected Set<Integer> getTopLeftDiagonalPositions(int columns, int position) {
        int myCol = position % columns;
        int loops = myCol;
        int rightAmount = -(columns + 1);
        Set<Integer> pos = loopDiagonalUp(loops, position, rightAmount);
        return pos;
    }

    protected Set<Integer> getBottomRightDiagonalPositions(int columns, int position, int size) {
        int myCol = position % columns;
        int loops = columns - myCol;
        int rightAmount = (columns + 1);
        Set<Integer> pos = loopDiagonalDown(loops, position, rightAmount, size);
        return pos;
    }

    protected Set<Integer> getBottomLeftDiagonalPositions(int columns, int position, int size) {
        int myCol = position % columns;
        int loops = myCol;
        int rightAmount = (columns - 1);
        Set<Integer> pos = loopDiagonalDown(loops, position, rightAmount, size);
        return pos;
    }

    protected Set<Integer> loopDiagonalDown(int loops, int position, int rightAmount, int size) {
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

    protected Set<Integer> loopDiagonalUp(int loops, int position, int rightAmount) {
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
    
    

}
