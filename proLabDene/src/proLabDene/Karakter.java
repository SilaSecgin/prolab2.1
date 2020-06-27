package proLabDene;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Karakter extends JPanel {
	
	private String Ad,Tur;
	private int satir,sutun;
	
	
	
	JPanel panel1;
	char[] dizi;
	char [][] matris ;
	JButton buton[][];
	

	public Karakter() {
		super();
		
	
		dizi=new char[154];
		panel1 =new JPanel();
		panel1.setPreferredSize(new Dimension(850, 650));
		panel1.setFocusable(true);
		panel1.requestFocusInWindow();
		setSize(700, 600);
		ekranCiz();
		
		
	}
	
	
	//public int satir=5,sutun=6;
	public char satirSutun[][] = new char[200][200];
	public String oku;
	public String kelime;
	public String[] satirOku;
	public String[] satirOku2;
	public String[] satirOku3;
	public String kotuKarakter1;
	public String kapi1;

	
	public void ekranCiz(){
		
				
		int i=0;
		  BufferedReader br ;
		  
			
			try {
				
				br = new BufferedReader(new FileReader("C:\\Users\\ferhat\\Desktop\\proLAB2 proje 1\\Harita.txt"));
				kelime = br.readLine();
				
				satirOku=kelime.split(",");
				satirOku2=satirOku[0].split(":");
				satirOku3=satirOku[1].split(":");
				kotuKarakter1=satirOku2[1];
				kapi1=satirOku3[1];
				
				
	            int num=0;
	            char ch;
	            while((num=br.read()) != -1)
	            {	            	
	                ch=(char)num;        
	                if(ch=='0' || ch=='1')
	                {
	                	dizi[i]=ch;
	                	 i++;
	                }
	
	            }
	          
	           
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		int k=0;
		
		

		panel1.setLayout(new GridLayout(11, 14));
		buton = new JButton[14][14];

		 matris  = new char[200][200];
		
		for( i=0;i<11;i++)
		{
			for(int j=0;j<14;j++)
			{
				matris[i][j]=dizi[k];
				
				buton[i][j] = new JButton();
        		
				buton[i][j].setText(Character.toString(matris[i][j]));
				panel1.add(buton[i][j]);		
				
				if(dizi[k]=='0')
				{
				buton[i][j].setOpaque(true); 
				buton[i][j].setBackground(Color.blue); 
				
				}
				
					
				k++;
				add(panel1);
			}
			
		}
		
		///GÝRÝÞLER 
    	buton[0][4].setText("B");
    	buton[0][4].setBackground(Color.red);
    	buton[0][4].setForeground(Color.white);
    	
    	buton[0][12].setText("C");
    	buton[0][12].setBackground(Color.red);
    	buton[0][12].setForeground(Color.white);
    	
    	buton[5][0].setText("A");
    	buton[5][0].setBackground(Color.red);
    	buton[5][0].setForeground(Color.white);
    	
    	buton[5][13].setText("D");
    	buton[5][13].setBackground(Color.red);
    	buton[5][13].setForeground(Color.white);
    	
    	buton[10][4].setText("E");
    	buton[10][4].setBackground(Color.red);
    	buton[10][4].setForeground(Color.white);
    	
    	
			
		satirSutun = matris;
		
		
	
		
	}
	
	 


public String getAd() {
	return Ad;
}


public void setAd(String ad) {
	Ad = ad;
}


public String getTur() {
	return Tur;
}


public void setTur(String tur) {
	Tur = tur;
}


public int getSatir() {
	return satir;
}


public void setSatir(int satir) {
	this.satir = satir;
}


public int getSutun() {
	return sutun;
}


public void setSutun(int sutun) {
	this.sutun = sutun;
}

}
