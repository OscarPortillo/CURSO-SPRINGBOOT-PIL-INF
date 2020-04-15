package SnakePortillo;

import javax.swing.JFrame;

import Constants.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Point;

/**
 * 
 * @author oscar
 *
 */
@SuppressWarnings("serial")
public class Snake extends JFrame{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Snake snake = new Snake();
	}

	/**
	 * Método constructor
	 */
	public Snake() {
		setTitle("Snake GAME");

		setSize(Constants.height, Constants.height);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-Constants.width/2, dim.height/2-Constants.height/2);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Teclas teclas = new Teclas();
		this.addKeyListener(teclas);

		Constants.snake = new Point(Constants.width/2, Constants.height/2);

		Momento.startGame();

		Constants.imagenSanke = new ImagenSnake();
		this.getContentPane().add(Constants.imagenSanke);

		setVisible(true);

		Momento momento = new Momento();

		Thread trid = new Thread(momento);
		trid.start();
	}

}
