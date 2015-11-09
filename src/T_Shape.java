//class making the T Shape 
public class T_Shape extends TetrisPiece{
	
	
	
	//constructor or the main of my class will read the method to create my T-shape pieces 
	
public T_Shape(){
	createPiece();
}


//The array creating the piece 
public void createPiece(){
	myArray = new int[][][]{
			{
				{0,1,1,1},
				{0,0,1,0},
				{0,0,0,0},
				{0,0,0,0},
			}, //rotation 1

			{
				{0,0,1,0},
				{0,0,1,1},
				{0,0,1,0},
				{0,0,0,0},
			},//rotation 2
			{
				{0,0,1,0},
				{0,1,1,1},
				{0,0,0,0},
				{0,0,0,0},
			},//rotation 3
			{
				{0,0,1,0},
				{0,1,1,0},
				{0,0,1,0},
				{0,0,0,0},
			},
	};//rotation 4


}

}
