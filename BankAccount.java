

	


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	import java.awt.*;


	public class Transfer extends JFrame implements ActionListener {

		
		JFrame frame = new JFrame();
//		JButton bt = new JButton("Done");
		JTextField txt = new JTextField();
		JLabel lbl = new JLabel("Transfer To :");
		
		public Transfer()  {
		
		
		frame.getContentPane().setBackground(new Color(0x123456));	
		frame.setVisible(true);
		frame.setBackground(Color.black);
		frame.setName("Transfer");
		frame.setForeground(Color.white);
		frame.setSize(400, 160);                                        	
		frame.add(txt);
//		frame.add(bt);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setOpacity(1);
		frame.add(lbl);
		
		
		lbl.setBounds(15,37,150,50);
   	 	lbl.setForeground(Color.white);
   	 	lbl.setFont(new Font("Arial",Font.BOLD,13));
		lbl.setVisible(true);
//		bt.setName("Done");	
//		bt.setSize(50, 25);
//		bt.setBounds(165, 100, 100, 25);
//		bt.setFocusable(false);
//		bt.setBackground(Color.GRAY);
//		
		
		txt.setBounds(100, 50,225,25);

		
		txt.addActionListener(this);
//		bt.addActionListener(this);
		
		}
		
		
		
		

		
		
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			Account Mohamed = new Account("Mohamed","55502815",2000);
		    Account Hany = new Account("Hany","34562045",20000);
		    Account Tarek = new Account("Tarek","84062032",1800);
			Account Salma = new Account("Salma","94902080",0);
			 
			VIPAccount Mona = new VIPAccount("Mona","2890451",500000);
			
			
			
			
			
			
			
			
			
				
			  
				
				if(e.getSource() == txt) {
							
				String name = txt.getText();
			  		
					if(name.equals("Hany") || name.equals("hany") ) {
						
						try {
					  		String depositAmount=JOptionPane.showInputDialog("Enter Transfer Amount");
					  		double depositAmount1=Double.parseDouble(depositAmount);

					  	
					  		
					  		Hany.deposit(depositAmount1);
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}
			  		
			  		
			  		if(name.equals("Mohamed") || name.equals("mohamed") ) {
			  			try {
					  		String depositAmount=JOptionPane.showInputDialog("Enter Transfer Amount");
					  		double depositAmount1=Double.parseDouble(depositAmount);

					  		
					  		
					  		Mohamed.deposit(depositAmount1);
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}
			  		
			  			
			  			
			  		
			  		
			  		
			  		if(name.equals("Tarek")|| name.equals("tarek") ) {
			  			
			  			try {
					  		String depositAmount=JOptionPane.showInputDialog("Enter Transfer Amount");
					  		double depositAmount1=Double.parseDouble(depositAmount);
					  		

					  	
					  		Tarek.deposit(depositAmount1);
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}
			  		
			  		
			  		
			  		if(name.equals("Salma") || name.equals("salma") )
			  		
			  		{
			  			try {
					  		String depositAmount=JOptionPane.showInputDialog("Enter Transfer Amount");
					  		double depositAmount1=Double.parseDouble(depositAmount);
					  		
					  		
					  		
					  		Salma.deposit(depositAmount1);
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}

			  		
			  		if(name.equals("Mona")  || name.equals("mona") )
			  		{
			  			
			  			try {
					  		String depositAmount=JOptionPane.showInputDialog("Enter Transfer Amount");
					  		double depositAmount1=Double.parseDouble(depositAmount);

					  		
					  		
					  		Mona.deposit(depositAmount1);
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}
			  		
			  		
			  		
			  		
			  		
//			  		else
//			  		{
//			  			JOptionPane.showMessageDialog(null,"Invalid Account","Message",JOptionPane.ERROR_MESSAGE);
//			  		}
			  		
				
//			  		catch (NumberFormatException e1) {
//			  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
//			  		}
			  	
//			  		catch (NullPointerException e1) {
//			  			
//			  			}
//				
//				}
			
				
//		if(e.getSource() == bt) {
//			
//			
//			System.exit(0);		
//				 				
//		}

	}
			
		
	   
		
		}
		
	}


