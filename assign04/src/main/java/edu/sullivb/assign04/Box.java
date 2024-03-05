package edu.sullivb.assign04;

public class Box {
    private final int startRow;
    private final int endRow;
    private final int startCol;
    private final int endCol;
    private final boolean filled;
    private final char drawChar;
    public Box(int sr, int sc, int er, int ec, boolean filled, char drawChar) {
        startRow = sr;
        startCol = sc;
        endRow = er;
        endCol = ec;
        this.filled = filled;
        this.drawChar = drawChar;
    }
    public void draw(GameBoard s) {
        if (filled) {
            for (int row = startRow; row <= endRow; row++) {
                for (int col = startCol; col <= endCol; col++) {
                    s.setPos(row,col,drawChar);
                }
            }
        } else {
            for (int row = startRow; row <= endRow; row++) {
                for (int col = startCol; col <= endCol; col++) {
                    if(row == startRow || row == endRow || col == startCol || col == endCol) {
                        s.setPos(row,col,drawChar);
                    }
                }
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (filled) {sb.append("Filled ");}
        return sb.append("Box from (").append(startRow).append(",").append(startCol).append(") to (").append(endRow).append(",").append(endCol).append(") with char '").append(drawChar).append("'").toString();
    }
}
