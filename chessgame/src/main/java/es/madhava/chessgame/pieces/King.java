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
public class King extends ChessPieceAbstract {

    private final Character type = 'k';

    public Character getType() {
        return type;
    }

    public Set<Integer> getAttackSquares(int columns, int rows, int position) {
        HashSet<Integer> result = new HashSet<Integer>();

        int col = position % columns;
        int row = position / columns;

        
        if (col >0 ) {
            result.add(position - 1);
            if (row > 0) {
                result.add(position - columns - 1);
                result.add(position - columns);
            }
            if (row < rows-1) {
                result.add(position + columns - 1);
                result.add(position + columns);
            }
        }
        if (col < columns-1) {
            result.add(position + 1);
            if (row > 0) {
                result.add(position - columns + 1);
                result.add(position - columns);
            }
            if (row < rows-1) {
                result.add(position + columns + 1);
                result.add(position + columns);
            }
        }

        return result;
    }
}
