/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame;

import es.madhava.chessgame.exceptions.TooManyPiecesException;
import es.madhava.chessgame.pieces.Bishop;
import es.madhava.chessgame.pieces.Blank;
import es.madhava.chessgame.pieces.ChessPiece;
import es.madhava.chessgame.pieces.King;
import es.madhava.chessgame.pieces.Knight;
import es.madhava.chessgame.pieces.Queen;
import es.madhava.chessgame.pieces.Rook;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author madhava
 */
public class GameConfig {

    private final int columns;
    private final int rows;
    private final int kings;
    private final int queens;
    private final int bishops;
    private final int rooks;
    private final int knights;
    private final List<ChessPiece> pieces;

    public GameConfig(String[] args) throws ArrayIndexOutOfBoundsException, NumberFormatException, TooManyPiecesException {

        columns = Integer.parseInt(args[0]);
        rows = Integer.parseInt(args[1]);

        kings = Integer.parseInt(args[2]);
        queens = Integer.parseInt(args[3]);
        bishops = Integer.parseInt(args[4]);
        rooks = Integer.parseInt(args[5]);
        knights = Integer.parseInt(args[6]);
        pieces = new ArrayList<ChessPiece>();
        createPieces();
    }

    protected final void createPieces() throws TooManyPiecesException {
        int num_pieces = kings + queens + bishops + rooks + knights;
        if ((columns * rows) < (num_pieces)) {
            throw new TooManyPiecesException("Too many pieces, they don't fit in the board!");
        }

        for (int i = 0; i < kings; i++) {
            pieces.add(new King());
        }
        for (int i = 0; i < queens; i++) {
            pieces.add(new Queen());
        }
        for (int i = 0; i < bishops; i++) {
            pieces.add(new Bishop());
        }
        for (int i = 0; i < rooks; i++) {
            pieces.add(new Rook());
        }
        for (int i = 0; i < knights; i++) {
            pieces.add(new Knight());
        }
        for (int i = 0; i < (columns * rows) - num_pieces; i++) {
            pieces.add(new Blank());
        }
    }

    public List<ChessPiece> getPieces() {
        return pieces;
    }
    
    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public int getKings() {
        return kings;
    }

    public int getQueens() {
        return queens;
    }

    public int getBishops() {
        return bishops;
    }

    public int getRooks() {
        return rooks;
    }

    public int getKnights() {
        return knights;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Problem configured with values: ");
        sb.append("Board: ").append(columns).append(" x ").append(rows).append("\n");
        sb.append("Kings: ").append(kings).append("\n");
        sb.append("Queens: ").append(queens).append("\n");
        sb.append("Bishops: ").append(bishops).append("\n");
        sb.append("Rooks: ").append(rooks).append("\n");
        sb.append("Knights: ").append(knights).append("\n");
        return sb.toString();
    }

}
