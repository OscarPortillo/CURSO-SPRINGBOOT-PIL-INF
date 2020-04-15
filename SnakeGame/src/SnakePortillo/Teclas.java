package SnakePortillo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import Constants.Constants;


/**
 * Clase Teclas
 * @author oscar
 *
 */
public class Teclas extends KeyAdapter{
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		} else if(e.getKeyCode() == KeyEvent.VK_UP) {
			if(Constants.direccion != KeyEvent.VK_DOWN) {
				Constants.direccion = KeyEvent.VK_UP;
			}
		} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			if(Constants.direccion != KeyEvent.VK_UP) {
				Constants.direccion = KeyEvent.VK_DOWN;
			}
		} else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			if(Constants.direccion != KeyEvent.VK_RIGHT) {
				Constants.direccion = KeyEvent.VK_LEFT;
			}
		} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(Constants.direccion != KeyEvent.VK_LEFT) {
				Constants.direccion = KeyEvent.VK_RIGHT;
			}
		}
	}
}
