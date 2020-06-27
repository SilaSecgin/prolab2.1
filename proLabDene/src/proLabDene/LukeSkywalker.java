package proLabDene;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LukeSkywalker extends Karakter {
	
	Karakter luke=new Karakter();
	public LukeSkywalker()
	{
		super();
		
		luke.setAd("LukeSkywalker");
		luke.setTur("iyi");
		luke.setSatir(6);
		luke.setSutun(6);
		buton[luke.getSatir()][luke.getSutun()].setBackground(Color.yellow);
		LukeHareket();
		
	}
	
	
	public void LukeHareket(){
		
		
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
                     
                     if(satirSutun[luke.getSatir()][luke.getSutun()+1]=='1') {
                    	// System.out.println("Gider");
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.lightGray);
                    	 luke.setSutun(luke.getSutun()+1);
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.yellow);
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
				 }
				 
				 if("Left".equals(KeyEvent.getKeyText(e.getKeyCode()))) {
                    // System.out.println("Left Button Detected");
                     
                     if(satirSutun[luke.getSatir()][luke.getSutun()-1]=='1') {
                    	// System.out.println("Gider");
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.lightGray);
                    	 luke.setSutun(luke.getSutun()-1);
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.yellow);
                    	 
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
                     
				 }
				 if("Up".equals(KeyEvent.getKeyText(e.getKeyCode()))) {
                     //System.out.println("Up Button Detected");
                     
                     if(satirSutun[luke.getSatir()-1][luke.getSutun()]=='1') {
                    	// System.out.println("Gider");
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.lightGray);
                    	 luke.setSatir(luke.getSatir()-1);
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.yellow);
                    	 
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
                     
				 }
				 if("Down".equals(KeyEvent.getKeyText(e.getKeyCode()))) {
                    // System.out.println("Down Button Detected");
                     
                     if(satirSutun[luke.getSatir()+1][luke.getSutun()]=='1') {
                    	// System.out.println("Gider");
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.lightGray);
                    	 luke.setSatir(luke.getSatir()+1);
                    	 buton[luke.getSatir()][luke.getSutun()].setBackground(Color.yellow);
                    	 
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
				 }
				 
				
			}
		});
		
		
	}
	
	

	
	
	

}
