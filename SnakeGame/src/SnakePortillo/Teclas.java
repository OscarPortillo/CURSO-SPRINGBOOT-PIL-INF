package SnakePortillo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


/**
 * Clase Teclas
 * @author oscar
 *
 */
public class Teclas extends KeyAdapter{
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}
}
