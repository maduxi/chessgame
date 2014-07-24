/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.madhava.chessgame.pieces;

import java.util.Set;

/**
 *
 * @author madhava
 */
public interface ChessPiece extends Comparable{
    Character getType();
    boolean isEmpty();
    public Set<Integer> getAttackSquares(int columns, int rows, int position);
}
