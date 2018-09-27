package awt;

import java.awt.*;
import java.awt.event.*;

public class MouseMotionDemo  extends Frame implements MouseListener,MouseMotionListener, WindowListener{
	private TextField tfMouseClickX;
	private TextField tfMouseClickY;
	private TextField tfMousePositionX;
	private TextField tfMousePositionY;
	   
	public MouseMotionDemo() {
		setLayout(new FlowLayout());
		
		add(new Label("X-Click: "));
		this.tfMouseClickX=new TextField(10);
		this.tfMouseClickX.setEditable(false);
		add(this.tfMouseClickX);
		add(new Label("X-Click: "));
		this.tfMouseClickY=new TextField(10);
		this.tfMouseClickY.setEditable(false);
		add(this.tfMouseClickY);

	    add(new Label("X-Position: "));
	    this.tfMousePositionX=new TextField(10);
		this.tfMousePositionX.setEditable(false);
		add(this.tfMousePositionX);
	    add(new Label("Y-Position: "));
	    this.tfMousePositionY=new TextField(10);
		this.tfMousePositionY.setEditable(false);
		add(this.tfMousePositionY);
		
	    addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(this);
		setTitle("MouseEventDemo");
		setSize(370,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseMotionDemo app=new MouseMotionDemo();
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
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.tfMousePositionX.setText(arg0.getX()+"");
		this.tfMousePositionY.setText(arg0.getY()+"");
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		this.tfMouseClickX.setText(arg0.getX()+"");
		this.tfMouseClickY.setText(arg0.getY()+"");
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
