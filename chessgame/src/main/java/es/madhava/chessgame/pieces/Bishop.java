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
public class Bishop extends ChessPieceAbstract {

    private final Character type = 'i';

    public Character getType() {
        return type;
    }

    public boolean checkPosition(ChessPiece[][] board, int column, int row) {
        boolean result = true;

        //We have to check 4 diagonals
        //positive,positive
        result = checkTopRight(column, row, board);

        if (result) {
            result = checkTopLeft(column, row, board);
        }
        if (result) {
            result = checkBottomRight(column, row, board);
        }
        if (result) {
            result = checkBottomLeft(column, row, board);
        }

        return result;
    }

    protected boolean checkDiagonal(int column, int row, ChessPiece[][] board, int incCol, int incRow) {
        int i = row;
        int j = column;
        boolean result = true;
        do {
            i += incRow;
            j += incCol;
            if (j <= board.length || i <= board[j].length || i < 0 || j < 0) {
                break;
            }else if(board[i][j].isEmpty()){
                result = false;
            }
        } while (result);
        return result;
    }

    protected boolean checkTopRight(int column, int row, ChessPiece[][] board) {
        return checkDiagonal(column, row, board, 1, 1);
    }

    protected boolean checkTopLeft(int column, int row, ChessPiece[][] board) {
        return checkDiagonal(column, row, board, -1, 1);
    }

    protected boolean checkBottomRight(int column, int row, ChessPiece[][] board) {
        return checkDiagonal(column, row, board, 1, -1);
    }

    protected boolean checkBottomLeft(int column, int row, ChessPiece[][] board) {
        return checkDiagonal(column, row, board, -1, -1);
    }

}
