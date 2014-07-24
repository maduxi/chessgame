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
public class Rook extends ChessPieceAbstract {

    private final Character type = 'r';

    public Character getType() {
        return type;
    }

    public Set<Integer> getAttackSquares(int columns, int rows, int position) {
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(getRow(columns, rows, position));
        result.addAll(getColumn(columns, rows, position));
        return result;
    }

}
