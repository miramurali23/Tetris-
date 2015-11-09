//The class making the I Shape
public class L_Shape extends TetrisPiece {
	



		//constructor always named after the name of the class 
		public L_Shape(){
			createPiece();
		}
	//array creating the piece 

		public void createPiece(){

			myArray = new int[][][]{
					{
						{0,1,1,1},
						{0,1,0,0},
						{0,0,0,0},
						{0,0,0,0},
					}, //rotation 1

					{
						{0,0,1,0},
						{0,0,1,0},
						{0,0,1,1},
						{0,0,0,0},
					},//rotation 2
					{
						{0,0,0,1},
						{0,1,1,1},
						{0,0,0,0},
						{0,0,0,0},
					},//rotation 3
					{
						{0,0,1,1},
						{0,0,0,1},
						{0,0,0,1},
						{0,0,0,0},
					},
			};//rotation 4



		}

	}

