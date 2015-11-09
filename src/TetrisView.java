import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//The tetris view class 
public class TetrisView extends JPanel{

	//instance of JLabel
	JLabel score; 
	JLabel score2;

	//global variable for drawing the board
	int[][] boardcopy;
	int tetriceValue;
	int lineValue;


	//constructor that would instantiate the board and score//add everything to JPanel
	public TetrisView(){
	super(new BorderLayout());

	}
//setting up the Board 
	public void setBoardCopy(int[][] settingBoard, int tetriceValue, int lineValue){

		boardcopy = settingBoard;
		this.tetriceValue=tetriceValue;
		this.lineValue=lineValue;
		repaint();

	}


	//paint the board 
	public void paint(Graphics g){
		
		//the moving pieces will be pink 
		for(int y = 0; y < boardcopy.length; y++){
			for(int x = 0; x < boardcopy[y].length; x++){
				if(boardcopy[y][x] == 1){
					g.setColor(Color.PINK);
					g.fillRect(x *21,45+ y *21, 20, 20);
				}//filling the board color white
				else if(boardcopy[y][x] == 0){
					g.setColor(Color.WHITE);
					g.fillRect(x *21,45+ y *21, 20, 20);
					
				}//the stagnant piece will be blue 
				else if(boardcopy[y][x] == 2){
					g.setColor(Color.BLUE);
					g.fillRect(x *21,45+ y *21, 20, 20);
				}

			}
		}


	}



}
