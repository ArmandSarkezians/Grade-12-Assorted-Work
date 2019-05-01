import java.io.*;
import java.util.*;
public class recursionAssignment {
	static String path = "";
	static String direction = "";

	public static String allRoutes (int [] [] grid, int xPos, int yPos) {
		if (yPos == grid[0].length - 1 && xPos == 0) {
			path+= grid [xPos] [yPos];
			return grid [xPos] [yPos] + "";
		}else if (yPos == grid[xPos].length - 1) {
			path += grid [xPos] [yPos] + " ";
			direction += "North ";
			return allRoutes (grid, --xPos, yPos); 
		}else if (xPos == 0) {
			path += grid [xPos] [yPos] + " ";
			direction += "East ";
			return allRoutes (grid, xPos, ++yPos);
		}
		path += grid [xPos] [yPos] + " ";
		direction += "East ";
		return allRoutes (grid, xPos, ++yPos) + allRoutes (grid, --xPos, yPos);
	}






public static int cheapest () {
	int cheapestTotal = Integer.MAX_VALUE;
	int tempTotal = 0;
	StringTokenizer st = new StringTokenizer (path);
	while (st.hasMoreTokens()) {
		tempTotal += Integer.parseInt(st.nextToken());
	}
	if (tempTotal <= cheapestTotal) {
		cheapestTotal = tempTotal;
	}
	return cheapestTotal;
}



//	
//	public static void removeCell (int [] [] grid) {
//		List<int[]> removeBR = new ArrayList<int[]>(Arrays.asList(grid));
//		removeBR.remove(1);
//		grid = (int[][]) removeBR.toArray(new int[][]{});
//		System.out.println(Arrays.deepToString(grid).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
//
//	}
//	
//	
//	
//	




public static void main (String [] args) throws IOException{
	try {
		Scanner in = new Scanner (new File ("input.txt"));
		int numOfGrids = Integer.parseInt(in.nextLine());

		//			for (int x = 0; x < numOfGrids; x++) {
		int rows = Integer.parseInt(in.nextLine());
		int columns = Integer.parseInt(in.nextLine());
		int [] [] grid = new int [rows] [columns];

		for (int y = 0; y < rows; y++) {
			StringTokenizer s = new StringTokenizer (in.nextLine());
			for (int z = 0; z < columns; z++) {
				grid [y] [z] = Integer.parseInt(s.nextToken());
			}
		}
		System.out.println(Arrays.deepToString(grid).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
		int xPos = rows - 1;
		int yPos = 0;
		//System.out.println(grid[0].length);




		System.out.println (allRoutes (grid, xPos , yPos));
		//System.out.println(path) ;
		//System.out.println(direction);
		//System.out.println(cheapest());

		//			removeCell(grid);
		//			System.out.println(Arrays.deepToString(grid).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));










		//			}
	}catch (FileNotFoundException e) {
		System.out.println ("File not found");
	}catch (NumberFormatException e) {
		System.out.println("Input errors, please make sure that all your lines contain integers or spaces ONLY");
	}

}
}
