//------------------------------------------------------------------------------
//This method takes an integer as an argument and returns true if that integer is
//a power of 2
//Susan Driskill
//February 24, 2020
//Midterm
//Problem 2
//------------------------------------------------------------------------------

public class MidtermProblem2 {

	public static void main(String[] args) {
		//Tests
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(2));
		System.out.println(isPowerOfTwo(3));
		System.out.println(isPowerOfTwo(4));
		System.out.println(isPowerOfTwo(5));
		System.out.println(isPowerOfTwo(6));
		System.out.println(isPowerOfTwo(7));
		System.out.println(isPowerOfTwo(8));
		System.out.println(isPowerOfTwo(9));
		System.out.println(isPowerOfTwo(10));
	}
	
	public static boolean isPowerOfTwo(int n) {
		//Start with false unless it meets the other conditions
		boolean isPowerOfTwo = false;
		//1 is a power of 2
		int quotient = n;
		if (n == 1) {
			isPowerOfTwo = true;
			return isPowerOfTwo;
		//A number is a power of 2 if it can be divided by 2 repeatedly until
		//the quotient is 1
		}else {
			while (quotient % 2 == 0 && quotient != 0) {
			quotient = quotient / 2;
			if (quotient == 1) {
				isPowerOfTwo = true;
			}
		}
		return isPowerOfTwo;
	}

}

}