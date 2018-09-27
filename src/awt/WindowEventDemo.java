package awt;

import java.awt.*;
import java.awt.event.*;

public class WindowEventDemo extends Frame implements ActionListener,WindowListener{
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	public WindowEventDemo() {
		setLayout(new FlowLayout());
		
		this.lblCount=new Label("Counter");
		add(this.lblCount);
		this.tfCount=new TextField(this.count+"",10);
		tfCount.setEditable(false);
		add(this.tfCount);
		this.btnCount=new Button("Count");
		add(this.btnCount);
		
		this.btnCount.addActionListener(this);
		addWindowListener(this);
		
		setTitle("AWT Counter");
		setSize(250,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		WindowEventDemo app=new WindowEventDemo();
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
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
