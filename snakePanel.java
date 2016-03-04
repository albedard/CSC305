package snake;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.event.MouseInputListener;

public class snakePanel extends Applet implements Runnable ,MouseListener {
	
	private enum Direction {LEFT,RIGHT,UP,DOWN}
	
	Snake snake= new Snake();
	
	Direction direction;
	
	//Basically the same thing as the main method for a java application
	public void init(){
		this.setSize(300,300);
		start();
	}
	
	
	
	public void paint(Graphics g){
		snake.paint(g);
	}
	
	
	public void start() {
		Thread thread= new Thread(this);
		thread.start();
    }

    public void stop() {
    	
    }

    public void destroy() {
    }

    /**Repaints the applet, then makes the thread sleep for .1 seconds*/
	@Override
	public void run() {
		switch(direction){
		case LEFT:
			snake.move(-1,0);
		
		try{
			Thread.sleep(100); //.1 seconds (10fps)
			repaint();
		}catch(Exception e){
			System.out.println(e);
		}
	}
		
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
