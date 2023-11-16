package org.generation.italy;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Float[] elencoCarte={1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,
					   1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,
					   1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,
					   1f,2f,3f,4f,5f,6f,7f,0.5f,0.5f,0.5f,};	
		int carta = 0;
		Float contatore=0f,tot=0f;
		Random R=new Random();
		String risposta,risposta2;
		do
		{
			do
			{		
				carta=R.nextInt(elencoCarte.length);
				System.out.println("la carta pescata: "+ elencoCarte[carta]);
				contatore=elencoCarte[carta];
				tot=tot+contatore;
				System.out.println("stai a: " +tot);
				if (tot>7.5f)
				{
					System.out.println("hai sballato");
					break;
				}
				if (tot==7.5f)
				{
					System.out.println("grande!"); 
					break;
				}
				if (tot<7.5f)
					System.out.println("vuoi pescare un'altra carta?"); 
					risposta=sc.nextLine();		
					
				} while (risposta.equals("si"));
		
		System.out.println("vuoi giocare ancora?");
		risposta2=sc.nextLine();	
		tot=0f;
		
		} while (risposta2.equals("si"));	
		
sc.close();
	}

}
