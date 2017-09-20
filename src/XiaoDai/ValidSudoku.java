package XiaoDai;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SolutionValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; ++i) {
        	HashSet<Character> row = new HashSet<Character>();
        	HashSet<Character> column = new HashSet<Character>();
        	HashSet<Character> cube = new HashSet<Character>();
        	for(int j = 0; j < 9; ++j) {
        		if(board[i][j] != '.' && !row.add(board[i][j]))
        			return false;
        		if(board[j][i] != '.' && !column.add(board[j][i]))
        			return false;
        		int cube_row_index = 3 * (i / 3);
        		int cube_column_index = 3 * (i % 3);
        		if(board[cube_row_index + j / 3][cube_column_index + j % 3] != '.' && 
        				!cube.add(board[cube_row_index + j / 3][cube_column_index + j % 3])) {
        			return false;
        		}
        	}
        }
        return true;
    }
}