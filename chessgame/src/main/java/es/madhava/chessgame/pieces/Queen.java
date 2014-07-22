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
public class Queen extends ChessPieceAbstract {

    private final Character type = 'q';

    public Character getType() {
        return type;
    }

    public boolean checkPosition(ChessPiece[][] board, int line, int column) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
