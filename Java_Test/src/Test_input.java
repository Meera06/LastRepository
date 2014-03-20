import java.util.Scanner;


public class Test_input {			//class to find whether the number is prime or coprime
	
	@SuppressWarnings("resource")
	public static void main(String args[])
	{
		int num1,num2,num3,ret,sw_var;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1.one number" +
				"2.two numbers");
		sw_var=sc.nextInt();
		switch(sw_var)						
		{
		case 2:								//in case of 2 numbers
			System.out.println("Enter the numbers:");
			num1=sc.nextInt();
			num2=sc.nextInt();
			ret=Coprime_Calc(num1,num2);
			if(ret==1)
				System.out.println("Given numbers are coprime");
			else
				System.out.println("Given numbers are not coprime");
		break;
		case 1:								//in case of 1 number
			System.out.println("Enter the number:");
			num3=sc.nextInt();
			Prime_Calc(num3);
			/*if(ret2==0)
			{
				System.out.println("Given number is prime");
				num3=num3+1;
				ret2=Prime_Calc(num3);
				while((ret2==1))
				{	
					num3=num3+1;
					ret2=Prime_Calc(num3);
				}
			}
			else
			{
				System.out.println("Given number is not prime");
			}*/
			break;
		}							//end of switch
	}								//end of main

	private static int Coprime_Calc(int num1, int num2) {			
		//calculation of coprime numbers
		int tmp;
		while(true){
		tmp=num1%num2;
		if(tmp==0)
		return num2;
		num1=num2;
		num2=tmp;
		}							//end of while loop
		
	}								//end of Calc func

	private static void Prime_Calc(int num) {
		//calculation of prime numbers
			int flag = 0;
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					flag=1;
					System.out.println(i);
				}
			}					//end of for loop
			if(flag==1){
				System.out.println(flag);
				System.out.println(num);
				System.out.println("Not prime");
				num=num+1;
				Prime_Calc(num);
			}
			else
			{
				System.out.println("prime");
				System.out.println(num);
				//num=num+1;
				//Prime_Calc(num);
				/*num=num+1;
				if(Prime_Calc(num)==0)
				{
					
				}*/
			}
		
		}							//end of prime number function
	}
