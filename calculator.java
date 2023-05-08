import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		int n1,n2,choice,cal;
		System.out.print("Enter two numbers: ");
		Scanner r= new Scanner(System.in);
		n1=r.nextInt();
		n2=r.nextInt();
		System.out.print("Select Operation:");
		choice=r.nextInt();
		
		
		if(choice==1)
		{
			
			cal=n1+n2;
			System.out.print("ADDITION:"+cal);
		}
		else if(choice==2)
		{
			cal=n1-n2;
			System.out.print("SUBTRACTION:"+cal);
		}
		else if(choice==3)
		{
			cal=n1*n2;
			System.out.print("MULTIPLICATION:"+cal);
		}
		else if(choice==4)
		{
			cal=n1/n2;
			System.out.print("DIVISION:"+cal);
		}
		

	}

}
