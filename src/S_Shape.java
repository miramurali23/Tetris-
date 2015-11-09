
//class making the S shape 
public class S_Shape extends TetrisPiece{





	//constructor always named after the name of the class 
	public S_Shape(){
		createPiece();
	}

//array creating the piece 
	public void createPiece(){

		myArray = new int[][][]{
				{
					{0,0,1,1},
					{0,1,1,0},
					{0,0,0,0},
					{0,0,0,0},
				}, //rotation 1

				{
					{0,1,0,0},
					{0,1,1,0},
					{0,0,1,0},
					{0,0,0,0},
				},//rotation 2
				{
					{0,0,1,1},
					{0,1,1,0},
					{0,0,0,0},
					{0,0,0,0},
				},//rotation 3
				{
					{0,1,0,0},
					{0,1,1,0},
					{0,0,1,0},
					{0,0,0,0},
				},
		};//rotation 4



	}

}
