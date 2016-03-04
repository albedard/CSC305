package snake;
import java.util.Scanner;
import java.awt.*;

public class Snake  {
	
	
	
	public Snake(){
		length=1;
	};
	
	private int x,y;
	private int length;
	
	public void move(int somex, int somey){
		x=somex++;
		y=somey++;
	}
	
	
	
	public void paint(Graphics g){
		//head
		g.drawRect(x,y,15,15);
		
		//middle
		
		
		//tail
	}
	
	
	
	
	
}
