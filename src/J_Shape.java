//The class making the J Shape
public class J_Shape extends TetrisPiece {
	



		//constructor always named after the name of the class 
		public J_Shape(){
			createPiece();
		}
//The array actually making the J Shape piece 

		public void createPiece(){

			myArray = new int[][][]{
					{
						{0,1,1,1},
						{0,0,0,1},
						{0,0,0,0},
						{0,0,0,0},
					}, //rotation 1

					{
						{0,0,1,1},
						{0,0,1,0},
						{0,0,1,0},
						{0,0,0,0},
					},//rotation 2
					{
						{0,1,0,0},
						{0,1,1,1},
						{0,0,0,0},
						{0,0,0,0},
					},//rotation 3
					{
						{0,0,1,0},
						{0,0,1,0},
						{0,1,1,0},
						{0,0,0,0},
					},
			};//rotation 4



		}

	}
