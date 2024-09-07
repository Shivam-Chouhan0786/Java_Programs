// polymorphism

// polymorphism 2 type ke hote hai 
// 1. run time polymorphism (late binding ,dynamic binding ) ex:- method overriding
// 2. compile time polymorphism (early binding , static binding) ex:- method overloading , method hiding 


// private final or static methods overload toh ho sakti hai but override nahi 
// ho sakti hai 


// ______________________Examples of method overloading________________________

// class javaPrac19{
		// void sum(int x, int y){
			// System.out.println("Sum is => "+(x+y));
		// }
		// void sum(int x, int y,int z){
			// System.out.println("Sum is => "+(x+y+z));
		// }
	// public static void main(String args[]){
		// javaPrac19 obj =new javaPrac19();
		// obj.sum(10,20);
		// obj.sum(10,20,30);
	// }
// }


// by default values ko compiler int ki tarah hi treat karta hai 

// class javaPrac19{
		// void sum(int x, int y){
			// System.out.println("Sum is => "+(x+y));
		// }
		// void sum(int x, int y,short z){
			// System.out.println("Sum is => "+(x+y+z));
		// }
	// public static void main(String args[]){
		// javaPrac19 obj =new javaPrac19();
		// obj.sum(10,20);
		// obj.sum(10,20,30);
	// }
// }


class javaPrac19{
		void sum(byte x, int y){
			System.out.println("Sum is => "+(x+y));
		}
		void sum(int x, int y,int z){
			System.out.println("Sum is => "+(x+y+z));
		}
	public static void main(String args[]){
		javaPrac19 obj =new javaPrac19();
		byte x=10;
		byte y=20;
		obj.sum(x,y);
		obj.sum(10,20,30);
	}
}