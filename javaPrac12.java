//Static block > instance block > constructor > methods

class A{
	A(){
		System.out.println("Class A non-param constructor");
	}
	A(int x){
		System.out.println("Class A param constructor");
	}
	{//instance block
		System.out.println("Class A instance block");
	}
	static{//Static block
		System.out.println("Class A static block");
	}
	void show(){
		System.out.println("Class A show method");
	}
}
class javaPrac12{
	public static void main(String args[]){
		new A(10).show();
	}
}