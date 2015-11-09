

//creating the abstract class Tetris Piece 
public abstract class TetrisPiece {
	
	//setting up the 2D array for my piece!!	
		protected int[][][] myArray;
	//setting up the initial rotation to be at 0!
		protected int rotation = 0;
	//calling the non absteact method createPiece 
		public abstract void createPiece();
	//creating the method for rotating clockwise for piece 
		public void rotateClockwise(){
			
			rotation = (rotation +1)%4;
			
		}
	//creating the method for rotating counter clockwise for piece 
		public void rotateCounterClockwise(){
			
			if(rotation == 0){
				rotation = 3;
			}
			else{
				rotation = (rotation -1)%4;
			}
			
		}

		/**
		 * returns true if myArray[rot][row][col]==1. otherwise will return false 
		 * @param row
		 * @param col
		 * @param rot
		 * @return
		 */
	//boolean method that fills the piece if it's equal to 0, anything else it won't fill!
		public boolean isFilled(int row, int col, int rot){
			if(myArray[rot][row][col]==0){
				return false;
			}
			else{
				return true;
			}
		}
	//the getter method returning your piece using int return type 
		public int[][][] getMyArray() {
			return myArray;
		}
	//the getter method returning your rotation using int return type 
		public int getRotation() {
			return rotation;
		}
	}




