package neetcode.io.arrayhashing;

import java.util.*;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        for (char[] chars : board) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                char rowValue = chars[j];
                if (rowValue != '.' && !rowSet.add(rowValue)) {
                    return false;
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            Set<Character> columnSet = new HashSet<>();
            for (char[] chars : board) {
                char columnValue = chars[i];
                if (columnValue != '.' && !columnSet.add(columnValue)) {
                    return false;
                }
            }
        }

        Set<Character>[][] arraySet = new Set[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char rowValue = board[i][j];
                int rowIndex = i / 3;
                int columnIndex = j / 3;

                if (arraySet[rowIndex][columnIndex] == null) {
                    arraySet[rowIndex][columnIndex] = new HashSet();
                }

                if (rowValue != '.' && !arraySet[rowIndex][columnIndex].add(rowValue)) {
                    return false;
                }
            }
        }

        return true;
    }
}
