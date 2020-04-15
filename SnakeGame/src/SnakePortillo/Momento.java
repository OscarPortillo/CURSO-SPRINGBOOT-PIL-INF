package SnakePortillo;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

import Constants.Constants;

public class Momento extends  Thread {

	long last = 0;
	public void run() {
		while(true) {
			if((java.lang.System.currentTimeMillis() - last) > Constants.frecuencia) {
				if(!Constants.gameOver) {
					if(Constants.direccion == KeyEvent.VK_UP) {
						Constants.snake.y = Constants.snake.y - Constants.heightPoint;
						if (Constants.snake.y > Constants.height) {
							Constants.snake.y = 0;
						}

						if(Constants.snake.y < 0) {
							Constants.snake.y = Constants.height - Constants.heightPoint;
						}

					} else if(Constants.direccion == KeyEvent.VK_DOWN) {
						Constants.snake.y = Constants.snake.y + Constants.heightPoint;
						if (Constants.snake.y > Constants.height) {
							Constants.snake.y = 0;
						}
						if(Constants.snake.y < 0) {
							Constants.snake.y = Constants.height - Constants.heightPoint;
						}

					} else if(Constants.direccion == KeyEvent.VK_LEFT) {
						Constants.snake.x = Constants.snake.x - Constants.widthPoint;
						if (Constants.snake.x > Constants.height) {
							Constants.snake.x = 0;
						}

						if(Constants.snake.x < 0) {
							Constants.snake.x = Constants.width - Constants.widthPoint;
						}

					} else if(Constants.direccion == KeyEvent.VK_RIGHT) {
						Constants.snake.x = Constants.snake.x + Constants.widthPoint;
						if (Constants.snake.x > Constants.height) {
							Constants.snake.x = 0;
						}
						if(Constants.snake.x < 0) {
							Constants.snake.x = Constants.width - Constants.widthPoint;
						}

					}
				}

				actualizar();
				last = java.lang.System.currentTimeMillis();	
			}
		}
	}
	public void actualizar() {
		Constants.imagenSanke.repaint();
		Constants.lista.add(0, new Point(Constants.snake.x, Constants.snake.y));
		Constants.lista.remove((Constants.lista.size()-1));

		for(int i = 1; i < Constants.lista.size(); i++ ) {
			Point punto = Constants.lista.get(i);
			if(Constants.snake.x == punto.x && Constants.snake.y == punto.y) {
				Constants.gameOver = true;
			}
		}

		if((Constants.snake.x > (Constants.comida.x - 10 )) && (Constants.snake.x < (Constants.comida.x + 10 )) 
				&& (Constants.snake.y > (Constants.comida.y - 10 )) && (Constants.snake.y < (Constants.comida.y + 10 ))) {
			Constants.lista.add(0, new Point(Constants.snake.x, Constants.snake.y));
			crearComida();
		}
	}
	public static void crearComida() {
		Random rnd = new Random();

		Constants.comida.x = rnd.nextInt(Constants.width);

		if((Constants.comida.x % 5) > 0) {
			Constants.comida.x = Constants.comida.x - (Constants.comida.x % 5);// será un valor multiplo de 5
		}

		if(Constants.comida.x < 5 ) {
			Constants.comida.x = Constants.comida.x + 10;
		}
		Constants.comida.y = rnd.nextInt(Constants.height);

		if((Constants.comida.y % 5) > 0) {
			Constants.comida.y = Constants.comida.y - (Constants.comida.y % 5);// será un valor multiplo de 5
		}

		if(Constants.comida.y < 5 ) {
			Constants.comida.y = Constants.comida.y + 10;
		}
	}
	public static void startGame() {
		Constants.comida = new Point(200, 200);
		Constants.snake = new Point(Constants.width/2, Constants.height/2);

		Constants.lista = new ArrayList<Point>();
		Constants.lista.add(Constants.snake);
		crearComida();
	}
}