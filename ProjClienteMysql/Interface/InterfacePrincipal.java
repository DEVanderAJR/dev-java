package Interface;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class InterfacePrincipal extends JFrame implements ActionListener{

	/**
	 * @param args
	 */
	private JButton btnCadastar;
	private JButton btnConsultar;
	
	public InterfacePrincipal()
	{
		
		
		btnCadastar = new JButton("Cliente");
		btnCadastar.addActionListener(this);
		//btnConsultar = new JButton("Consultar");
		GridLayout grid = new  GridLayout(1,2);
		this.getContentPane().setLayout(grid);
		this.getContentPane().add(btnCadastar);
		//this.getContentPane().add(btnConsultar);				
		this.setBounds(0, 0, 600, 600);
		this.setVisible(true);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		
	}
	public static void main(String[] args) {
		InterfacePrincipal ip = new InterfacePrincipal();
		
	}
	
	public void actionPerformed(ActionEvent e) {
	
		frmCliente fc = new frmCliente();
		
	}

}
