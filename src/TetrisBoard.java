//Declaring the class Tetris Board
public class TetrisBoard {
	//setting up the tetris board size 
	private int[][] board = new int[18][10];
	//calls the abstract class tetris piece to hold
	TetrisPiece currentPiece;
//initializing the initial point of x value of your piece which will be zero
	private int xPoint = 0;
//initializing the initial point of y value of your piece which will be zero as well
	private int yPoint = 0;
//initializing the initial point of your r(rotation) value which will be zero
	private int r = 0;
	private int rotation = 0;
//initializing the stagnant value of tetris piece which would be 2 in our case 
	private int bottomPiece = 2;
//making the instance of the view
	TetrisView view;
//making the tetrices count
	private int tetricesCount = 0;
//making lines count 
	private int linesCount = 0;

	
	//The getter method to obtain the value of xPoint
	public int getX() {
		return xPoint;
	}
//The getter method to obtain the value of the yPoint
	public int getY() {
		return yPoint;
	}
//The constructor of the class 
	public TetrisBoard() {
//calling the create tetris piece to make a tetris piece 
		createTetrisPiece();
	}
//constructing a getter method to gt the value of your board 
	public int[][] getBoard() {
	 return board;
	 }
	// initializing the tetris pieces at random
	public void createTetrisPiece() {
		int randomPiece = (int) Math.floor(Math.random() * 7);
		
		switch (randomPiece) {
		case 0:
			currentPiece = new J_Shape();
			break;
		case 1:
			currentPiece = new T_Shape();
			break;
		case 2:
			currentPiece = new L_Shape();
			break;
		case 3:
			currentPiece = new O_Shape();
			break;
		case 4:
			currentPiece = new I_Shape();
			break;
		case 5:
			currentPiece = new Z_Shape();
			break;
		case 6:
			currentPiece = new S_Shape();
			break;
		}
		
		//after you call your pieces at random you call the blank space and place piece method to actually place your piece onto the tetris board!!
		blankSpace();
		placePiece();
	}

	 //prints out the blank spaces in the board
	public void blankSpace() {
		for (int i = 0; i < 18; i++) {// going through the board, thus should
										// have the boards dimensions
			for (int j = 0; j < 10; j++) {
				if (board[i][j] == 1) {
					board[i][j] = 0;

				}
			}
		}
	}

	// putting the pieces onto the board
	public void placePiece() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
//it's an array, so you have to specify what each slot is 
				if (currentPiece.isFilled(i, j, currentPiece.getRotation())) {
				//specifies where the piece is on the board 	
					board[i + yPoint][j + xPoint] = 1;
																		
																
				}
			}
		}

	}

	// check for open space on the board 
	public boolean checkRow(int rowNum) {
		int checkRow = 0;
		for (int x = 0; x < 10; x++) {
			if(board[rowNum][x] == 2){
				++checkRow;
			}
		}
		if(checkRow == 10){
			return true; 
		}
		return false; 
	}

		
	
//detection of a complete row 
	public void deleteRow(){
		int deleteRow = 0;
		for(int i = 0; i < 18; i++){
			boolean accountingVariable = checkRow(i);
			if(accountingVariable == true){
				
			//for COL	
				++deleteRow;
				for(int j = 0; j < 10; j++){
					board[i][j]= 0; 
				}
				for(int j = i; j > 0; j--){
					for(int r = 0; r <10; r++){//moving each row above each row that was deleted down 
						board[j][r]=board[j-1][r];//moving down every static piece 
					}
					
				}
				for(int j=0; j <10; j++){
					board[0][j] = 0;
				}
			}
		}
	
		linesCount += deleteRow; //detecting how many lines are deleted
		tetricesCount += deleteRow / 4; //you divide by 4 because a tetrice is 4 lines
		
	}
	public int getTetricesCount(){
		return tetricesCount;
	}
	public int getLinesCount(){
	return linesCount;
}
//this method is basically checking the collisions of your board 
//so if there is a collision which would be at 2, because you declared
//2 as your stagnant piece and it obviously can't collide with 1 or 0 because
//they are blank spaces or a moving piece 
//if there is a collision it will return true 
	public boolean checkCollisions(int row, int col, int rot) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (currentPiece.isFilled(i, j, rot)) {

					if (board[i + col][j + row] == 2) {
						if(col -1 == yPoint){
							turnintoTwo();
							deleteRow();
							xPoint = 0;
							yPoint = 0;
							createTetrisPiece();
							placePiece();
							
						}
						return true;
					
					}
				}
			}
		}
		return false;

	}

	
	
//this is checking if you will be out of bounds
//the for loop going through the board and locates the current piece
//once it locates the current piece it's going to be like 
//if you are greater than 17 or greater than 9 on the board, it's true you are out of bounds(both x and y)
//if you are less than 0 on the board, it's true you are out bounds
//anything else is a valid move on the board thus would return anything else as false 
	
	public boolean detectOutofBounds(int row, int col, int rot) {
		
		if(col<0){
			return true;//true it is out of bounds!!
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (currentPiece.isFilled(i, j, rot)) {
					
					if(i+col > 17){
						turnintoTwo();
						deleteRow();
						xPoint = 0;
						yPoint = 0;
						createTetrisPiece();
						placePiece();
						
						return true;
						
					}
					if(j+row > 9){
						return true;//checking your bounds 
						
					}
					
					if((i + col < 0) || (j+row < 0)){
						return true;//checking your bounds 
					}
						
				}
			}
		}
		return false; 
	}
	
public void turnintoTwo(){
	for(int i = 0; i <18; i++){
		for(int j = 0; j < 10 ; j++){
			if(board[i][j]  == 1){
				board[i][j] = 2; 
			}
		}
	}
}
//This method basically says if it doesn't go out of bounds and doesn't have a collision it is a valid move!!	
	public boolean validMove(int row, int col, int rot) {
		return (!detectOutofBounds(row, col, rot)
				&& !checkCollisions(row, col, rot)) ;
		
			
	}

//boolean method to say when the piece is moving right 	
	public boolean moveRight() {

		if (validMove(xPoint + 1, yPoint, currentPiece.getRotation())) {
			xPoint++;
			return true;
		} else {
			return false;
		}
	}
//boolean method to say when the piece is moving left 
	public boolean moveLeft() {

		if (validMove(xPoint - 1, yPoint, currentPiece.getRotation())) {
			xPoint--;
			return true;
		} else {
			return false;
		}
	}
//boolean method to say when the piece is moving down 
	public boolean moveDown() {

		if (validMove(xPoint, yPoint + 1, currentPiece.getRotation())) {
			yPoint++;
			return true;
		} else {
			return false;
		}
	}
//boolean method to say when the piece will rotate clockwise
	public boolean setRotationClockwise() {

		currentPiece.rotateClockwise();
		if (validMove(xPoint, yPoint, currentPiece.getRotation())) {
			return true;
		} else {
			currentPiece.rotateCounterClockwise();
			return false;
		}
	}
//boolean method to say when the piece will rotate counter clockwise 
	public boolean setRotationCounterClockwise() {
		currentPiece.rotateCounterClockwise();
		if (validMove(xPoint, yPoint, currentPiece.getRotation())) {
			return true;
		} else {
			currentPiece.rotateClockwise();
			return false;
		}

	}

}
	


