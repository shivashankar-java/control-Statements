package Polymorphism;

//program for method overloading

 class Calculator {
   public int add(int a,int b) {
	   return a+b;
   }
   
   public double add(double a,double b) {
	    return a+b;
   }
   public int add(int a,int b,int c) {
	   return a+b+c;
   }
}