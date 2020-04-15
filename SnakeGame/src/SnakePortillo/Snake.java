package SnakePortillo;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.Point;


public class Snake extends JFrame{

	int height = 640;
	int width = 480;
	
	int heightPoint = 10;
	int widthPoint = 10;
	
	Point snake;
	ImagenSnake imagenSanke;
	public Snake() {
		setTitle("Snake Game");
		
		setSize(width, height);
		
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-width/2, dim.height/2-height/2);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Teclas teclas = new Teclas();
		this.addKeyListener(teclas);
		
		snake = new Point(width/2, height/2);
		
		imagenSanke = new ImagenSnake();
		this.getContentPane().add(imagenSanke);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake snake = new Snake();
	}

	public class ImagenSnake extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setColor(new Color(0, 0, 255));
			g.drawRect(snake.x,  snake.y, widthPoint, heightPoint);
		}
	}
	
	public class Teclas  extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE) {
				System.exit(0);
			}
		}
	}
}
