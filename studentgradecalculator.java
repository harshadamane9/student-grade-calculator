package hrm;
import java.util.Scanner;

public class studentgradecalculator {
	
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int m,c,p,cs,b;
	System.out.println("Enter marks in each subject");
	System.out.println("Maths:");
	m=sc.nextInt();
	System.out.println("Physics:");
	p=sc.nextInt();
	System.out.println("Chemistry:");
	c=sc.nextInt();
	System.out.println("Biology:");
	b=sc.nextInt();
	System.out.println("ComputerScience:");
	cs=sc.nextInt();
	studentgradecalculator s1= new studentgradecalculator();
	s1.calculator(m, p, c, cs, b);
}
void calculator(int m,int p,int c,int cs,int b) {
	int total;
	float percentage;
	char Grade='p';
	total=m+p+cs+c+b;
	System.out.println("Total Marks:"+total);
	percentage = (total*100)/500 ;
	System.out.println("Percentage:"+percentage);
	if(percentage>=90 && percentage<=100  ) {
		Grade='A';
	}
	if(percentage<90 && percentage>=80) {
		Grade='B';
	}
	if(percentage<80 && percentage>=70) {
		Grade='C';
	}
	if(percentage<70 && percentage>=45) {
		Grade='D';
	}
   if(percentage<45) {
		Grade='F';
	}
	System.out.println("Grade obtained:"+Grade);
}

}
