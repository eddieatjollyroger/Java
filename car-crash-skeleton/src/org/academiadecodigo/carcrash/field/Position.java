package org.academiadecodigo.carcrash.field;

public class Position {
    private int col;
    private int row;
    public Position(){
        this.col = (int) (Math.random() * (Field.getWidth() + 1));

        this.row = (int) (Math.random() * (Field.getHeight() + 1));
    }

    public int getCol() {
return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}
