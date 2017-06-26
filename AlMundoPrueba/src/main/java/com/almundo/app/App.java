package com.almundo.app;

import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		for (int i=0; i<10 ; i++){
			Random aleatorio = new Random();
			System.out.println((5 + aleatorio.nextInt((10+1)-5))*1000);
		}
	}
}
