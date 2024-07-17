
//______Static keyword______


// class javaPrac11{
	// int x=111;
	// public static void main(String args[]){
		// System.out.println(x);//static method only static content ko hi access kar pati hai
	// }
// }



// class javaPrac11 {
	// static int x = 10;
	// public static void main(String args[]) {
		// System.out.println(x);
	// }
// }

// class Demo101{
	// static int x=119;//Static variable
	// Demo101(){
		// System.out.println("Class Demo101 Constructor");
	// }
	// void show(){
		// System.out.println("Show method ");
		// System.out.println("static variable x value = "+x);
	// }
// }



// class javaPrac11{
	// public static void main(String args[]){
		// Demo101 d=new Demo101();
		// d.show();
	// }
// }
	// int x=119;//instance variable
	// Demo101(){
		// System.out.println("Class Demo101 Constructor");
	// }
	// void show(){
		// System.out.println("Show method ");
		// System.out.println("instance variable x value = "+x);
	// }
// }
// class javaPrac11{
	// public static void main(String args[]){
		// Demo101 d=new Demo101();
		// d.show();
	// }
// }



class Demo101{
	static int x;
	Demo101(int x){
		this.x=x;
	}
	void Show(){
		System.out.println("Show method");
		System.out.println("access static variable x => "+this.x);
	}
}
class javaPrac11{
	public static void main(String ar[]){
		Demo101 d=new Demo101(102);//initialization using constructor
		d.Show();
		System.out.println("accessing static variable using class name x => "+Demo101.x);
		
	}
}