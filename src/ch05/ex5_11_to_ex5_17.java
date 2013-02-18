package ch05;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drchaos
 */
import java.util.Scanner;

public class ex5_11_to_ex5_17 {
    /* EX 5.10 Write a while loop that verifies
     * that the user enters a positive integer value.
     */
  public static void ex5_10() {
	  int value = 0;
	  Scanner scan = new Scanner(System.in);
	  
	  if(scan.hasNextInt()) {
	  	value = scan.nextInt();
	  }

	  while(scan.hasNextInt() && value > 0) {
		  value = scan.nextInt();
		  System.out.println("ex5_10: input = " + value);
	  }

	  System.out.println("ex5_10: INVAL input: " + value);
  }
/* EX 5.11: Write a code fragment that reads and prints integer
 * values entered by a user until a particular sentinel value
 * (stored in SENTINEL) is entered.
 * Do not print the sentinel value.
 */
  public static void ex5_11() {
	  final int SENTINEL = 0;
	  
	  Scanner scan = new Scanner(System.in);
	  int value;
	  
	  while((value = scan.nextInt()) != SENTINEL)
	  {
		  System.out.println("ex5_11: " + value);
	  }
  }
  
  /* EX 5.12 Write a method called maxOfTwo that accepts two
   *         integer parameters and returns the larger of the two. 
   */
  public static int maxOfTwo(int a, int b) {
	  if(a > b) {
		  return a;
	  }
	  else {
		  return b;
	  }	    
  }
  
  /* EX 5.13 Write a method called larger that accepts two 
   * floating point parameters (of type double) and returns
   * true if the first parameter is greater than the second,
   * and false otherwise.
   */
  public static double larger(double a, double b) {
	  if(a > b) {
		  return a;
	  }
	  else {
		  return b;
	  }
  }
  /* EX 5.14  Write a method called evenlyDivisible that accepts
   * two integer parameters and returns true if the first
   * parameter is evenly divisible by the second, or vice versa,
   * and false otherwise. Return false if either parameter is
   * zero.
   */
  public static boolean evenlyDivisible(int a, int b) {
	  if(a == 0 || b == 0) {
		  return false;
	  }

	  if(a % b == 0) {
		  return true;
	  }
	  else if(b % a == 0) {
		  return true;
	  }
	  return false;
  }
  /* EX 5.15 Write a method called isAlpha that accepts a
   * character parameter and returns true if that character
   * is either an uppercase or lowercase alphabetic letter.
   */
  public static boolean isAlpha(char c) {
	  if((c >= 'A' && c <= 'Z') ||
	     (c >= 'a' && c <= 'z')) {
		  return true;
		  
  	  }
	  return false;
  }
  /* EX 5.16 Write a method called floatEquals that accepts
   * three floating point values as parameters. The method
   * should return true if the first two parameters are equal
   * within the tolerance of the third parameter.
   */
  public static boolean floatEquals(double a, double b,
	  double tolerance) {
	  double x = Math.abs(Math.abs(a) - Math.abs(b));
	  if(x <= tolerance) {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  /* EX 5.17 Write a method called isIsosceles that accepts three integer
   * parameters that represent the lengths of the sides of a triangle.
   * The method returns true if the triangle is isosceles but not
   * equilateral
   * (meaning that exactly two of the sides have an equal length), 
   * and false otherwise
   */
   public static boolean isIsosceles(int a, int b, int c) {
	   if((a == b && b != c)    ||
		(a != b && b == c)  ||
		(a != b && a == c)) {
		   return true;
	   }
	   return false;
   }
}