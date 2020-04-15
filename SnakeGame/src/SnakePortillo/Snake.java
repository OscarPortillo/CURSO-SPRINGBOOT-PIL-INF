package SnakePortillo;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Constants.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Toolkit;
import java.awt.Point;


public class Snake extends JFrame{

	//int height = 640;
	//int width = 480;

	Point snake;
	Point comida;

	//boolean gameOver = false;

	ArrayList<Point> lista;

//	int  direccion = KeyEvent.VK_LEFT;
//
//	long frecuencia = 50;

	ImagenSnake imagenSanke;
	public Snake() {
		setTitle("Snake GAME");

		setSize(Constants.height, Constants.height);

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-Constants.width/2, dim.height/2-Constants.height/2);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Teclas teclas = new Teclas();
		this.addKeyListener(teclas);

		snake = new Point(Constants.width/2, Constants.height/2);

		startGame();

		imagenSanke = new ImagenSnake();
		this.getContentPane().add(imagenSanke);

		setVisible(true);

		Momento momento = new Momento();

		Thread trid = new Thread(momento);
		trid.start();
	}

	public void startGame() {
		comida = new Point(200, 200);
		snake = new Point(Constants.width/2, Constants.height/2);

		lista = new ArrayList<Point>();
		lista.add(snake);
		crearComida();
	}

	public void crearComida() {
		Random rnd = new Random();

		comida.x = rnd.nextInt(Constants.width);

		if((comida.x % 5) > 0) {
			comida.x = comida.x - (comida.x % 5);// será un valor multiplo de 5
		}

		if(comida.x < 5 ) {
			comida.x = comida.x + 10;
		}
		comida.y = rnd.nextInt(Constants.height);

		if((comida.y % 5) > 0) {
			comida.y = comida.y - (comida.y % 5);// será un valor multiplo de 5
		}

		if(comida.y < 5 ) {
			comida.y = comida.y + 10;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake snake = new Snake();
	}

	public void actualizar() {
		imagenSanke.repaint();
		lista.add(0, new Point(snake.x, snake.y));
		lista.remove((lista.size()-1));

		for(int i = 1; i < lista.size(); i++ ) {
			Point punto = lista.get(i);
			if(snake.x == punto.x && snake.y == punto.y) {
				Constants.gameOver = true;
			}
		}

		if((snake.x > (comida.x - 10 )) && (snake.x < (comida.x + 10 )) 
				&& (snake.y > (comida.y - 10 )) && (snake.y < (comida.y + 10 ))) {
			lista.add(0, new Point(snake.x, snake.y));
			crearComida();
		}
	}

	public class ImagenSnake extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(new Color(0, 0, 255));
			g.fillRect(snake.x,  snake.y, Constants.widthPoint, Constants.heightPoint);//el rectangulo relleno
			for(int i = 0; i < lista.size(); i++) {
				Point point = lista.get(i);
				g.fillRect(point.x,  point.y, Constants.widthPoint, Constants.heightPoint);//el rectangulo relleno
			}

			g.setColor(new Color(255, 0, 0));
			g.fillRect(comida.x,  comida.y, Constants.widthPoint, Constants.heightPoint);//el rectangulo relleno
			
			if(Constants.gameOver) {
				g.drawString("You lose", 200, 320);
			}
			
		}
	}

	public class Teclas  extends KeyAdapter{
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

	public class Momento extends  Thread {

		long last = 0;
		public void run() {
			while(true) {
				if((java.lang.System.currentTimeMillis() - last) > Constants.frecuencia) {
					if(!Constants.gameOver) {
						if(Constants.direccion == KeyEvent.VK_UP) {
							snake.y = snake.y - Constants.heightPoint;
							if (snake.y > Constants.height) {
								snake.y = 0;
							}

							if(snake.y < 0) {
								snake.y = Constants.height - Constants.heightPoint;
							}

						} else if(Constants.direccion == KeyEvent.VK_DOWN) {
							snake.y = snake.y + Constants.heightPoint;
							if (snake.y > Constants.height) {
								snake.y = 0;
							}
							if(snake.y < 0) {
								snake.y = Constants.height - Constants.heightPoint;
							}

						} else if(Constants.direccion == KeyEvent.VK_LEFT) {
							snake.x = snake.x - Constants.widthPoint;
							if (snake.x > Constants.height) {
								snake.x = 0;
							}

							if(snake.x < 0) {
								snake.x = Constants.width - Constants.widthPoint;
							}

						} else if(Constants.direccion == KeyEvent.VK_RIGHT) {
							snake.x = snake.x + Constants.widthPoint;
							if (snake.x > Constants.height) {
								snake.x = 0;
							}
							if(snake.x < 0) {
								snake.x = Constants.width - Constants.widthPoint;
							}

						}
					}

					actualizar();
					last = java.lang.System.currentTimeMillis();	
				}
			}
		}
	}
}
