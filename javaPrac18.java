

//_________Example of contructor chainning_________


class A{
	A(){
		System.out.println("Class A Constructor");
	}
	{
		System.out.println("Class A Instance block");
	}
}
class B extends A{
	B(){
		System.out.println("Class B Constructor");
	}
	{
		System.out.println("Class B Instance block");
	}
}
class C extends B{
	C(){
		System.out.println("Class C Constructor");
	}
	{
		System.out.println("Class C Instance block");
	}
}
class javaPrac18{
	static public void main(String args[]){
		new C();
	}
}

//java compiler by default constructor me first keyword super() add kar deta hai jisse 
//super class ka constructor call hota hai phir uske baad second insance block ko add kar 
// deta hai