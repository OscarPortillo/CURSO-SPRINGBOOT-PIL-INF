package SnakePortillo;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

import Constants.Constants;

/**
 * Clase ImagenSnake
 * @author oscar
 *
 */
@SuppressWarnings("serial")
public class ImagenSnake extends JPanel{

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(0, 0, 255));
		g.fillRect(Constants.snake.x,  Constants.snake.y, Constants.widthPoint, Constants.heightPoint);//el rectangulo relleno
		for(int i = 0; i < Constants.lista.size(); i++) {
			Point point = Constants.lista.get(i);
			g.fillRect(point.x,  point.y, Constants.widthPoint, Constants.heightPoint);//el rectangulo relleno
		}

		g.setColor(new Color(255, 0, 0));
		g.fillRect(Constants.comida.x,  Constants.comida.y, Constants.widthPoint, Constants.heightPoint);//el rectangulo relleno
		
		if(Constants.gameOver) {
			g.drawString("You lose", 200, 320);
		}
		
	}
}
