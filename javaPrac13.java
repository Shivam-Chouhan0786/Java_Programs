// why we write System.out.println();

// class A{
	// void show(){
		// System.out.println("class A");
	// }
// }
// class B{
	// static A out =new A();
// }
// class javaPrac13{
	// public static void main(String args[]){
		// B.out.show();
	// }
// }



// import java.io.*;
// class Ramji{
	// static PrintStream sitaMata = new PrintStream(System.out);
// }
// class javaPrac13{
	// public static void main(String args[]){
		// Ramji.sitaMata.println("Print content");
		// System.out.println("Print content by using system class");
	// }
// }

// ______________Static import_______________

// class javaPrac13{
	// public static void main(String args[]){
		// out.println("print data");
	// }
// }


// import static java.lang.System.*;//Static import
// class javaPrac13{
	// public static void main(String args[]){
		// out.println("print data");
	// }
// }	

// import static java.lang.Integer.*;//Static import
// import static java.lang.System.*;
// class javaPrac13{
	// public static void main(String args[]){
		// out.println("print data");
		// out.println(MAX_VALUE);
		// out.println(MIN_VALUE);
	// }
// }

// import static java.lang.Integer.*;//Static import
// import static java.lang.Byte.*;//Static import
// import static java.lang.System.*;
// class javaPrac13{
	// public static void main(String args[]){
		// out.println("print data by using Static import System");
		// out.println(MAX_VALUE);//error: reference to MAX_VALUE is ambiguous
		// out.println(MIN_VALUE);//error: reference to MIN_VALUE is ambiguous
	// }
// }

