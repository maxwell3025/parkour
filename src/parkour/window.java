package parkour;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class window extends JFrame{

	public window() {

		setSize(1000, 1000);
		setVisible(true);
	}

	public void paint(Graphics g) {
		for (int x = 400; x < 600; x++) {
			for (int y = 400; y < 600; x++) {
				if((50-Math.sqrt((x-470)*(x-470)+(y-500)*(y-500)))+(50-Math.sqrt((x-530)*(x-530)+(y-500)*(y-500)))>0||true){
					g.fillRect(x, y, 1, 1);
				}
			}
		}
	}
	public static void main(String[] args){
		window w = new window();
	}

	



}
