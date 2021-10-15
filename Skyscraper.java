import java.util.Scanner;
public class Skyscraper {
	Scanner scnr = new Scanner(System.in);
	int [][] puzzleArray;
	int [] visNumListOne;
	int[] visNumListTwo;
	//Scanner read = new Scanner(System.in);
	int DIM = 0;
	//Dimensions of Array
	int truthVal = 0;
	int falseVal = 0;
	int visNum = 1;
	int i = 0;
	int max;
	
//Puzzle Reader Method
	public void loadPuzzle() {
	DIM = scnr.nextInt();
	puzzleArray = new int [DIM][DIM];
	
	for (int x = 0; x < DIM; ++x) {
		for (int y = 0; y < DIM; ++y) {
		puzzleArray [x][y] = scnr.nextInt();
		}
	}
}

//Placement Verifier Method
	public boolean verifyPlacement() {
		/*Row Verifier */
		for (int x = 0; x < DIM; ++x) {
			for (int y = 0; y < DIM; ++y) {
			for (i = 0; i < DIM ; ++i) {
			if (i != y) {
			 if (puzzleArray[x][y] != puzzleArray[x][i]) {
				 falseVal = 0 + falseVal;
			 		}
			 else {falseVal = 1;
			 }
			}	
		}
	}
}	
		/*Column Verifier*/
		for (int x = 0; x < DIM; ++x) {
			for (int y = 0; y < DIM; ++y) {
			for (i = 0; i < DIM ; ++i) {
			if (i != x) {
			 if (puzzleArray[x][y] != puzzleArray[i][y]) {
				 falseVal = 0 + falseVal;
			 		}
			 else {falseVal = 1;
			 }
			}	
		}
	}
}		
		/*Final Verifier*/
			if (falseVal != 0) {
				return false;
			}
			else {
				return true;
			}			
}	
	
//Print Method (Default)
		public void print() {
			for (int x = 0; x < DIM; ++x) {
				for (int y = 0; y < DIM; ++y) {
					System.out.print(puzzleArray[x][y] + " ");
	}
			System.out.println();
			}
}
			
//Print Method (Visibility)			
		public void printWithVisibility() {
	/*Top-Down Column Visbility Printer*/
			System.out.print("  ");
			for (int y = 0; y < DIM; ++y) {
				max = puzzleArray[0][y];
				
				for (int x = 1; x < DIM; ++x) { 
				if (max < puzzleArray[x][y]) {
					max = puzzleArray[x][y];
					visNum = visNum + 1;
				}
				}
			System.out.print(visNum + " ");
			visNum = 1;
			}
			System.out.println();
			System.out.println("  --------  ");
			
		/*Left-Right Visibility Finder*/ 
			visNumListOne = new int[DIM];
			for (int x = 0; x < DIM; ++x) {
				max = puzzleArray[x][0];
			
				for (int y = 1; y < DIM; ++y) {
					if (max < puzzleArray[x][y]) {
						max = puzzleArray[x][y];
						visNum++;		
					}
					}
			visNumListOne[x] = visNum;
			visNum = 1;
				}
			
		/*Right-Left Visibility Finder*/
			visNumListTwo = new int[DIM];
			for (int x = 0; x < DIM; ++x) {
				max = puzzleArray[x][DIM - 1];
				
				for (int y = DIM - 1; y > -1; --y) {
					if (max < puzzleArray[x][y]) {
						max = puzzleArray[x][y];
						visNum++;	
				}
				}
				visNumListTwo[x] = visNum;
				visNum = 1;	
		}
			
	/*puzzleArray Printer with Visibility*/
			for (int x = 0; x < DIM; ++x) {
				System.out.print(visNumListOne[x] + "|");
					for (int y = 0; y < DIM; ++y) {
					if (y == DIM - 1) {
						System.out.print(puzzleArray[x][y]);
					}
					else {
					System.out.print(puzzleArray[x][y] + " ");	
				}
				}
				System.out.print("|" + visNumListTwo[x]);
				System.out.println(" ");
		}
		
	  /*Bottom-Top Column Printer*/
			System.out.println("  --------  ");
			System.out.print("  ");
			for (int y = 0; y < DIM; ++y) {
				max = puzzleArray[DIM - 1][y];
				
				for (int x = DIM - 1; x > -1; --x) { 
					if (max < puzzleArray[x][y]) {
						max = puzzleArray[x][y];
						visNum = visNum + 1;
				}
				}
			System.out.print(visNum + " ");
			visNum = 1;
			}
			System.out.println(" ");
		}
		
//Main Method
	public static void main(String[] args) {
	Skyscraper s = new Skyscraper();
	
	System.out.println("Enter the puzzle:");
	s.loadPuzzle();
	s.verifyPlacement();
	
	if (s.verifyPlacement()) {
		System.out.println("The puzzle is valid");
		s.printWithVisibility();
	} else {
		System.out.println("The puzzle is not valid");
	}
		
}
}
