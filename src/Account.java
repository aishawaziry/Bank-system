

    import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.time.LocalDate;
	import java.time.Period;
	import java.util.Calendar;
	import java.util.Date;
	import javax.swing.JOptionPane;



	
	public class Account {

		protected int Days;
		private  boolean status;
	    protected String accHolder;
		protected String password;
		protected double balance;
		private double MaxAllowableLimit = 2000.00 ;
		protected int DaysLeft;
		private int year;
		private int month;
		private int day;

	
	    
		
		
	
		
	
		
	public void diffTime()
		
	
	{
	
			LocalDate pdate = LocalDate.of( year, month, day);
	        LocalDate now = LocalDate.now();
	 
	        Period diff = Period.between(pdate, now);
	        
	        
	  
	        	this.DaysLeft = diff.getDays();
	        	
	        
	        	
	        	
	 
System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
	     
		
	}

	
	    


	 
		
		
		public Account( String usrname, String pass , double bal,int year,int month,int day ) {
			this.accHolder = usrname;
			this.password = pass;
			this.balance = bal;
			this.year = year;
			this.month = month;
			this.day = day;
		
		 }
		
		
		
		public double deposit(double dep) {
			
			balance = balance + dep;
			
			return balance;
		
				
			}
		
		
		public void BalanceAfterTransfer(double transferAmount) {
			
			
				this.balance = this.balance - transferAmount;

			return;
			
		
		}
		
		



		public String getName() {
			return accHolder;
		}



		public void setName(String name) {
			this.accHolder = name;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public double getBalance() {
			
			
		  	return balance;
		  	}
			



		public void setBalance(double balance) {
			this.balance = balance;
			
		}




		
		
		public void CreditCard(double amount) {
			
			
			if (amount <= MaxAllowableLimit && amount > balance)
				
				
			{     
				
				
				JOptionPane.showMessageDialog(null,"The amount withdrawn is: " +amount );
			
				this.MaxAllowableLimit = this.MaxAllowableLimit - (amount - balance);
				this.balance = 0;
			
			
			
			}
			
			
			
			else if(amount <= balance) {
				  
				
		
				
				
				JOptionPane.showMessageDialog(null,"The amount withdrawn is: " +amount );
				
				this.balance = balance - amount;
		
			}
			
			
			else if ( amount > MaxAllowableLimit && amount > balance)
			
			
			{
				
				JOptionPane.showMessageDialog(null,"Sorry beyond allowable limit you need to deposit some money");
			
				JOptionPane.showMessageDialog(null,"The amount withdrawn is:  "+(this.MaxAllowableLimit + balance) );
				
				
				this.balance = 0;
				this.MaxAllowableLimit= 0;
			
					

			}
			
			
			
				
				
		}



		
		
	

			
		public void status() {
			
			boolean Flag = false;
			
			if(MaxAllowableLimit == 2000.0){
				Flag = false;
			}
			
			else {
				
				Flag = true;
			}
			
			JOptionPane.showMessageDialog(null,Flag);
		}
		
		
		public void debt() {
			 
			 if(MaxAllowableLimit == 2000.00) {
				 
				 JOptionPane.showMessageDialog(null,"You are not in debt your status is great");
				 
			 }
			  
			 else
				 JOptionPane.showMessageDialog(null,"You are in debt");	 
		 }
		
		
		public void checkStatus(){
		
			
			
			diffTime();	
			this.Days = 60 - this.DaysLeft ; 
			JOptionPane.showMessageDialog(null,"Your current balance is: " +this.balance);
			JOptionPane.showMessageDialog(null,"The current credit card balance is: " +this.MaxAllowableLimit);
		
			

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


