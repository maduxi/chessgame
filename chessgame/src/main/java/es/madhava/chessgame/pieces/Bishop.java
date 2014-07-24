package es.madhava.chessgame.pieces;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public class Bishop extends ChessPieceAbstract {

    private final Character type = 'b';

    public Character getType() {
        return type;
    }

    public Set<Integer> getAttackSquares(int columns, int rows, int position) {
        Set<Integer> pos = new HashSet<Integer>();
        int size = columns * rows;
        pos.addAll(getTopRightDiagonalPositions(columns, position));
        pos.addAll(getTopLeftDiagonalPositions(columns, position));
        pos.addAll(getBottomRightDiagonalPositions(columns, position, size));
        pos.addAll(getBottomLeftDiagonalPositions(columns, position, size));
        return pos;
    }
}
