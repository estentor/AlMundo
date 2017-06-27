package com.almundo.app;

import java.util.Random;

public class Dispatcher implements Runnable {


	public static void main (String[] args){
		for (int i = 0;  i< 10 ; i++){
			dispatcherCall(generarLlamada(i));
		}
	}

	public static Thread generarLlamada(int i){
		Thread t = new Thread();
		t.setName("Llamada "+(i+1));
		return t;
	}
	
	public static void dispatcherCall(Thread t){
		System.out.println(t.getName());
	}

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
