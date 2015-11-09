//the class making the I Shape
public class I_Shape extends TetrisPiece {
	



		//constructor always named after the name of the class 
		public I_Shape(){
			createPiece();
		}
		
//The array making the piece 
		public void createPiece(){

			myArray = new int[][][]{
					{
						{1,1,1,1},
						{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0},
					}, //rotation 1

					{
						{0,0,1,0},
						{0,0,1,0},
						{0,0,1,0},
						{0,0,1,0},
					},//rotation 2
				
					{
						{1,1,1,1},
						{0,0,0,0},
						{0,0,0,0},
						{0,0,0,0},
					}, //rotation 1

					{
						{0,0,1,0},
						{0,0,1,0},
						{0,0,1,0},
						{0,0,1,0},
					},//rotation 2


		};

	}
}
