package es.madhava.chessgame.pieces;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
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
