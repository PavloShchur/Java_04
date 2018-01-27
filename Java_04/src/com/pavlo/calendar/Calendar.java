package com.pavlo.calendar;

import java.util.Scanner;

public class Calendar {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Month_01[] monthes = Month_01.values();
		Season_01 [] seasons = Season_01();
		Month_01.APRIL.getSeason().ordinal();
		for (Season_01 c : Season_01.values())
		    System.out.print(c + ", ");
		
//		System.out.println(Season_01.AUTUMN.compareTo(Season_01.SPRING));

		boolean work = true;
		
		
		while(true){
			System.out.println("enter 1 for checking whether we have such a month.");
			System.out.println("enter 1 for checking monthes of the same season.");
			System.out.println("enter 2 for checking monthes of the same number of days.");
			System.out.println("enter 3 for checking monthes of the same number of days.");
			System.out.println("enter 4 for checking monthes which have more days");


			
		String user = scanner.next();

		switch (user) {
		case "1": {
			System.out.println("Please enter some month.");
			String inputName = scanner.next();
			boolean existName = false;
			for (int i = 0; i < monthes.length; i++) {
				System.out.print(monthes[i].getSeason().ordinal() + " ");

				if (inputName.equalsIgnoreCase(monthes[i].name())) {
					System.out.println(inputName + " We have such a month");
					existName = true;
				} 
			}
			
			if(existName == false){
				System.out.println("We do not have such a month.");
			}
			break;
		}
		case "2": {
			
			   System.out.println("Please enter some month.");
			   String inputName = scanner.next();
			   for (int i = 0; i < monthes.length; i++){
			    if (inputName.equalsIgnoreCase(monthes[i].name())) {
				     for (int j = 0; j < monthes.length; j++) {
				    	 if(monthes[i].getSeason().equals(monthes[j].getSeason())) {
				    		 System.out.println(monthes[j].name());
				    	 }
			     }}}}
			  

		
//			System.out.println("Please enter some month.");
//			String inputName = scanner.next();
//			boolean existName = false;
//			for (int i = 0; i < monthes.length; i++){
//				if (inputName.equalsIgnoreCase(monthes[i].name())) {
////					 System.out.println(Month_01.valueOf(monthes[i].name()).getSeason());
//					 System.out.println(monthes[i].getSeason()); {
//						 
//					 }
//					 
//						 
//					 
//
//					 existName = true;
//				}
//			}
//			if(existName == false) {
//				System.out.println("We do not have months with the same number of days.");
//			}
//			break;
//			
//			
//	
//		}
		case "3": {
			   System.out.println("Enter month");
			   String monthName = scanner.next();
			   for (int i = 0; i < monthes.length; i++) {
			    if (monthName.equalsIgnoreCase(monthes[i].name())) {
			     for (int j = 0; j < monthes.length; j++) {
			      if (monthes[i].getDays() == monthes[j].getDays()) {
			       System.out.print(monthes[j].name() + ", ");
			      } 
			     }

			    }
			   }
			  }
			
		case "4": {
			  System.out.println("Enter month");
			   String month = scanner.next();
			   for (int i = 0; i < monthes.length; i++) {
			    if (month.equalsIgnoreCase(monthes[i].name())){
			     for (int j = 0; j < monthes.length; j++) {
			      if(monthes[i].getDays() > monthes[j].getDays()){
			       System.out.println(monthes[j].name());
			      }
			     }
			    }
			   }
			  }
			 

		case "5": {
			System.out.println("Enter month");
			String month = scanner.next();
			for (int i = 0; i < monthes.length; i++) {
				if (month.equalsIgnoreCase(monthes[i].name())){
					for (int j = 0; j < monthes.length; j++) {
	      if(monthes[i].getDays() < monthes[j].getDays()){
	       System.out.println(monthes[j].name());
	      }
	     }}}}
	    
			case "6": {
				   System.out.println("Enter month");
				   String month = scanner.next();
				   for (int i = 0; i < monthes.length; i++) {
				    if (month.equalsIgnoreCase(monthes[i].name())) {
				     for (int j = monthes[i].ordinal(); j < monthes.length; j++) {
				      if (monthes[i].ordinal() == monthes.length - 1) {
				       for (int j1 = 0; j1 < monthes.length; j1++) {
				        if (!monthes[i].getSeason().equals(monthes[j1].getSeason())) {
				         System.out.println(monthes[j1].getSeason());
				         break;
				        }
				       }
				      } else if (!monthes[i].getSeason().equals(monthes[j].getSeason())) {
				       System.out.println(monthes[j].getSeason());
				       break;
				      }
				     }

				    }
				   }		}		 
			case "7": {
				   System.out.println("Enter month");
				   String season = scanner.next();
				   for (int i = 0; i < monthes.length; i++) {
				    if (season.equalsIgnoreCase(monthes[i].name())){
				     for (int j = monthes[i].ordinal(); j >= 0; j--){
				     if (monthes[i].ordinal() == 0){
				      for (int j2 = monthes.length-1; j2 >= 0; j2--) {
				       if (!monthes[i].getSeason().equals(monthes[j2].getSeason())){
				        System.out.println(monthes[j2].getSeason());
				        break;
				       }
				      }
				     }
				     else if (!monthes[i].getSeason().equals(monthes[j].getSeason())){
				       System.out.println(monthes[j].getSeason());
				       break;
				      }
				     }
				    }
				   }}
			case "8" : {
				   System.out.println("Enter month");
				   for (int i = 0; i < monthes.length; i++) {
					   if(monthes[i].getDays() %2 == 0) {
						   System.out.println("This month has even number of days.");
					   }}}
					   case "9" : {
						   System.out.println("Enter month");
						   for (int i = 0; i < monthes.length; i++) {
							   if(monthes[i].getDays() %2 != 0) {
								   System.out.println("This month has odd number of days.");
							   }}}
						   case "10" : {
							   System.out.println("Enter month");
							   String season = scanner.next();
							   for (int i = 0; i < monthes.length; i++) {
							    if (season.equalsIgnoreCase(monthes[i].name())){
							    	for (int j = 0; j < monthes.length; j++) {
							    		if(monthes[i].getDays() %2 == 0) {
							    			System.out.println("This month has even number of days.");
							    			break;
							    		}
							    		else {
							    				System.out.println("This month has even number of days.");
							    			}
							    			break;
							    		}
							    	}
							    
							      
							     
							    }
							   }}}}
					  
	private static Season_01[] Season_01() {		// TODO Auto-generated method stub
		return null;
	}}
				
				
				