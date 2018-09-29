package awt;

import java.awt.*;
import java.awt.event.*;

public class AWTCounterAnonymousInnerClass extends Frame implements WindowListener{
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	public AWTCounterAnonymousInnerClass() {
		setLayout(new FlowLayout());
		//System.out.println(this.getClass());
		
		add(new Label("Counter"));
		this.tfCount=new TextField(10);
		this.tfCount.setEditable(false);
		add(this.tfCount);
	    btnCount = new Button("Count");
	    add(btnCount); 
	    this.btnCount.addActionListener(new ActionListener() {
	    	@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				++count;
				tfCount.setText(count+"");
				System.out.println(this.getClass());
			}
	    });
		addWindowListener(this);
		setTitle("AWTCounterAnonymousInnerClass");
		setSize(250,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AWTCounterAnonymousInnerClass();
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
