package awt;

import java.awt.*;
import java.awt.event.*;

public class KeyEventDemo extends Frame implements KeyListener, WindowListener{
	private TextField tfInput;
	private TextArea taDisplay;
	
	public KeyEventDemo() {
		setLayout(new FlowLayout());
		
		add(new Label("Enter Text: "));
		this.tfInput=new TextField(10);
		this.tfInput.setEditable(true);
		add(this.tfInput);
		this.tfInput.addKeyListener(this);
		this.taDisplay=new TextArea(5,40);
		add(this.taDisplay);
		addWindowListener(this);
		
		setTitle("KeyEventDemo");
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyEventDemo app=new KeyEventDemo();
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
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		this.taDisplay.append("You have typed "+arg0.getKeyChar()+"\n");
	}

}
