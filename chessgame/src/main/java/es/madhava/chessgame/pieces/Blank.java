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
public class Blank extends ChessPieceAbstract {

    private final Character type = 'b';

    public Character getType() {
        return type;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public boolean checkPosition(ChessPiece[][] board, int line, int column) {
      return true;
    }
}
