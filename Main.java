package lab2;
import java.util.Scanner;

class Student{
	Scanner s1 = new Scanner(System.in);
	
	void primitive_data() {
		System.out.print("Enter your roll no :");
		int roll_no = s1.nextInt();
		
		System.out.print("Enter your mail id : ");
		String mail_id = s1.next();
		
		System.out.print("Enter the amount you earn daily : ");
		float earn = s1.nextFloat();
		
		System.out.print("Enter the your name first leter : ");
		char name = s1.next().charAt(0);
		
		System.out.println();
		System.out.println("========Primitive data type output==========");
		System.out.println();
		System.out.println("Roll no is :" +roll_no);
		System.out.println("Mial id is :" +mail_id);
		System.out.println("Daily earn is :" +earn);
		System.out.println("Name first char is  :" +name);
		
		
	}
	
	void assii_value() {
		
		System.out.print("Enter a Charater to convert ascii value : ");
		char char_value = s1.next().charAt(0);
		
		int ascii_value = char_value;
		
		System.out.println("Entring character ascii value is : " + ascii_value);
		
	}
	
	void QuotientRemainder() {
		
		System.out.print("Enter the Dividen Number : ");
		int dividend = s1.nextInt();
		System.out.print("Enter the divisor number : ");
		int divisor = s1.nextInt();
		
		int quotient = dividend / divisor;
	    int remainder = dividend % divisor;
	    
	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}
	
	void swap_two_numbers() {
		System.out.print("Enter the 1st Number : ");
		int first = s1.nextInt();
		System.out.print("Enter the 2nd number : ");
		int second = s1.nextInt();
		
		int temp = first;
		first = second;
		second = temp;
		
		System.out.println("=======After swapping the number is=========== ");
		System.out.println("1st position number iss = " + first);
	    System.out.println("2nd position number is  = " + second);
	}
	
	void even_odd() {
		System.out.print("Enter a number : ");
		int number = s1.nextInt();
		
		if(number%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The Number is odd");
		}
	}
	
	void chek_alphabet() {
		System.out.print("Enter an alphabet to check vowel or consonant : ");
		char alpha = s1.next().charAt(0);
		
		if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'||alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U') {
			System.out.println("The alphabet is vowel ");
		}
		
