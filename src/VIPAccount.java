


//import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;




 

	public class VIPAccount extends Account {

	 


	 private double maxAllowableLimit = 20000.00 ;
     
    
     
     
     
     
     public VIPAccount(String usrname, String pass, double bal,int year, int month, int day) {
		super(usrname, pass, bal, day, month, day);
		
		// VIPAccount Mona = new VIPAccount("Mona","2890451",500000);
	}
    
     
     @Override
		public void status() {
			
			boolean Flag = false;
			
			if(maxAllowableLimit == 20000.0){
				Flag = false;
			}
			
			else {
				
				Flag = true;
			}
			
//			JOptionPane.showMessageDialog(null,Flag);
		}
		
    
     
     @Override
     public void CreditCard(double amount) {
     
    	 
			if (amount <= maxAllowableLimit && amount > balance)
				
				
			{   
				
				JOptionPane.showMessageDialog(null,"The amount withdrawn is: " +amount );
			
				  
				this.maxAllowableLimit = this.maxAllowableLimit - (amount - balance);
				this.balance = 0;
			
			
			}
			
			
			
			else if(amount <= balance) {
				  
				
		
				
				
				JOptionPane.showMessageDialog(null,"The amount withdrawn is: " +amount );
				
				this.balance = balance - amount;
			
			}
			
			
			else if ( amount > maxAllowableLimit && amount > balance)
			
			
			{
				
				
				
			
				JOptionPane.showMessageDialog(null,"Sorry beyond allowable limit you need to deposit some money");
			
				JOptionPane.showMessageDialog(null,"The amount withdrawn is:  "+(this.maxAllowableLimit + balance) );
				
			
				this.balance = 0;
				this.maxAllowableLimit= 0;
					

			}
			
			
			
				
				
		}
	
	
	
	
	@Override
     public void debt() {
		 
		 if(maxAllowableLimit == 20000.00) {
			 
			 JOptionPane.showMessageDialog(null,"You are not in debt your status is great");
			 
		 }
		  
		 else
			 JOptionPane.showMessageDialog(null,"You are in debt");	 
	 }
	
	
     
     
     @Override
     public void checkStatus(){
	
		
		
    	 diffTime();	
			this.Days = 120 - this.DaysLeft ; 
			JOptionPane.showMessageDialog(null,"Your current balance is: " +this.balance);
			JOptionPane.showMessageDialog(null,"The current credit card balance is: " +this.maxAllowableLimit);
			
			if(this.Days <= 0)
			{
			
			JOptionPane.showMessageDialog(null,"Days Left to settle your account is: "+Days);
			
			}
			
			else	
			
			{
				
				JOptionPane.showMessageDialog(null,"You need to pay your debts ");
		
			}	
			
			
		}

	}
     

     
     
     
    
     
 
 
 
 
     
//     	public double TransferedVIP (VIPAccount p1 , double transferedAmount) {
//		
//     	transferedAmount = p1.getTransferAmount();
//		p1.balance = p1.balance - p1.getTransferAmount();
//		
//		
//		return balance;
//		
//	}
     
	
