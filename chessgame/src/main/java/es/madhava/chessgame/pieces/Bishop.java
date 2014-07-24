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
public class Bishop extends ChessPieceAbstract {

    private final Character type = 'i';

    public Character getType() {
        return type;
    }

    public Set<Integer> getUnderAttack(int columns, int rows, int position) {
        Set<Integer> pos = new HashSet<Integer>();
        int size = columns * rows;
        pos.addAll(getTopRightDiagonalPositions(columns, position));
        pos.addAll(getTopLeftDiagonalPositions(columns, position));
        pos.addAll(getBottomRightDiagonalPositions(columns, position, size));
        pos.addAll(getBottomLeftDiagonalPositions(columns, position, size));
        return pos;
    }
}