		else {
			System.out.println("The alphavet is onsonant");
		}
	}
	
	void large_num_three_num() {
		//int num1,num2,num3;
		System.out.print("Enter the three numbers  : ");
		int num1 = s1.nextInt();
		int num2 = s1.nextInt();
		int num3 = s1.nextInt();
		
		if( num1>num2 && num3>num2) {
			System.out.println("The smallest number is : "+ num2);
		}
		else if (num2>num1 && num2>num1) {
			System.out.println("The smallest number is : "+ num1);
		}
		else {
			System.out.println("The smallest number is : "+ num3);
		}
	}
	
	void Quadratic_Equation() {
		System.out.print("Enter the value : ");
		double a = s1.nextDouble(); 
		double b = s1.nextDouble(); 
		double c = s1.nextDouble();
	    double root1, root2;
	 // calculate the determinant (b2 - 4ac)
	    double determinant = b * b - 4 * a * c;

	    // check if determinant is greater than 0
	    if (determinant > 0) {

	      // two real and distinct roots
	      root1 = (-b + Math.sqrt(determinant)) / (2 * a);
	      root2 = (-b - Math.sqrt(determinant)) / (2 * a);

	      System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
	    }

	    // check if determinant is equal to 0
	    else if (determinant == 0) {

	      // two real and equal roots 
	      // determinant is equal to 0
	      // so -b + 0 == -b
	      root1 = root2 = -b / (2 * a);
	      System.out.format("root1 = root2 = %.2f;", root1);
	    }

	    // if determinant is less than zero
	    else {

	      // roots are complex number and distinct
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-determinant) / (2 * a);
	      System.out.format("root1 = %.2f+%.2fi", real, imaginary);
	      System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
	    }
	}
	
	void leap_year() {
		
		System.out.print("Enter the year : ");
		int year = s1.nextInt();
		boolean leap = false;

	    // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	  }
	
	void pos_neg() {
		System.out.print("Enter a number : ");
		int num1 = s1.nextInt();
		
		if(num1>=0) {
			System.out.println("The number is positive.");
		}
		else {
			System.out.println("The number is negetive.");
		}
	}
	
	void alphabet2() {
		
		System.out.print("Enter the an alphabet : ");
		char c = s1.next().charAt(0);

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
	}
	
	void natural_sum() {
		
		System.out.print("Enter the length of number you sum at a time : ");
		int num = s1.nextInt(); 
		int sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
	}
	
	void fatriol_number() {
		
		System.out.print("Enterr the number for factorial : ");
		int num = s1.nextInt();
		int i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
	}
	
	void multipilication_table() {
		
		System.out.println("Enter the number you want to multipliaion : ");
		int num =s1.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
	}
	
	void fibonacci_series() {
		
		System.out.print("Enter the length of nubmer : ");
		int n =s1.nextInt(); 
		int firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      // compute the next term
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	}
	
	void gcd_number() {
		
		System.out.print("Enter the two number : ");
		// find GCD between n1 and n2
	    int n1 = s1.nextInt(); 
	    int n2 = s1.nextInt();
	    
	    // initially set to gcd
	    int gcd = 1;

	    for (int i = 1; i <= n1 && i <= n2; ++i) {

	      // check if i perfectly divides both n1 and n2
	      if (n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
	}
	
	void lcm_number() {
		
		System.out.println("Enter the two numbers : ");
		int n1 = s1.nextInt();
		int n2 = s1.nextInt(); 
		int gcd = 1;

	    for(int i = 1; i <= n1 && i <= n2; ++i) {
	      // Checks if i is factor of both integers
	      if(n1 % i == 0 && n2 % i == 0)
	        gcd = i;
	    }

	    int lcm = (n1 * n2) / gcd;
	    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
	}
	
	void character() {
		char c;

	    for(c = 'A'; c <= 'Z'; ++c)
	      System.out.print(c + " ");
	}
	
	void count_digit() {
		
		System.out.println("Enter the number : ");
		int count = 0; 
		int num = s1.nextInt();

	    while (num != 0) {
	      // num = num/10
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	}
	
	void reverse_digit() {
		
		System.out.println("Enter the number : ");
		int num = s1.nextInt(); 
		int reversed = 0;

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	}
	
	void calulate_power() {
		
		System.out.println("Enter the base and exponent number");
		int base = s1.nextInt(); 
		int exponent = s1.nextInt();

	    long result = 1;

	    while (exponent != 0) {
	      result *= base;
	      --exponent;
	    }

	    System.out.println("Answer = " + result);
	}
	
	void palindrome() {
		
		System.out.println("Enter a string to check palindrome");
		String str = s1.next(), reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	}
	
	void prime_number() {
		
		System.out.print("Enter the number : ");
		int num = s1.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}

}



public class Main {

	public static void main(String[] args) {
		
		Student obj1 = new Student();
		//obj1.primitive_data();
		//obj1.assii_value();
		//obj1.QuotientRemainder();
//		obj1.swap_two_numbers();
		//obj1.even_odd();
//		obj1.chek_alphabet();
//		obj1.large_num_three_num();
//		obj1.Quadratic_Equation();
//		obj1.leap_year();
//		obj1.pos_neg();
//		obj1.alphabet2();
//		obj1.natural_sum();
//		obj1.multipilication_table();
//		obj1.fibonacci_series();
//		obj1.gcd_number();
//		obj1.lcm_number();
//		obj1.character();
//		obj1.count_digit();
//		obj1.reverse_digit();
//		obj1.calulate_power();
//		obj1.palindrome();
		obj1.prime_number();
		
		

	}

}
