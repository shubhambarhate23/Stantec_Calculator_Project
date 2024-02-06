package Stantec_Project;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		MathOperations MathOperations = new MathOperations();
		char ch = ' ';
		double firstNumber = 0, secondNumber = 0;
		double result1=0,result=0;
		do {
		
			
			System.out.println(
					"*******Operations*******\n1. Addition\n2. Subtraction" + "\n3. Multiplication\n4. Division"
							+ "\n5. Mod\n6. Square\n7. SquareRoot");
			System.out.println("Please choose one of the above");
			int choice = 0;
			try {

				if (s.hasNextInt()) {
					choice = s.nextInt();
				} else {
					// System.out.println(s.next());
					s.next();
				}

				switch (choice) {
				default: {
					System.out.println("wrong input ... ! ");
					break;
				}
				case 1: {
					System.out.println("enter 0 to exit");
					 secondNumber=1;
					while(secondNumber!=0)
					{
					
							try {
								firstNumber=result1;
								System.out.println("Enter the number");
								if (s.hasNextInt()) {
									secondNumber = s.nextDouble();

								} else {
									s.next();
									throw new wrongInputException("wrong Input.. enter valid one ");
								}
							} catch (wrongInputException e) {
							}
						
					
					 result = MathOperations.add(firstNumber, secondNumber);
					 result1=result;
					System.out.println(result1);
					}
					break;
				}
				

				case 2: {
					System.out.println("enter 0 to exit");
					secondNumber=1;
					while(secondNumber!=0)
					{
						
							try {
								firstNumber=result1;
								System.out.println("Enter the number");
								if (s.hasNextInt()) {
									secondNumber = s.nextDouble();

								} else {
									s.next();
									throw new wrongInputException("wrong Input.. enter valid one ");
								}
							} catch (wrongInputException e) {
							}
						
					result = MathOperations.subtraction(firstNumber, secondNumber);
					 result1=result;
					System.out.println(result1);
					}
					break;
				}

				case 3: {
					System.out.println("enter 0 to exit");
					secondNumber=1;
					result1=1;
					while(secondNumber!=0)
					{
							try {
								firstNumber=result1;
								System.out.println("Enter the number");
								if (s.hasNextInt()) {
									secondNumber = s.nextDouble();

								} else {
									s.next();
									throw new wrongInputException("wrong Input.. enter valid one ");
								}
							} catch (wrongInputException e) {
							}
						
					 result = MathOperations.multiplication(firstNumber, secondNumber);
					 result1=result;
					System.out.println(result1);
					}
					break;
				}

				case 4: {
					secondNumber=1;
					while(secondNumber!=0)
					{
					if(result1==0)
					{
					try {
						System.out.println("Enter first number");
						if (s.hasNextInt()) {
							firstNumber = s.nextDouble();

						} else {
							s.next();
							throw new wrongInputException("wrong Input.. enter valid one ");
						}

						System.out.println("Enter second number");
						if (s.hasNextInt()) {
							secondNumber = s.nextDouble();
						} else {
							s.next();
							throw new wrongInputException("wrong Input.. ");
						}
					} catch (wrongInputException e) {

					}
					try {
						if (secondNumber == 0) {

							throw new wrongInputException("wrong Input.. answer goes in infinite");
						} else {
							result = MathOperations.division(firstNumber, secondNumber);
							result1=result;
							System.out.println(result1);
						}
					} catch (wrongInputException e) {

					}
					}
					else if(result1!=0)
					{
						
							try {
								firstNumber=result1;
								System.out.println("Enter the number");
								if (s.hasNextInt()) {
									secondNumber = s.nextDouble();

								} else {
									s.next();
									throw new wrongInputException("wrong Input.. enter valid one ");
								}
							} catch (wrongInputException e) {
							}
						
						try {
							if (secondNumber == 0) {

								throw new wrongInputException("wrong Input.. answer goes in infinite");
							} else {
								result = MathOperations.division(firstNumber, secondNumber);
								result1=result;
								System.out.println(result1);
							}
						} catch (wrongInputException e) {

						}
					}
					}
					break;
				}

				case 5: {
					if(result1==0)
					{
					try {
						System.out.println("Enter first number");
						if (s.hasNextInt()) {
							firstNumber = s.nextDouble();

						} else {
							s.next();
							throw new wrongInputException("wrong Input.. enter valid one ");
						}

						System.out.println("Enter second number");
						if (s.hasNextInt()) {
							secondNumber = s.nextDouble();
						} else {
							s.next();
							throw new wrongInputException("wrong Input.. ");
						}
					} catch (wrongInputException e) {

					}
					}
					else if(result1!=0)
					{
						
							try {
								firstNumber=result1;
								System.out.println("Enter the number");
								if (s.hasNextInt()) {
									secondNumber = s.nextDouble();

								} else {
									s.next();
									throw new wrongInputException("wrong Input.. enter valid one ");
								}
							} catch (wrongInputException e) {
							}
						}
					 result=MathOperations.mod(firstNumber,secondNumber);
					 result1=result;
					System.out.println(result);
					break;
				}

				case 6: {
					if(result1==0)
					{
					try {
						System.out.println("Enter first number");
						if (s.hasNextInt()) {
							firstNumber = s.nextDouble();

						} else {
							s.next();
							throw new wrongInputException("wrong Input.. enter valid one ");
						}
					} catch (wrongInputException e) {
					}
					}
					else if(result1!=0)
					{
						
						try {
							//firstNumber=result1;
							System.out.println("Enter the number");
							if (s.hasNextInt()) {
								firstNumber = s.nextDouble();

							} else {
								s.next();
								throw new wrongInputException("wrong Input.. enter valid one ");
							}
						} catch (wrongInputException e) {
						}
						
						
					}
				
					 result=MathOperations.square(firstNumber);
					System.out.println(result);
					break;
				}

				case 7: {
					if(result1==0)
					{
					try {
						System.out.println("Enter first number");
						if (s.hasNextInt()) {
							firstNumber = s.nextDouble();

						} else {
							s.next();
							throw new wrongInputException("wrong Input.. enter valid one ");
						}
					} catch (wrongInputException e) {
					}
					}
					else if(result1!=0)
					{
						
						
						try {
							//firstNumber=result1;
							System.out.println("Enter the number");
							if (s.hasNextInt()) {
								firstNumber = s.nextDouble();

							} else {
								s.next();
								throw new wrongInputException("wrong Input.. enter valid one ");
							}
						} catch (wrongInputException e) {
						}
						
						
					}
					 result=MathOperations.squareRoot(firstNumber);
					System.out.println(result);
					break;
				}

				}

			} catch (InputMismatchException e1) {
				System.out.println("cannot allow any input other than integer type");
			}
			
			try
			{
			
			if(choice>5 && choice<8 && result!=0)
			{
				System.out.println("if you want the result with your previous total select operation\n1.add\n2.sub\n3.multiply\n4.divide");
				int choice1=s.nextInt();
				switch(choice1)
				{
				default:
					System.out.println("wrong input");
				 case 1:
					 result1=result1+result;
					 break;
				 case 2:
					 result1=result1-result;
					 break;
				 case 3:
					 result1=result1*result;
					 break;
				 case 4:
					 result1=result1/result;
					 break;
				/* case 5:
					 result1*/
				}
				
			}
			
		
			
	} catch (InputMismatchException e1) {
		System.out.println("cannot allow any input other than integer type");
	}
			s.next();	
			System.out.println("want to clear the total press c or C otherwise press any key to continue with same operation result");
			
			char ch1 = s.next().charAt(0);
			/*if(choice<8 && choice>5)
			{
			result1=result1+result;
			}*/
			if(ch1=='c' || ch1=='C')
			{
				System.out.println("inside");
				result1=0;
			}
			
			System.out.println("Total : "+result1);
			System.out.println("if you want to continue press y and if not then press any key");
			ch = s.next().charAt(0);
			
			
			
			// System.out.println(ch);

		} while (ch == 'y' || ch == 'Y');

	}

}
