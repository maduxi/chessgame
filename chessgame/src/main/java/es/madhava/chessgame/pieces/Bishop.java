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

/**
 *
 * @author madhava
 */
public class Bishop extends ChessPieceAbstract {

    private final Character type = 'i';

    public Character getType() {
        return type;
    }

    public Set<Integer> getUnderAttack(int columns, int rows, int position) {
        Set<Integer> pos = new HashSet<Integer>();
        
        pos.addAll(getTopRightDiagonalPositionsToCheck(columns, position));
        pos.addAll(getTopLeftDiagonalPositionsToCheck(columns, position));
        return pos;
    }

    protected Set<Integer> getTopRightDiagonalPositionsToCheck(int columns, int position) {
        int myCol = position % columns;
        Set<Integer> pos = new HashSet<Integer>();
        int rightAmount = (columns - 1);
        int at;
        int loops = columns - myCol;
        for (int i = 1; i <= loops; i++) {
            at = position - ((i) * rightAmount);
            if (at > 0) {
                pos.add(at);
            } else {
                break;
            }
        }
        return pos;
    }

    protected Set<Integer> getTopLeftDiagonalPositionsToCheck(int columns, int position) {
        int myCol = position % columns;
        Set<Integer> pos = new HashSet<Integer>();
        int rightAmount = (columns + 1);
        int at;
        int loops = myCol-1;
        for (int i = 1; i <= loops; i++) {
            at = position - ((i) * rightAmount);
            if (at > 0) {
                pos.add(at);
            } else {
                break;
            }
        }
        return pos;
    }

//    protected List<Integer> getBottomRightDiagonalPositionsToCheck(int columns, int size) {
//        int myCol = position % columns;
//        ArrayList<Integer> pos = new ArrayList<Integer>();
//        int rightAmount = ((columns + 1));
//        for (int i = myCol; i < columns; i++) {
//            pos.add(size + (i * rightAmount));
//        }
//        return pos;
//    }
//
//    protected List<Integer> getBottomLeftDiagonalPositionsToCheck(int columns, int size, int myCol) {
//        ArrayList<Integer> pos = new ArrayList<Integer>();
//        //check left positions
//        int leftAmount = ((columns + 1));
//        for (int i = myCol; i > 0; i--) {
//            pos.add(size - (i * leftAmount));
//        }
//        return pos;
//    }

}
