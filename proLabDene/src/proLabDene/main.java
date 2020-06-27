package proLabDene;

import java.awt.event.KeyEvent;
import java.util.Scanner;

import javax.swing.JFrame;



public class main {

	public static void main(String[] args ) {
		
		
		System.out.println("----------Ýyi Karakterler----------");
		System.out.println("1.Luke Skywalker");
		System.out.println("2.Master Yoda");
		
		Scanner scan=new Scanner(System.in);
		
		int secenek =scan.nextInt();
		
		LukeSkywalker luke= new LukeSkywalker();	
		MasterYoda yoda= new MasterYoda();

		JFrame pen =new JFrame();
		
		if(secenek == 1)
		{
		pen.add(luke);	
		pen.setSize(900,700);	
		pen.setVisible(true);
	
					
		}
		else if(secenek == 2)
		{
			
			
			pen.add(yoda);
			pen.setSize(900,700);
			pen.setVisible(true);	
			
		}
		
		
		
	
		
			
	}

}
