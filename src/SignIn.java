import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class SignIn extends JFrame implements ActionListener,MouseListener,MouseMotionListener {

	JFrame frame =new JFrame();
	
	JButton enterButton=new JButton("LOG IN");
	
	 JLabel label1=new JLabel("Username");
	 JLabel label3=new JLabel("Password");
	 JLabel label4=new JLabel("Welcome");

	 
	 
	 JTextField t1= new JTextField();
	 JPasswordField p1= new JPasswordField();
	 
	 SignIn(){
    	 frame.setTitle("Bank");
    	 frame.setSize(800,600);
    	 frame.setVisible(true); 
    	 frame.setLocation(400,200);
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 frame.setResizable(false);
    	 frame.getContentPane().setBackground(new Color(0x123456));
    	 frame.setLayout(null);
    	 
    	 enterButton.setBounds(325,500,150,50);
    	 enterButton.setBackground(Color.WHITE);
    	 enterButton.addActionListener(this);
    	 enterButton.setFocusable(false);
    	 enterButton.setFont(new Font("Arial",Font.BOLD,23));
    	 enterButton.setBackground(Color.LIGHT_GRAY);
    	 
    	 
    	 label1.setBounds(30,100,150,50);
    	 label1.setForeground(Color.WHITE);
    	 label1.setFont(new Font("Arial",Font.BOLD,23));
    	 
    	
    	 
    	 label3.setBounds(30,300,150,50);
    	 label3.setForeground(Color.WHITE);
    	 label3.setFont(new Font("Arial",Font.BOLD,23));
    	 
    	 label4.setBounds(300,0,200,70);
    	 label4.setForeground(Color.WHITE);
    	 label4.setFont(new Font("Arial",Font.BOLD,30));
    	 
    	 t1.setBounds(400,100,300,40);
    	 t1.addActionListener(this);
    	 
    	 p1.setBounds(400, 300, 300, 40);
    	 frame.add(enterButton);frame.add(label1);frame.add(label3);
    	 frame.add(label4);frame.add(p1);frame.add(t1);
    	 
    	 
}
	 
	 
	 
	 
	 @Override
		public void mouseDragged(MouseEvent e) {
			
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


			
		
		


		
		
		
		
		
		
		
		










	@Override
	public void actionPerformed(ActionEvent e) {
	
	
	
		
	if (e.getSource() == enterButton) {

		String name1 = t1.getText();	
		String pass = p1.getText();
		
		

       if(name1.isBlank()||name1.matches("")/*||name.contains(numbers)||name.(numbers)*/) {
			JOptionPane.showMessageDialog(null,"Enter the name ,Please","Message",JOptionPane.ERROR_MESSAGE);
			System.out.println("gg");
		}
		else if (name1.startsWith(" ")) {
			JOptionPane.showMessageDialog(null,"Enter the name correctly ,Please","Message",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		else if (e.getSource() == enterButton) {
			
       
    	   
    	   try {
				
				
				     if(name1.equals("Mohamed") && pass.equals("55502815"))
        	    
        		{
        			frame.setVisible(false);
        			 new Mohamed();
        			 return;
            	 }
				
				     
				     
				     if(name1.equals("Hany") && pass.equals("34562045"))
        	    
        		{
				    	 frame.setVisible(false);
        			 new Hany();
        			 return;
       	    
            	 }
				
				     if(name1.equals("Tarek")  && pass.equals("84062032"))
    
				     {
				    	 frame.setVisible(false);
							new Tarek();
							return;

						}
			
			
				     if(name1.equals("Salma") && pass.equals("94902080"))
    
				     {
				    	 
				    	frame.setVisible(false);
						new Salma();
						return;
    
				     	}
			
			
				     if(name1.equals("Mona") && pass.equals("2890451"))
        			
        			
        			 {
				    	 frame.setVisible(false);
						new Mona();
						return;

        			 	}	
				    
				  								
				     
				     
			else  {
					
					JOptionPane.showMessageDialog(null, "Invalid username or password", "Message", JOptionPane.INFORMATION_MESSAGE);
				}   
				  
				     
				
				     
			}	     
			
				
				catch (NumberFormatException e1) {
        		 JOptionPane.showMessageDialog(null, "Invalid","Message",JOptionPane.ERROR_MESSAGE);
        	}     

					
				


    	   
    	   
				
    	   }
			
				
				
				  
        	 
	}
	
	
	}

}
    	   
    	   
			
    	   
    	   
				     
		
		
			
			
			
			
			
			
	
	




	
		
		
	
        		
        		

        	    

	

	
		

		
		

	
		

	
	
	
	
	


