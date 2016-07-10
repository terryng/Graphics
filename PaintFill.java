
public class PaintFill {
	

public static void paintFill (char[][] grid, char c, int i, int j){
	char colour = grid[i][j];

	grid[i][j] = c;	

	if (i+1 < grid.length && grid[i+1][j] == colour){
		paintFill(grid, c, i+1, j);
	}
	if (i-1 >= 0 && grid[i-1][j] == colour){
		paintFill(grid, c, i-1, j);
	}
	if (j+1 < grid[0].length && grid[i][j+1] == colour){
		paintFill(grid, c, i, j+1);
	}
	if (j-1 >= 0 && grid[i][j-1] == colour){
		paintFill(grid, c, i, j-1);
	}
	

}

public static void main (String[] args){
	char[][] grid = {{'R','R','R'},{'G','G','G'},{'Y','G','Y'}};
	char c = 'B';
	int i = 1;
	int j = 1;
	paintFill (grid, c, i, j);
	for (int m = 0; m < grid.length; m++){
		for (int n = 0; n < grid[0].length; n++){
			System.out.print(grid[m][n] + " ");
		}
	System.out.println();
	}
}



}
