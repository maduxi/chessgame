/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame;

import es.madhava.chessgame.pieces.ChessPiece;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author madhava
 */
public class CalculateOptions {

    static List<ArrayList<ChessPiece>> getOptions(GameConfig conf) {
        List<ArrayList<ChessPiece>> result = new ArrayList<ArrayList<ChessPiece>>();

        Set<ArrayList<ChessPiece>> permutations = PermutationsExpert.getPermutations(conf.getPieces());

        for (ArrayList<ChessPiece> c : permutations) {
            if (validate(c, conf)) {
                result.add(c);
            }
        }
        return result;
    }

    private static boolean validate(ArrayList<ChessPiece> c, GameConfig conf) {
        int column;
        int row;
        boolean result = true;
        int columns = conf.getColumns();
        ChessPiece[][] board = getBoardFromList(c, columns, conf.getRows());
        for (int i = 0; i < c.size(); i++) {
            row = (int) (i / columns);
            column = i % columns;
            c.get(i).checkPosition(board, column, row);
        }

        return result;
    }

    public static ChessPiece[][] getBoardFromList(ArrayList<ChessPiece> pieces, int columns, int rows) {
        ChessPiece[][] result = new ChessPiece[columns][rows];
        int column;
        int row;
        for (int i = 0; i < pieces.size(); i++) {
            row = (int) (i / columns);
            column = i % columns;
            result[column][row] = pieces.get(i);
        }
        return result;
    }

    protected static void printBoard(ChessPiece[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j].getType() + "|");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
