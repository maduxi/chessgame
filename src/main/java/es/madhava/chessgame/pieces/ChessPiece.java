package es.madhava.chessgame.pieces;

import java.util.Set;

/**
 *
 * @author Madhava Carrillo <madhava.carrillo at gmail.com>
 */
public interface ChessPiece extends Comparable{
    public Character getType();
    public boolean isEmpty();
    public Set<Integer> getAttackSquares(int columns, int rows, int position);
}
