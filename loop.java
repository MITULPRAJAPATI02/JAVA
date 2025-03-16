	Scanner obj = new Scanner(System.in);
	
	System.out.println("Enter Number");
	
	
	int Number= obj.nextInt(); 
	int originalnumber = Number;
	
	System.out.println(Number);

	int m=0;

	int lastDigit = 0;
			while(Number>0)
			{
			lastDigit = Number%10;
			
	System.out.println(lastDigit);
	
	  m+=(lastDigit*lastDigit*lastDigit);
	
	
	  Number = Number/10;  
		
	 
	 System.out.println(m);
			
			153 = 153%10  = 3  = 
				  153/10 = 15 
				  
		    15%10 = 5 =
		    15/10 = 1 
		    
		    1%10 = 1 
		    1/10 = 0 
		    
				
	
}	
			 if (m==originalnumber)
			 {System.out.println("This is Armstrong number");}
			 
	
			 else{System.out.println("it is not a Armstrong number ");}
