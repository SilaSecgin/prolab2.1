package proLabDene;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Stormtrooper extends Karakter {
	

	public Stormtrooper()
	{
		super();
		
		setAd("Stormtrooper");
		setTur("kötü");
		setSatir(0);
		setSutun(4);
		System.out.println("merhaba");
		buton[getSatir()][getSutun()].setBackground(Color.orange);
		
		
	}
	
	public void stormHareket(){
		
		
		
		panel1.addKeyListener(new KeyListener() {
			
		
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub	
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				// TODO Auto-generated method stub
				 if("Right".equals(KeyEvent.getKeyText(e.getKeyCode()))) {
                    //System.out.println("Right Button Detected");
                    System.out.println("evet");
					 
				 }
							
			}
		});
		
		
	}
	


}
