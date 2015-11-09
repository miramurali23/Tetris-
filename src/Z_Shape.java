//class creating the Z shape 
public class Z_Shape extends TetrisPiece {
	//variables
		



		//constructor always named after the name of the class 
		public Z_Shape(){
			createPiece();
		}
	
//2D array making the piece 
		public void createPiece(){

			myArray = new int[][][]{
					{
						{1,1,0,0},
						{0,1,1,0},
						{0,0,0,0},
						{0,0,0,0},
					}, //rotation 0

					{
						{0,0,1,0},
						{0,1,1,0},
						{0,1,0,0},
						{0,0,0,0},
					},//rotation 2
					{
						{1,1,0,0},
						{0,1,1,0},
						{0,0,0,0},
						{0,0,0,0},
					},//rotation 3
					{
						{0,0,1,0},
						{0,1,1,0},
						{0,1,0,0},
						{0,0,0,0},
					},
			};//rotation 4



		}

	}


