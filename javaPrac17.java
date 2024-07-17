//________________Inheritence__________________


// it is he mechanism in java by which one class is allowed to inherit the features(fields and methods)
// of another class. in java inheritence means creating new classes based on existing ones. A class that inherit from 
// another class can reuse the methohds and fieldsof that class. In addition you can add
// new fields and methodsto your current class as well.
 

//______single inheritence______
// class A {
	// static void show(){
		// System.out.println("Class A show method");
	// }
// }
// class javaPrac17 extends A{
	// public static void main(String args[]){
		// show();
		
	// }
// }



//_________multilevel inheritence_________
// class A{
	// void show(){
		// System.out.println("Class A show method");
	// }
// }
// class B extends A{
	
// }
// class C extends B{
	
// }
// class javaPrac17{
	// public static void main(String args[]){
		// C c =new C();
		// c.show();
	// }
// }



//________Hierachical Inheritence_________

class A{
	void show (){
		System.out.println("class A show method ");
	}
}
class B extends A{
	void show2 (){
		System.out.println("class B show2 method ");
	}
}
class C extends A{
	void show3 (){
		System.out.println("class C show3 method ");
	}
}
class javaPrac17{
	public static void main(String args[]){
		B b=new B();
		C c=new C();
		b.show();
		c.show();
	}
}

// java me multiple inheritence nahi hota hai or naaahi hybrid inheritence 
//java me inhe achieve karne ke liye interface ka use karna hota hai







