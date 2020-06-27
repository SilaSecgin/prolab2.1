package proLabDene;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MasterYoda extends Karakter {
	
	Karakter yoda=new Karakter();
	public MasterYoda()
	{
		super();
		
		yoda.setAd("MasterYoda");
		yoda.setTur("iyi");
		yoda.setSatir(6);
		yoda.setSutun(6);
		buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.green);
		yodaHareket();
		
	}
	
	
	public void yodaHareket(){
		
		
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
                     
                     if(satirSutun[yoda.getSatir()][yoda.getSutun()+1]=='1') {
                    	// System.out.println("Gider");
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.lightGray);
                    	 yoda.setSutun(yoda.getSutun()+1);
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.green);
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
				 }
				 
				 if("Left".equals(KeyEvent.getKeyText(e.getKeyCode()))) {
                    // System.out.println("Left Button Detected");
                     
                     if(satirSutun[yoda.getSatir()][yoda.getSutun()-1]=='1') {
                    	// System.out.println("Gider");
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.lightGray);
                    	 yoda.setSutun(yoda.getSutun()-1);
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.green);
                    	 
                 		
                    	 
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
                     
				 }
				 if("Up".equals(KeyEvent.getKeyText(e.getKeyCode()))) {
                     //System.out.println("Up Button Detected");
                     
                     if(satirSutun[yoda.getSatir()-1][yoda.getSutun()]=='1') {
                    	// System.out.println("Gider");
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.lightGray);
                    	 yoda.setSatir(yoda.getSatir()-1);
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.green);
                    	 
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
                     
				 }
				 if("Down".equals(KeyEvent.getKeyText(e.getKeyCode()))) {
                    // System.out.println("Down Button Detected");
                     
                     if(satirSutun[yoda.getSatir()+1][yoda.getSutun()]=='1') {
                    	// System.out.println("Gider");
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.lightGray);
                    	 yoda.setSatir(yoda.getSatir()+1);
                    	 buton[yoda.getSatir()][yoda.getSutun()].setBackground(Color.green);
                    	 
                     }
                     else {
                    	 System.out.println("Duvar");
                     }
                     
				 }
				 
				
			}
		});
		
		
	}

	
	

}
