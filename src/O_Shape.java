//The class making the O Shape
public class O_Shape extends TetrisPiece {
	



	//constructor always named after the name of the class 
	public O_Shape(){
		createPiece();
	}

//Array creating the piece 
	public void createPiece(){

		myArray = new int[][][]{
				{
					{0,0,1,1},
					{0,0,1,1},
					{0,0,0,0},
					{0,0,0,0},
				}, //rotation 1
				
				{
					{0,0,1,1},
					{0,0,1,1},
					{0,0,0,0},
					{0,0,0,0},
				}, //rotation 2
				
				{
					{0,0,1,1},
					{0,0,1,1},
					{0,0,0,0},
					{0,0,0,0},
				}, //rotation 3
				
				{
					{0,0,1,1},
					{0,0,1,1},
					{0,0,0,0},
					{0,0,0,0},
				} //rotation 4

		};
	}
}