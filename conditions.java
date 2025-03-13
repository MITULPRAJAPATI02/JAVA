package p1;

public class conditions {

	public static void main(String[] args) {
	
//		
//		System.out.println("heyyy>>..");
		
// 		Arithmatic Op  
    // int a = 3,b = 5;
    // System.out.println(a); 
    // +,-,*,/,%
    
    // assignment 
    
    // a = a + 3 ; 
    // a += 6; 
    // a -= 6; 
    // a /=6;
    // a %= 6 
    
    
    // logical   
    // && : both conditions are true  
    // || : any one condition are true 
    // ! : not : opposite
    
    // int age = 2 ;
    // System.out.println((age>=18) && (age<65)); 
        // System.out.println((age>=18) || (age<65));
        // System.out.println(!(age>=18));

    
  
    // System.out.println(a); 
    //   int a = 3; 
    //   int b = a++; 
    //   int b = ++a ;// pre increment 
      // post increment 
    //   System.out.println(b);
    // == , != 

// int a =3;
// String b = "3"; 
// System.out.println(a == b);
    
    
// Conditions : Check     

// int age = 14; 
// if(age>=18)
// {
//     System.out.println("you can do the voting");
// }
// else 
// {
//         System.out.println("you can not do the voting");

// } 

// int age = 45; 
// if((age>=18) && (age<53))
// {
//     System.out.println("bld donetion kri ske");
// }
// else 
// {
//         System.out.println(" na kri ske");

// } 

//String cat = "Gujarati";


// if(cat == "Gujarati")
// {
//     System.out.println("Gujarati");
// } 

// if(cat == "Punjabi")
// {
//     System.out.println("Punjabi");
// } 

// if(cat == "South")
// {
//     System.out.println("South");
// } 
// if(cat == "Gujarati")
// {
//     System.out.println("Gujarati again");
// } 

// if(cat == "Gujarati")
// {
//     System.out.println("Gujarati");
// } 

// else if(cat == "Punjabi")
// {
//     System.out.println("Punjabi");
// } 

// else if(cat == "South")
// {
//     System.out.println("South");
// } 
// else if(cat == "Gujarati")
// {
//     System.out.println("Gujarati again");
// }  
// else 
// {
//         System.out.println("else data");

// }

// String item = "Fafda";
// if(cat == "Gujarati")
// {
//     if(item == "Fafda") 
//     {
//         System.out.println("Fafda");
//     }
// } 

//switch(cat)
//{
//    case "Gujarati":
//        System.out.println("Gujarati"); 
//        break; 
//        
//    case "South":
//        System.out.println("South"); 
//        break;
//        
//    case "Punjabi":
//        System.out.println("Punjabi"); 
//        break; 
//        
//    default:
//    System.out.println("Its Default"); 
//    break;
		
		
//		 int a = 5, b = 2;
//
//	        if (a == b) { 
//	        	
//	            System.out.println("Given two numbers are equal");
//	        } 
//	        
//	        else { 
//	        	
//	        	
//	            System.out.println("The two numbers are not equal");
//	        }
//	    }
//	}



//program 2
//odd or even number?

//int a=5;
//
//if(a%2==0) {
//	
//	System.out.println("the number is even");
//}
//	
//	else {
//		
//		System.out.println("the number is odd");
//	}
//	
//}
//}

		
//		program 3 postive negative
		
		
		
//		
//int a=12;
//
//if(a >=0)
//
//{System.out.println("the number is positive");
//}
//
//  else { System.out.println("the number is negative");
//
//}
		
		
//		program 4 leap year
		
		year is divisible by 4 and not divisible by 100 OR
		year is divisible by 400
		
int year=2024;

if (((year % 4 == 0 &&  year % 100 !=0 )) || (year % 400 == 0))

{
	System.out.println("THIS YEAR IS LEAP YEAR ");
}
else {System.out.println("this is not a leap year ");}

	
//int age=90;
//
//if (age>=18 && age<88)
//{System.out.println("THis candidate is eligable for voting");}
//
//else {System.out.println("no voting");}
//
// A program to find the largest of three numbers.
		
//		
//		int a=123,b=345,c=555;
//		
//		if(a>b && a>c )
//		{System.out.println("A is the largest number");}
//		
//		else if (b>c && b>a)
//		{System.out.println(" B is the largest number");}
//		
//		else if (c>a && c>b)
//		{System.out.println(" C is the largest number ");}
		
		
//		question 7
//
//		int maths=70,phy=67,chem=78;
//		
//		int total = maths+phy+chem;
//		
//		int total1= maths + phy;
//		
//		
//		if (( maths >=65 && phy>=55 &&chem>=50 && total >=180) || (total1>=140 ))
//			
//		{System.out.println("the student is eligible or pass");}
//		
//		question 8
		
//		int Rollno=101;
//		 String Name="Mitul";
//		int subject1=56,subject2=65,subject3=98;
//		
//	  int totalmarks=subject1+subject2+subject3;
//	  
//	  double perc=totalmarks/3;
//	 
//	  System.out.println("Roll name"+ Rollno);
//	  System.out.println("Name of studuent" + Name );
//	  System.out.println("Total marks"+totalmarks);
//	  
//	  System.out.println("Percentage"+perc);
//	  
//	  
//	  if(perc>=70)
//	  {System.out.println("The student is in A division");}
//	  
//	  else if(perc>=50 && perc<=69)
//	  {System.out.println("The student is in B division");}
//	  
//	  else if(perc>=30 && perc<=49)
//	  {System.out.println("The student is in C division");}
//		  
	 
//		Question 9
	
//		double Temperature=49.5;
//		
//		if(Temperature<0)
//		{System.out.println("Frezzoing weather");}
//		
//		else if(Temperature>=0&&Temperature<=10)
//		{System.out.println("Very cold weather");}
//		
//		else if(Temperature>10&&Temperature<=20)
//		{System.out.println(" cold weather");}
//		
//		else if(Temperature>20&&Temperature<=30)
//		{System.out.println(" Normal weather");} 
//		
//		else if(Temperature>30&&Temperature<=40)
//		{System.out.println(" HOt weather");}
//		
//		else if(Temperature>40&&Temperature<=50)
//		{System.out.println("  very HOt weather");}
//	 
	 
//		Question 11
		
//	String A="b";
//	
//	
//	
//	if(A=="a" || A=="e" || A=="i" || A=="o" || A=="u" )
//		
//	{System.out.println("Alphabet is vowel");}
//	
//	else {System.out.println("ALphabet is consonant");}
	
		
//		Question 12
		
// 		String Name="Mitul";
// 		int id=32;
		
// 		double unit=45.6;
		
// 	double	unitcharged=0;
		
		
		
// 		if(unit<=199)
// //	{System.out.println(unit*1.20);}
// 			unitcharged=1.20;
// 		else if (unit>=200 && unit<400)
// //		{System.out.println(unit*1.50);}
// 			unitcharged=1.50;
// 		else if (unit>=400 && unit<600)
// //		{System.out.println(unit*1.80);}
// 			unitcharged=1.80;
		
// 		else if (unit>=600)
// //		{System.out.println(unit*2);}
// 			unitcharged=2.0;
		
		
		
// 		double billamount= unit*unitcharged;
		
		
// 		if(billamount>400)
// 		{System.out.println("billamount"+billamount*0.15);}
		
// 		else if(billamount<100) {System.out.println(billamount=100);}

		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}



