import java.util.*;
public class Gradecalculator
{
	public static void main(String[] args) {
	 Scanner p=new Scanner(System.in);
	 int to;
do{
    	 System.out.println("enter Total no.of subjects:");
    	  to=p.nextInt();
    	 if(to<=0)
    	 System.out.println("enter valid no.of subjects");
}while(to<=0);
System.out.println("enter total no.of marks obtained in eaach subject");
int totalmarks=0;
for(int i=1;i<=to;i++)
{
    System.out.println("the marks obtained (out of 100) in subject"+i+" is:");
    int marks = p.nextInt();
            totalmarks += marks;

}
        double averagepercentage = (double) totalmarks / to;

        // Calculate average percentage
        double totalpercentage = (averagepercentage / 100) * 100;

        // Grade Calculation
        char grade;
        if (totalpercentage >= 90) {
            grade = 'O';
        } else if (totalpercentage >= 80) {
            grade = 'S';
        } else if (totalpercentage >= 70) {
            grade = 'A';
        } else if (totalpercentage >= 60) {
            grade = 'B';
        } else if(totalpercentage >=50) {
            grade = 'C';
        }
        else if(totalpercentage >= 40){
            grade ='D';

        }
        else{
            grade='F';
        }

  System.out.println("The obtained TotamMArks are :"+totalmarks);
  System.out.println("The obtained grade is :"+grade);
  System.out.println("The obtained AveragePercentage is :"+averagepercentage);
	}
}