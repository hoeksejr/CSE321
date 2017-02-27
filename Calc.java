// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests

import java.lang.*;

public class Calc
{
   static public int add (int a, int b)
   {
      return a + b;
   }
   
   static public int subtract(int a, int b){
	   return a - b;
   }
   
   static public int multiply(int a, int b){
	   return a * b;
   }
   
   /*
   static public float divide(int a, int b){
	   if (b ==0){
		   throw new ArithmeticException();
	   }
	   float aF = (float) a;
	   float bF = (float) b;
	   
	   return aF/bF;
   }
   */
   
   static public float divide(int a, int b){
	   if (b ==0){
		   throw new ArithmeticException();
	   }
	   
	   return (float)a/(float)b;
   }
   

}
