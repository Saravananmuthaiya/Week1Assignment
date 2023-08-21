package w1assignment;

public class Fibbinocci {

	public static void main(String[] args) {
		
		
		int num3=0;
		int num4=1;
		int n1;
		System.out.println("Upto 11 iteration");
		System.out.print(num3+" "+num4);
		
		for (int j=2;j<=12;j++)
		{
			n1=num3+num4;
			System.out.print(" "+n1);
			num3=num4;
			num4=n1;
			}
				
		
		int num1=0;
		int num2=1;
		int n;
		System.out.println("");
		System.out.println("Within integer value:56");
		System.out.print(num1+" "+num2);
		
		for (int i=2;i<12;i++)
		{
			n=num1+num2;
			if(n<=56) {
			System.out.print(" "+n);
			num1=num2;
			num2=n;
			}
			else
				break;
			
		}
		
	}

}
