package awt;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter3Buttons1Listener extends Frame implements WindowListener{
	private TextField tfCount;
	private Button btnCountUp, btnCountDown, btnReset;
	private int count = 0;
	
	public AWTCounter3Buttons1Listener() {
		setLayout(new FlowLayout());
		
		add(new Label("Counter"));
		this.tfCount=new TextField("0",10);
		this.tfCount.setEditable(false);
		add(this.tfCount);
		
		this.btnCountUp=new Button("Count up");
		add(this.btnCountUp);
		this.btnCountDown=new Button("Count down");
		add(this.btnCountDown);
		this.btnReset=new Button("Reset");
		add(this.btnReset);
		
		BtnListener listener=new BtnListener();
		this.btnCountUp.addActionListener(listener);
		this.btnCountDown.addActionListener(listener);
		this.btnReset.addActionListener(listener);

		addWindowListener(this);
		setTitle("AWTCounter3Buttons1Listener");
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AWTCounter3Buttons1Listener();
	}
	
	private class BtnListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String btnLabel=arg0.getActionCommand();
			if(btnLabel.equals("Count up")) {
				++count;
			}else if(btnLabel.equals("Count down")) {
				--count;
			}else {
				count=0;
			}
			tfCount.setText(count+"");
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
