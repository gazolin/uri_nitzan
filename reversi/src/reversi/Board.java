package reversi;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Board extends JPanel {
	private final int N;
	private int [][] array;
	private JButton [][]buttons;
	
	public Board (int size){
		
	    setLayout(new GridLayout(size,size));
	    Color temp;
		N=size;
		array = new int [N][N];
		buttons = new JButton[N][N];
		for (int i=0; i < N; i++){
    		if(i%2 == 0)
    			temp = Color.cyan;
    		else
    			temp = Color.DARK_GRAY;
    		
    		for (int j=0; j < N; j++){
    			JPanel panel = new JPanel();
    			panel.setBackground(temp);
    			if (temp.equals(Color.DARK_GRAY))
    				temp = Color.cyan;
    			else
    				temp = Color.DARK_GRAY;
    			add(panel);
    		}
    	}
	}
		
		
}
	


