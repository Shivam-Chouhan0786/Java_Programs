class A{
	int x,y;
	A(int x,int y){
		this.x=x;
		this.y=y;
		System.out.println("Class A Constructor");
	}
	{
		System.out.println("class A instance block");
	}
}
class B extends A{
	B(int x,int y){
		super(x,y);
		this.x=x;
		this.y=y;
		System.out.println("Class B Constructor");
	}
	{
		System.out.println("Class B instance block");
	}
}

class javaPrac16{
	public static void main(String args[]){
		B b=new B(101,102);
	}
}




//super() keyword by default constructor me hota hai but voh non-parameterized hota hai 
//constructor me super() keyword first statement hi hona chahiye