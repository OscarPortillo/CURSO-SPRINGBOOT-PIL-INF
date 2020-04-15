package SnakePortillo;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

/**
 * Clase ImagenSnake
 * @author oscar
 *
 */
public class ImagenSnake extends JPanel{

	/**
	 * Método sobreescrito
	 */
	Point snake;
	int widthPoint = 10;
	int heightPoint = 10;
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.drawRect(snake.x, snake.y, widthPoint, heightPoint);
	}
}
