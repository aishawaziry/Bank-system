

	import java.awt.Color;
	import java.awt.Font;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
//	import javax.swing.JTextField;

	
	public class Mohamed extends JFrame implements ActionListener{
	

	

	
 


		JFrame frame =new JFrame();
		 
		 JButton depositButton=new JButton("Deposit");
		 JButton transferButton=new JButton("Transfer");
		 JButton withdrawButton=new JButton("Withdraw");
		 JButton checkStatusButton=new JButton("Check Status");
		 JButton balanceButton=new JButton("Balance");
		 JButton exitButton=new JButton("Exit");
		 

		 
		 Mohamed(){
			 frame.setTitle("Bank");
			 frame.setSize(800,600);
			 frame.setVisible(true); 
			 frame.setLocation(400,200);
			 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 frame.setResizable(false);
			 frame.getContentPane().setBackground(new Color(0x123456));
			 frame.setLayout(null);
			 
			 depositButton.setBounds(150,150,150,50);
			 depositButton.setBackground(Color.WHITE);
			 depositButton.addActionListener(this);
			 depositButton.setFocusable(false);
			 depositButton.setFont(new Font("Arial",Font.BOLD,23));
			 depositButton.setBackground(Color.LIGHT_GRAY);
			 
			 transferButton.setBounds(450,150,150,50);
			 transferButton.setBackground(Color.WHITE);
			 transferButton.addActionListener(this);
			 transferButton.setFocusable(false);
			 transferButton.setFont(new Font("Arial",Font.BOLD,23));
			 transferButton.setBackground(Color.LIGHT_GRAY);
			 
			 
			 withdrawButton.setBounds(150,300,150,50);
			 withdrawButton.setBackground(Color.WHITE);
			 withdrawButton.addActionListener(this);
			 withdrawButton.setFocusable(false);
			 withdrawButton.setFont(new Font("Arial",Font.BOLD,23));
			 withdrawButton.setBackground(Color.LIGHT_GRAY);
			 
			 
			 checkStatusButton.setBounds(450,300,150,50);
			 checkStatusButton.setBackground(Color.WHITE);
			 checkStatusButton.addActionListener(this);
			 checkStatusButton.setFocusable(false);
			 checkStatusButton.setFont(new Font("Arial",Font.BOLD,23));
			 checkStatusButton.setBackground(Color.LIGHT_GRAY);
			 
			 
			 balanceButton.setBounds(150,450,150,50);
			 balanceButton.setBackground(Color.WHITE);
			 balanceButton.addActionListener(this);
			 balanceButton.setFocusable(false);
			 balanceButton.setFont(new Font("Arial",Font.BOLD,23));
			 balanceButton.setBackground(Color.LIGHT_GRAY);
			 
			 
			 exitButton.setBounds(450,450,150,50);
			 exitButton.setBackground(Color.WHITE);
			 exitButton.addActionListener(this);
			 exitButton.setFocusable(false);
			 exitButton.setFont(new Font("Arial",Font.BOLD,23));
			 exitButton.setBackground(Color.LIGHT_GRAY);
			 
			 
			 
			 
			 
			 
			 
			 

			 
			 frame.add(depositButton);	frame.add(transferButton); frame.add(withdrawButton);
			 frame.add(checkStatusButton); frame.add(balanceButton);frame.add(exitButton);

			 
		 
		}


			
		
		
		
			
			
			
			
			

			
			
			
			

				
					
				  
					
						  		

		
				  		
				  			
				  			
				  		
				  		
				  		
				  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 Account Mohamed = new Account("Mohamed","55502815",2000,2021,05,03);
		 Account Hany = new Account("Hany","34562045",20000,2021,04,07);
		 Account Tarek = new Account("Tarek","84062032",1800,2021,01,04);
		 Account Salma = new Account("Salma","94902080",0,2021,03,01);
		 
		 VIPAccount Mona = new VIPAccount("Mona","2890451",500000,2020,03,04);
		 
		
		@Override 
		public void actionPerformed(ActionEvent e) {
	      if(e.getSource()==exitButton) {
				
				System.exit(0);
			   	//frame.dispose();
			}
	      if (e.getSource()==depositButton) {
	  		
	  		try {
	  		String depositAmount=JOptionPane.showInputDialog("Enter Deposit Amount");
	  		double depositAmount1=Double.parseDouble(depositAmount);
	  		Mohamed.deposit(depositAmount1);
	  		//Account.setDeposit(depositAmount1);
	  		}
	  		catch (NumberFormatException e1) {
	  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
	  		}
	  	
	  		catch (NullPointerException e1) {
	  			
	  			}

		}
	      if(e.getSource()==withdrawButton) {
	  		try {
	  		String creditCardAmount=JOptionPane.showInputDialog("Enter Withdraw Amount");
	  		double creditCardAmount1=Double.parseDouble(creditCardAmount);
	  		Mohamed.CreditCard(creditCardAmount1);
	  		}
	  		
	  		catch (NumberFormatException e1) {
	  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
	  		}
	  	
	  		catch (NullPointerException e1) {
	  			
	  			}}
	      if(e.getSource()==checkStatusButton) {
	  		
	  		Mohamed.checkStatus();
	  	}
	      if(e.getSource()==balanceButton) {
	    	 
	    	  JOptionPane.showMessageDialog(null," Your current balance is :"+Mohamed.getBalance());
	    		
	    	}
	      
	      if(e.getSource()==transferButton) {
	    	  
	    	  
	    	  
	    	  String depositAmount=JOptionPane.showInputDialog("Enter Transfer Amount");
		  		double depositAmount1=Double.parseDouble(depositAmount);
		  		
		  		
		  		

		  		
		  		
		  		if(Mohamed.getBalance()>=depositAmount1) {
		  			
		  			
		  			Mohamed.BalanceAfterTransfer(depositAmount1);
		  			String depositAmount2 = JOptionPane.showInputDialog("Transfer to ");
			  		String depositAmount3 = String.format(depositAmount2, getComponentListeners());
		  		
			  		
						
						
			  		
			  		if(depositAmount3.equals("Hany") || depositAmount3.equals("hany") ) {
			  			try {
					  		
					  		
					  		Hany.deposit(depositAmount1);
					  		
					  		
					  		JOptionPane.showMessageDialog(null,"Successfull","Message",JOptionPane.ERROR_MESSAGE);
					  		
					  		
					  		
			  			}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}
			  		
			  			
			  			
			  		
			  		
			  		
			  		if(depositAmount3.equals("Tarek")|| depositAmount3.equals("tarek") ) {
			  			
			  			try {
					  		
					  	
					  		Tarek.deposit(depositAmount1);
					  		
					  		
					  		JOptionPane.showMessageDialog(null,"Successfull","Message",JOptionPane.ERROR_MESSAGE);
					  		
					  		
					  		
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}
			  		
			  		
			  		
			  		if(depositAmount3.equals("Salma") || depositAmount3.equals("salma") )
			  		
			  		{
			  			try {
					  		
					  		Salma.deposit(depositAmount1);
					  		
					  		
					  		JOptionPane.showMessageDialog(null,"Successfull","Message",JOptionPane.ERROR_MESSAGE);
					  		
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}

			  		
			  		if(depositAmount3.equals("Mona")  || depositAmount3.equals("mona") )
			  		{
			  			
			  			try {
					  		
					  		Mona.deposit(depositAmount1);
					  		
					  		
					  		JOptionPane.showMessageDialog(null,"Successfull","Message",JOptionPane.ERROR_MESSAGE);
					  		
					  		
					  		}
					  		catch (NumberFormatException e1) {
					  			JOptionPane.showMessageDialog(null,"Invalid","Message",JOptionPane.ERROR_MESSAGE);
					  		}
					  	
					  		catch (NullPointerException e1) {
					  			
					  		}		
					}
			  		
			  		
			  		}
			  		
			  		else {
			  			
			  	
				  	JOptionPane.showMessageDialog(null,"Invalid please try again","Message",JOptionPane.ERROR_MESSAGE);
			  			
			  			
			  		}
			  		
			  		
			  		
		  		
  	  }
			
			
  	 		  		
		}
  	  
  	  
  	  
	
	


















		}




