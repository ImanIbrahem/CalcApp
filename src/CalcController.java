import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class CalcController implements ActionListener {

	private CalcView v ;
	private CalcModel m ;
	
	public CalcController ()
	{
		v = new CalcView();
		m = new CalcModel ();
		
		for(int k=0;k<4;k++)
			v.buttons[k].addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		double first;
		double second;
		double resu=0; 
		
		first= v.getFN();
		second = v.getSE();
		
		if( e.getSource()== v.buttons[0])
		{
			resu=m.calculate(first, second, 0);
		}
		else if( e.getSource()== v.buttons[1])
		{
			resu=m.calculate(first, second, 1);
		}
		else if( e.getSource()== v.buttons[2])
		{
			resu=m.calculate(first, second, 2);
		}
		else if( e.getSource()== v.buttons[3])
		{
			resu=m.calculate(first, second, 3);
		}
		
		v.SetRes(resu);
	}
	
	
	
	public static void main(String[] args)
	{
	CalcController panel = new CalcController ();
	//CalcView panel = new CalcView();
	//panel.setLocationRelativeTo(null);
	}
	
}
