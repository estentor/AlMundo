package com.almundo.app;

import java.util.Random;

public class Call implements Runnable {

	
	
	
	public void run() {
		try {
			Thread.sleep(duracion());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static int duracion(){
		Random aleatorio = new Random();
		return (5 + aleatorio.nextInt((10+1)-5)*1000);
	}
}
