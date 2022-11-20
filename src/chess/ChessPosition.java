package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(row < 1 || row > 8 || column < 'a' || column > 'h'){
            throw new ChessException("Error: -Not possible initiating this position");
        }
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public char getColumn() {
        return column;
    }

    public Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getRow()), 8 - position.getColumn());
    }

    @Override
    public String toString(){
        return "" + column + row;
    }

}
