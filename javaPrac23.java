//									Inner Class 

//	we can define inner class in two types first one is non-static inner class and second
// 	one is static inner class 
//	non-static inner class has three types these are :1) instance inner class 2) local inner class
//	and 3) annonymous inner class . annonymous inner class has three types a) that extend by 
//	class b) that implements by interface c) that define inside the arguements 

//non-static inner class : instance inner class
//example of instance inner class 




// class OuterClass{
	// class InnerClass{
		// void show(){
			// System.out.println("inner class show method called");
		// }
	// }
	// void show(){
		// System.out.println("outer class show method called");
	// }
// }
// class ChildClass extends OuterClass{} 
// class javaPrac23{
	// public static void main(String ar[]){
		// OuterClass oc = new OuterClass();
		// oc.show();
		
		// OuterClass.InnerClass ic = oc.new InnerClass();
		// ic.show();
		
		// ChildClass.InnerClass ic2 = new ChildClass().new InnerClass();
		// ic.show();
	// }
// }




//non-static inner class : Local inner class
//example of Local inner class 


// class OuterClass{
		// void show(){
			// System.out.println("show method called");
			// class InnerClass{
				// void show(){
					// System.out.println("Inner class show method called");
				// }
			// }
			// InnerClass ic=new InnerClass();
			// ic.show();
		// }	
// }
// class javaPrac23{
	// public static void main(String args[]){
		// OuterClass oc = new OuterClass();
		// oc.show();
	// }
// }




//non-static inner class : Annonymous inner class - that extend by class 
//example of Annonymous inner class - that extend by class 



// abstract class ClassA{
	// abstract void show();
	// static void show2(){
		// System.out.println("Static void show2 class");
	// }
// }
// class javaPrac23{
	// public static void main(String args[]){
		// ClassA a = new ClassA(){
			// public void show(){
				// System.out.println("method body define through annonymous class object");
			// }
		// };
		// a.show();
		// a.show2();
	// }
// }

// second example of annonymous inner class that extends by class 
// class Employee {
	// void companyName(){
		// System.out.println("Company name is XYZ");
	// }	
	// void empSal(){
		// System.out.println("In our company we provide highest salary 60,000");
	// }
// }
// class javaPrac23{
	// public static void main(String args[]){
		// Employee e1=new Employee();
		// Employee e2=new Employee(){
			// @Override
			// void empSal(){
				// System.out.println("For our e3 employee we have highest salary 62,000");
			// }
		// };
		// Employee e3=new Employee(){
			// @Override
			// void empSal(){
				// System.out.println("For our e3 employee we have highest salary 69,000");
			// }
		// };
		// Employee e4=new Employee(){
			// @Override
			// void empSal(){
				// System.out.println("For our e3 employee we have highest salary 79,000");
			// }
		// };
		// e1.companyName();
		// e1.empSal();
		// e2.companyName();
		// e2.empSal();
		// e3.companyName();
		// e3.empSal();
		// e4.companyName();
		// e4.empSal();
	// }
// }



//non-static inner class : Annonymous inner class - that implements by interface
//example of Annonymous inner class - that implements by interface


// interface Inter1{
	// void show();
	// void show2();
// }
// class javaPrac23{
	// public static void main(String[] args){
		// Inter1 i1= new Inter1(){
			// public void show2(){
				// System.out.println("defining show2 methods body");
			// }
			// public void show(){
				// System.out.println("defining show methods body in annonymous");
			// }
		// };
		// i1.show();
		// i1.show2();
	// }
// }


//			Functional Interface : An interface which has only one abstract method called 
//			Functional interface
// 		Lambda Expression : extenderd version of annonymous class called lambda expression 


// interface Inter1 {
	// void interMethod();
// }
// class javaPrac23{
	// public static void main(String []args){
		// Inter1 i = () -> System.out.println("interMethod method's content");
		// i.interMethod();
	// }
// }


// second example of lambda expression
interface Inter1 {
	void sum(int a,int b);
}
class javaPrac23{
	public static void main(String []args){
		Inter1 i = (a,b) -> {	
			System.out.println("sum method's content");
			System.out.println("sum is : "+(a+b));
		};
		i.sum(123,100);
	}
}