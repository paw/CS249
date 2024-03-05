package edu.sullivb.assign04;

public class GameBoard {

    private char[][] board = new char[4][4];
    private char fillChar = '#';

    public GameBoard() {
        clear();
    }
    public GameBoard(int rowCnt, int colCnt, char fillChar) {
        if (rowCnt <= 0 || colCnt <= 0) {
            System.err.println("Invalid row or column count, using default dimensions of 4 x 4.");
        } else {
            board = new char[rowCnt][colCnt];
        }
        this.fillChar = fillChar;
        clear();
    }
    public void clear() {
        for (int row = 0; row < getRowCnt(); row++) {
            for (int col = 0; col < getColCnt(); col++) {
                board[row][col] = fillChar;
            }
        }
    }
    public int getRowCnt() {
        return board.length;
    }
    public int getColCnt() {
        return board[0].length;
    }
    public boolean isValidPosition(int row, int col) {
        return row >= 0 && row <= board.length - 1 && col >= 0 && col <= board[0].length - 1;
    }
    public char getPos(int row, int col) {
        if (isValidPosition(row, col)) {
            return board[row][col];
        } else {
            System.err.println("Tried to retrieve char at an invalid position: (" + row + "," + col + ")");
            return ' ';
        }
    }
    public boolean setPos(int row, int col, char c) {
        if (isValidPosition(row, col)) {
            board[row][col] = c;
            return true;
        } else {
            System.err.println("Tried to set char at an invalid position: (" + row + "," + col + ")");
            return false;
        }
    }
    public String toString() {
        return board.length + " x " + board[0].length + " GameBoard (default: " + fillChar + ")";
    }
    public String getBoardString() {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < getRowCnt(); row++) {
            for (int col = 0; col < getColCnt(); col++) {
                sb.append(board[row][col]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
