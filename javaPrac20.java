// ______________________Examples of method overloading________________________

// class javaPrac20{
		// void sum(int x, int y){
			// System.out.println("Sum is => "+(x+y));
		// }
		// void sum(int x, int y,int z){
			// System.out.println("Sum is => "+(x+y+z));
		// }
	// public static void main(String args[]){
		// javaPrac20 obj =new javaPrac20();
		// obj.sum(10,20);
		// obj.sum(10,20,30);
	// }
// }


// by default values ko compiler int ki tarah hi treat karta hai 

// class javaPrac20{
		// void sum(int x, int y){
			// System.out.println("Sum is => "+(x+y));
		// }
		// void sum(int x, int y,short z){
			// System.out.println("Sum is => "+(x+y+z));
		// }
	// public static void main(String args[]){
		// javaPrac20 obj =new javaPrac20();
		// obj.sum(10,20);
		// obj.sum(10,20,30);
	// }
// }


class javaPrac20{
		void sum(byte x, int y){
			System.out.println("Sum is => "+(x+y));
		}
		void sum(int x, int y,int z){
			System.out.println("Sum is => "+(x+y+z));
		}
	public static void main(String args[]){
		javaPrac20 obj =new javaPrac20();
		byte x=10;
		byte y=20;
		obj.sum(x,y);
		obj.sum(10,20,30);
	}
}