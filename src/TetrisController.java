import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class TetrisController extends JPanel implements KeyListener{
	//setting up the actual timer
	private Timer timeTetris;
	//setting up speed for the timer 
	public static final int DEFAULT_DROP_RATE = 1000;
	//instance of the tetris board
	private TetrisBoard board;
	//instance of the view 
	private TetrisView viewProgram;
	//instance of the timer
private JTextArea tetriceScore;

	public TetrisController(){
		super(new BorderLayout());
		board = new TetrisBoard();
		viewProgram = new TetrisView();
		
		tetriceScore = new JTextArea("Number of Rows: "+ Integer.toString(board.getLinesCount())
				+"\n" + "Number of Tetrices: " + Integer.toString(board.getTetricesCount()));
		
		this.add(tetriceScore, BorderLayout.NORTH);
		this.add(viewProgram, BorderLayout.CENTER);
		this.setFocusable(true);
		addKeyListener(this);
		setupTimer();
		
		viewProgram.setBoardCopy(board.getBoard(), board.getTetricesCount(), board.getLinesCount());
		

		//listening to action

	}

//setting up the timer 
	
	public void setupTimer(){
		System.out.println("hi");
		timeTetris = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//moves the piece down and then it'll update the view!!!!
	
				board.moveDown();
				board.blankSpace();
				board.placePiece();
				viewProgram.setBoardCopy(board.getBoard(), board.getTetricesCount(), board.getLinesCount());
				//this repaints the view 
				viewProgram.repaint();
			}

		});
		
		//adds the timer
		timeTetris.start();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void keyPressed(KeyEvent e) {
		char code = (char)e.getKeyCode();
		switch(code){
		case KeyEvent.VK_DOWN:
			board.moveDown();
			break;
		case KeyEvent.VK_RIGHT:
			board.moveRight();
			break;
		case KeyEvent.VK_LEFT:
			board.moveLeft();
			break;
		case KeyEvent.VK_X:
			board.setRotationClockwise();
			break;
		case KeyEvent.VK_Z:
		board.setRotationCounterClockwise();
		}
		board.blankSpace();
		board.placePiece();
		viewProgram.setBoardCopy(board.getBoard(), board.getTetricesCount(), board.getLinesCount());
		//this repaints the view 
		this.repaint();
tetriceScore.setText("Number of Rows: "+ Integer.toString(board.getLinesCount())
				+"\n" + "Number of Tetrices: " + Integer.toString(board.getTetricesCount()));
	}
public void refreshDisplay(){
	this.repaint();
	
}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
