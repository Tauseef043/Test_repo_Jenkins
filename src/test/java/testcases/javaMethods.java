package testcases;

public class javaMethods {
	
	
	public static void sumOftwoNumbers() //java methods with no parameters and no return type {
	{
		int a=10,b=20;
		int sum=a+b;
		
		System.out.println(sum);
		
		
	}
	
	
	public static void multiplicationsOFTwoNumbers(int number1, int number2) 	// java methods with parameters but no return type
	{
		int Answer=0;
		Answer=number1 * number2;
		
		System.out.println(Answer);
		
	}
	public static void customMethod(String Name, int age, String Gender) 	// java methods with parameters but no return type
	{
		System.out.println("Your name is: "+Name);
		System.out.println("Your age is: "+age);
		System.out.println("Your age is: "+Gender);
	}



	
	public static int SUbsctractionOFTwoNumber(int a, int b) 	// java methods with parameter and return type as well
	{
		int Answer=a-b;
		
		return Answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		System.out.println("code output");
		
		System.out.println("code output");
		
		System.out.println("code output");
		
		System.out.println("code output");
		
		sumOftwoNumbers();

		
		multiplicationsOFTwoNumbers(10,30);
		
		int a=SUbsctractionOFTwoNumber(20,10);
		
		
		System.out.println("Susbtractions of two numbers :"+ a);
		
		System.out.println("code output");
		
		System.out.println("code output");
		
		System.out.println("code output");
		
		System.out.println("code output");
		
		
		sumOftwoNumbers();
		

		multiplicationsOFTwoNumbers(4,10);
		
		System.out.println(SUbsctractionOFTwoNumber(2,9));
		System.out.println("code output");
		
		System.out.println("code output");
		
		System.out.println("code output");
		
		System.out.println("code output");

		multiplicationsOFTwoNumbers(50,60);
		
		
		sumOftwoNumbers();
		
		
		customMethod("DAVID",20,"MALE");
		
		System.out.println("SUbstaction: "+SUbsctractionOFTwoNumber(2,9));
		//java methods with no parameters and no return type
		// java methods with parameter but no return type
		// java methods with parameter and return type as well
	}

}
