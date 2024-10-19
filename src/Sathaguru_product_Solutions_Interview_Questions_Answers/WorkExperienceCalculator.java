package Sathaguru_product_Solutions_Interview_Questions_Answers;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class WorkExperienceCalculator {
public static int calculateExperience(String joiningDate)
{
	DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	LocalDate joinDate=LocalDate.parse(joiningDate, formatter);
	LocalDate currentDate=LocalDate.now();
	
	return Period.between(joinDate, currentDate).getYears();
}
public static void main(String[] args) {
	String joiningDate="01-Feb-2010";
	LocalDate currentDate=LocalDate.now(); 
	System.out.println("Work Experience: "+calculateExperience(joiningDate)+"years"+"\njoining Date: "+joiningDate+"\ncurrent Date: "+currentDate);
}
}
