/** Joud Hatem Alharbi 
ID Number: 442010694 
Group : 1 
*/
import java.util.Scanner;


public class Foundation_Student_Program 
{
    public static final int creditsHoursSemester1 = 16;
    public static final double marksForSemester1 = 99;
    public static final double firstSemesterpoints =64;
    
	public static void main(String[]args)
  
  {
	  Scanner Keyboard = new Scanner (System.in);
	      String email, name  ; 
	      int Calculus2 ,English ,Programming , Physics, codeCourseCalculus2 , codeCourseEnglish ,codeCourseProgramming,
	      codeCoursePhysics, creditsHoursCalculus2,creditsHourPhysics,creditsHourEnglish,creditsHourProgramming,creditsHoursSemester2 , totalCreditsHours;
	      int id ,group, mark , numberOfFail  ;
	      String gradeCalculus2,gradeEnglish,gradeProgramming,gradePhysics;
	      double GPASecondSemester ,overAllGPA , pointsCalculus2 , pointsEnglish , pointsProgramming , pointsPhysics ,secondSemesterpoints  ;
	      numberOfFail=0;
	      
	      
	      
		
	      System.out.println("your full name:");
		   name = Keyboard.nextLine();
		   System.out.println("email:");
		   email = Keyboard.nextLine();
		   System.out.println("ID Number:");
		   id = Keyboard.nextInt();
		   System.out.println("group:");
		   group = Keyboard.nextInt();
		    
		   
		   
		   
		   codeCourseCalculus2=40001;
		   codeCourseEnglish= 40002;
		   codeCourseProgramming= 40003;
		   codeCoursePhysics=40002;
		   
		   creditsHoursCalculus2 =4;
		   creditsHourPhysics=4;
		   creditsHourEnglish=4;
		   creditsHourProgramming=4;
		   creditsHoursSemester2=((creditsHoursCalculus2 )+(creditsHourEnglish) + (creditsHourProgramming) + (creditsHourPhysics));
		   totalCreditsHours=(creditsHoursSemester1)+(creditsHoursSemester2);
		   
		  
		   System.out.println(" Enter your grade in Calculus ");
		   Calculus2 =Keyboard.nextInt();
		   
		   System.out.println(" Enter your grade in Engilsh ");
		   English =Keyboard.nextInt();
		   System.out.println(" Enter your grade in programming ");
		   Programming =Keyboard.nextInt();
		   System.out.println(" Enter your grade in physics ");
		   Physics =Keyboard.nextInt();
		   
		  
		  
		   
		  
		   
		   
		   
		   if (Calculus2 >= 95) { 
			   gradeCalculus2 = "A+ Excellent"; 
			   pointsCalculus2= 4.0;
		   }
			else if (Calculus2 >= 90) {
				gradeCalculus2 = "A Excellent" ;
				pointsCalculus2= 3.75;	
			}    
		    else if (Calculus2 >= 85) {
		    	gradeCalculus2 = "B+ Very Good";
		    	pointsCalculus2= 3.5;
		    }  
		    else if (Calculus2 >= 80) {
		    	 gradeCalculus2 = "B Very Good";
		    	 pointsCalculus2= 3;
		    } 
	        else if (Calculus2 >= 75) {
	        	gradeCalculus2 = "C+ Good";
	        	pointsCalculus2= 2.5;
	        }
			else if (Calculus2 >= 70) {
				gradeCalculus2 = "C Good";
				pointsCalculus2= 2;
			} 	   
			else if (Calculus2 >= 65) {
				gradeCalculus2 = "D+ Pass";
				pointsCalculus2= 1.5;
			}  	
			else if (Calculus2 >= 60) {
				 gradeCalculus2 = "D Pass";
				 pointsCalculus2= 1;
			}
			else   {
	    	    gradeCalculus2 = "F Fail";
		        numberOfFail++;
		        pointsCalculus2= 0;
			}  
				  
		   if (English>= 95) { 
			   gradeEnglish = "A+ Excellent"; 
			   pointsEnglish= 4.0;
		   }
			else if (English >= 90) {
				gradeEnglish = "A Excellent" ;
				pointsEnglish= 3.75;	
			}    
		    else if (English >= 85) {
		    	gradeEnglish = "B+ Very Good";
				pointsEnglish= 3.5;
		    }  
		    else if (English >= 80) {
		    	 gradeEnglish = "B Very Good";
		    	 pointsEnglish= 3;
		    } 
	        else if (English >= 75) {
	        	gradeEnglish = "C+ Good";
	        	pointsEnglish= 2.5;
	        }
			else if (English >= 70) {
				gradeEnglish = "C Good";
				pointsEnglish= 2;
			} 	   
			else if (English >= 65) {
				gradeEnglish = "D+ Pass";
				pointsEnglish= 1.5;
			}  	
			else if (English >= 60) {
				 gradeEnglish = "D Pass";
				 pointsEnglish= 1;
			}
			else   {
	    	    gradeEnglish = "F Fail";
		        numberOfFail++;
		        pointsEnglish= 0;
			}

		    
		   if (Programming>= 95) { 
			   gradeProgramming = "A+ Excellent"; 
			   pointsProgramming= 4.0;
		   }
			else if (Programming >= 90) {
				gradeProgramming = "A Excellent" ;
				pointsProgramming= 3.75;	
			}    
		    else if (Programming >= 85) {
		    	gradeProgramming = "B+ Very Good";
				pointsProgramming= 3.5;
		    }  
		    else if (Programming >= 80) {
		    	 gradeProgramming = "B Very Good";
		    	 pointsProgramming= 3;
		    } 
	        else if (Programming >= 75) {
	        	gradeProgramming = "C+ Good";
	        	pointsProgramming= 2.5;
	        }
			else if (Programming >= 70) {
				gradeProgramming = "C Good";
				pointsProgramming= 2;
			} 	   
			else if (Programming >= 65) {
				gradeProgramming = "D+ Pass";
				pointsProgramming= 1.5;
			}  	
			else if (Programming >= 60) {
				 gradeProgramming = "D Pass";
				 pointsProgramming= 1;
			}
			else   {
	    	    gradeProgramming = "F Fail";
		        numberOfFail++;
		        pointsProgramming= 0;
			}
		 

		   if (Physics>= 95) { 
			   gradePhysics = "A+ Excellent"; 
			   pointsPhysics= 4.0;
		   }
			else if (Physics >= 90) {
				gradePhysics = "A Excellent" ;
				pointsPhysics= 3.75;	
			}    
		    else if (Physics >= 85) {
		    	gradePhysics = "B+ Very Good";
				pointsPhysics= 3.5;
		    }  
		    else if (Physics >= 80) {
		    	 gradePhysics = "B Very Good";
		    	 pointsPhysics= 3;
		    } 
	        else if (Physics >= 75) {
	        	gradePhysics = "C+ Good";
	        	pointsPhysics= 2.5;
	        }
			else if (Physics >= 70) {
				gradePhysics = "C Good";
				pointsPhysics= 2;
			} 	   
			else if (Physics >= 65) {
				gradePhysics = "D+ Pass";
				pointsPhysics= 1.5;
			}  	
			else if (Physics >= 60) {
				 gradePhysics = "D Pass";
				 pointsPhysics= 1;
			}
			else   {
	    	    gradePhysics = "F Fail";
		        numberOfFail++;
		        pointsPhysics= 0;
			}
		   
		   
secondSemesterpoints=((pointsCalculus2 * creditsHoursCalculus2)+(pointsEnglish * creditsHourEnglish)+(pointsProgramming * creditsHourProgramming)+(pointsPhysics * creditsHourPhysics));
				   
		   
GPASecondSemester=((secondSemesterpoints)/(creditsHoursSemester2));
		   

overAllGPA= (((secondSemesterpoints)+(firstSemesterpoints))/32);
 

String finalReslut="";
if (totalCreditsHours == 32 && overAllGPA >= 2.0 && numberOfFail == 0 ) {
	finalReslut="you passed the program ";
}else if (totalCreditsHours == 32 && overAllGPA >= 2.0 && numberOfFail <=2 ) {
	finalReslut="you have to take complementary reassessment exams ";
}else if (totalCreditsHours < 32 || overAllGPA <2.0 && numberOfFail ==0) {
	finalReslut="you must transfer to another program ";
}else if (numberOfFail >2){
	finalReslut="you must leave the university ";
}else {
	
}

System.out.println("\n**Student information**\t\n\nStudent Name :" + name + "\nGroup Number :" + group + "\nID Number :" +id);
System.out.println("\nHere your GPA :)"); 
System.out.println(" *Code Course* \t\t *Title* \t\t *Final marks* \t\t*Grade*");
System.out.println("\t"+codeCourseCalculus2+"\t"+"\tCalculus2\t"+ "\t\t"+Calculus2 + "\t\t"+ gradeCalculus2);
System.out.println("\t"+codeCourseEnglish+"\t"+ "\tEnglish\t"+"\t\t\t"+ English + "\t\t"+ gradeEnglish);
System.out.println("\t"+codeCourseProgramming+"\t"+"\tProgramming\t"+ "\t\t"+Programming + "\t\t"+ gradeProgramming);
System.out.println("\t"+codeCoursePhysics+"\t"+"\tPhysics\t"+ "\t\t\t"+Physics + "\t\t"+ gradePhysics);
System.out.println("Second Semester GPA:  " + GPASecondSemester);
System.out.println("Over All GPA:  " + overAllGPA);
System.out.println(finalReslut);




	

	

	
	

	
	


	
   

	    

	    
	    
		   
		   
		   
		   
	}
	   
	   
}


