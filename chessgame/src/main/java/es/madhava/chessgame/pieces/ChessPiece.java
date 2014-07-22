/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package es.madhava.chessgame.pieces;

import es.madhava.chessgame.GameConfig;

/**
 *
 * @author madhava
 */
public interface ChessPiece extends Comparable{
    Character getType();
    boolean isEmpty();
    public boolean checkPosition(ChessPiece[][] board, int column, int row);
}
