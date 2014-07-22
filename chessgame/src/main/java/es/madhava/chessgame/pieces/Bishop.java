/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame.pieces;

import es.madhava.chessgame.CalculateOptions;
import es.madhava.chessgame.GameConfig;

/**
 *
 * @author madhava
 */
public class Bishop extends ChessPieceAbstract {

    private final Character type = 'i';

    public Character getType() {
        return type;
    }

    public boolean checkPosition(ChessPiece[] c, GameConfig conf, int line, int column) {
        boolean result = true;
        ChessPiece[][] board = CalculateOptions.fromArray(c, conf.getColumns(), conf.getRows());
        //We have to check 4 diagonals
        //positive,positive
        result = checkTopRight(line, column, board);
        
        if (result) {
            result = checkTopLeft(line, column, board);
        }
        if (result) {
            result = checkBottomRight(line, column, board);
        }
        if (result) {
            result = checkBottomLeft(line, column, board);
        }

        return result;
    }

    protected boolean checkDiagonal(int line, int column, ChessPiece[][] board, int incCol, int incRow) {
        int i = line;
        int j = column;
        boolean result = true;
        do {
            i += incCol;
            j += incRow;
            if (!board[i][j].isEmpty()) {
                result = false;
            }
        } while (result && board[i][j].isEmpty());
        return result;
    }

    protected boolean checkTopLeft(int line, int column, ChessPiece[][] board) {
        return checkDiagonal(line, column, board, -1, 1);
    }

    protected boolean checkTopRight(int line, int column, ChessPiece[][] board) {
        return checkDiagonal(line, column, board, 1, 1);
    }

    protected boolean checkBottomRight(int line, int column, ChessPiece[][] board) {
        return checkDiagonal(line, column, board, 1, -1);
    }

    protected boolean checkBottomLeft(int line, int column, ChessPiece[][] board) {
        return checkDiagonal(line, column, board, -1, -1);
    }

}
