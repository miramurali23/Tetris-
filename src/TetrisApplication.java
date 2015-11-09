import javax.swing.JFrame;


//The application in which I am running the actual tetris game 
public class TetrisApplication{
	//main method
	public static void main(String[] args){

		JFrame tetris = new JFrame("Tetris!");
		tetris.setSize(300,500);
		tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//add a new tetris controller
		tetris.add(new TetrisController());
		
		tetris.setVisible(true);



	}

}
