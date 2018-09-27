package awt;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, WindowListener{
	private TextField tfMouseX;
	private TextField tfMouseY;
	
	public MouseEventDemo() {
		setLayout(new FlowLayout());
		
		add(new Label("X-Click: "));
		this.tfMouseX=new TextField(10);
		this.tfMouseX.setEditable(false);
		add(this.tfMouseX);
		add(new Label("Y-Click: "));
		this.tfMouseY=new TextField(10);
		this.tfMouseY.setEditable(false);
		add(this.tfMouseY);

		addMouseListener(this);
		addWindowListener(this);
		setTitle("MouseEventDemo");
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		MouseEventDemo app=new MouseEventDemo();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.tfMouseX.setText(arg0.getX()+"");
		this.tfMouseY.setText(arg0.getY()+"");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
