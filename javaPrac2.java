// Har data type ke corressponding ek wrapper class provide ki hui hai jo ki java.lang 
// package ke andar hai jo ki program me by-default load rehta hai

// java le pass total 8 Data types hai { byte, short, int, long, float, double, char, boolean}

// class javaPrac2{
	// public static void main(String args[]){
		
		// System.out.println("Byte.MAX_VALUE = "+Byte.MAX_VALUE);
		// System.out.println("Byte.MIN_VALUE = "+Byte.MIN_VALUE);
		// System.out.println("Short.MAX_VALUE = "+Short.MAX_VALUE);
		// System.out.println("Short.MIN_VALUE = "+Short.MIN_VALUE);
		// System.out.println("Integer.MAX_VALUE = "+Integer.MAX_VALUE);
		// System.out.println("Integer.MIN_VALUE = "+Integer.MIN_VALUE);
		// System.out.println("Long.MAX_VALUE = "+Long.MAX_VALUE);
		// System.out.println("Long.MIN_VALUE = "+Long.MIN_VALUE);
	// }
// }


// Jab kabhi bhi hum do data types ke bichh arithmatic operation perform karwate hai toh result 
// by default MAX(typeof x, typeof y,int) ke form me aata hai jo bhi teeno me sabse largest data
// type hoga voh us type ka data result me milega


// jab kabhi bhi hum variable me uski range se vahar ki value assign karwate hai toh compiler 
// by default value ko int man leta hai 

// class javaPrac2{
	// public static void main(String args[]){
		// byte x=10;
		// byte y=20;
		// byte z=x+y;
		// System.out.println(z);
	// }
// }

// class javaPrac2{
	// public static void main(String args[]){
		// byte x=10;
		// byte y=20;
		// byte z=(byte)x+y;
		// System.out.println(z);
	// }
// }

// class javaPrac2{
	// public static void main(String args[]){
		// byte x=10;
		// byte y=20;
		// int r=x+y;
		// byte z=(byte)r;
		// System.out.println(z);
	// }
// }

// class javaPrac2{
	// public static void main(String args[]){
		// byte x=10;
		// byte y=20;
		// byte z=(byte)(x+y);
		// System.out.println(z);
	// }
// }

// Kisi bhi number ke aage 0 laagane se vo no. Octal me convert ho jata hai
// Kisi bhi number ke aage 0x laagane se vo no. HexaDecimal me convert ho jata hai


// class javaPrac2{
	// public static void main(String args[]){
		// byte x=058;
		// System.out.println(x);
	// }
// }

// class javaPrac2{
	// public static void main(String args[]){
		// int x=2147483648L;
		// System.out.println(x);
	// }
// }

// class javaPrac2{
	// public static void main(String args[]){
		// long x=2147483648L;
		// int x;
		// System.out.println(x);
	// }
// }


// class javaPrac2{
	// public static void main(String args[]){
		// String s1 ="Ram";
		// String s2 ="Sita";
		// System.out.println(s1);
		// System.out.println(s2);
		// System.out.println(s1+s2);
		// System.out.println(s1-s2);
	// }
// }

// class javaPrac2{
	// public static void main(String args[]){
		// String s1="Ram";
		// String s2="Ram ";
		// System.out.println(s1==s2);
		// System.out.println(s1);
		// System.out.println(s2);
	// }
// }


// class javaPrac2{
	// public static void main(String args[]){
		// byte x=123;
		// int y=x;
		// String s1=""+(x+y);
		// System.out.println(s1);
		// System.out.println(y);
	// }
// }

// class javaPrac2{
	// public static void main(String args[]){
		// int y=013;
		// System.out.println(y);
	// }
// }