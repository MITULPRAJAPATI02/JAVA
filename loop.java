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


// hollow pattern
	
// 		for (int i=1;i<=5;i++)
			
// 		{
// 			for (int k=5-i;k>0;k--)
				
				
// 			{System.out.print(" ");}
			
			
// 			for(int j=1;j<=2*i-1;j++)
				
				
// 				if(j==1 || (j==2*i-1))
					
// 				{	System.out.print("*");}
			
// 				else{System.out.print(" ");}
				
// //			{System.out.print("*");}
			
// 			System.out.println();
// 		}








