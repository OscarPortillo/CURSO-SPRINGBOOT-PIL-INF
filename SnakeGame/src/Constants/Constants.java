package Constants;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import SnakePortillo.ImagenSnake;

/**
 * 
 * @author oscar
 *
 */
public class Constants {
	/**
	 * 
	 */
	public final static Integer height = 640;
	public final static Integer width = 480;
	
	public static boolean gameOver = false;
	
	public static int heightPoint = 10;
	public static int widthPoint = 10;
	public static int  direccion = KeyEvent.VK_LEFT;

	public static long frecuencia = 50;
	public static Point snake;
	public static Point comida;
	
	public static ArrayList<Point> lista;
	public static ImagenSnake imagenSanke;
}
