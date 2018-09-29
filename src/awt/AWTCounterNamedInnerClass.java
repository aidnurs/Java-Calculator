package awt;

import java.awt.*;
import java.awt.event.*;

public class AWTCounterNamedInnerClass extends Frame implements WindowListener{
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public AWTCounterNamedInnerClass() {
		setLayout(new FlowLayout());
		add(new Label("Counter"));
		this.tfCount=new TextField(10);
		this.tfCount.setEditable(false);
		add(this.tfCount);
		
		this.btnCount=new Button("Count");
		add(this.btnCount);
		this.btnCount.addActionListener(new BtnCountListener());
		addWindowListener(this);
		setTitle("AWTCounterNamedInnerClass");
		setSize(250,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AWTCounterNamedInnerClass();
	}
	
	private class BtnCountListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			++AWTCounterNamedInnerClass.this.count;
			AWTCounterNamedInnerClass.this.tfCount.setText(count+"");
			
		}
		
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
}
