/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.madhava.chessgame.pieces;

import es.madhava.chessgame.CalculateOptions;
import es.madhava.chessgame.Point;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author madhava
 */
public class Knight extends ChessPieceAbstract {

    private final Character type = 'h';

    public Character getType() {
        return type;
    }

    public Set<Integer> getUnderAttack(int columns, int rows, int position) {
        Set<Integer> pos = new HashSet<Integer>();

        Point p = CalculateOptions.getPointFromPosition(position, columns, rows);

        Set<Point> points = new HashSet<Point>();

        points.add(new Point(p.getColumn() - 2, p.getRow() - 1));

        points.add(new Point(p.getColumn() - 2, p.getRow() + 1));

        points.add(new Point(p.getColumn() - 1, p.getRow() - 2));

        points.add(new Point(p.getColumn() - 1, p.getRow() + 2));
        
        points.add(new Point(p.getColumn() + 1, p.getRow() - 2));
        
        points.add(new Point(p.getColumn() + 1, p.getRow() + 2));

        points.add(new Point(p.getColumn() + 2, p.getRow() - 1));
        
        points.add(new Point(p.getColumn() + 2, p.getRow() + 1));
        
        for(Point pt : points){
            if(pt.getColumn()<columns && pt.getRow()<rows && pt.getColumn()>=0 && pt.getRow()>=0){
                pos.add(CalculateOptions.getPositionFromPoint(pt, columns, rows));
            }
        }

        return pos;
    }
}
