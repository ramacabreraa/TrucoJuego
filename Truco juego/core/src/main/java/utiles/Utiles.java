package utiles;

import java.util.Random;
import java.util.Scanner;

public class Utiles {
	public static Random r = new Random();
	public static Scanner s = new Scanner(System.in);

	public static void esperar(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}