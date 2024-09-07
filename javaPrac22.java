// class ForFinal{
	// final String fruitName;
	// ForFinal(){
		// this.fruitName="Watermelone";
	// }
	// ForFinal(int x){
		// this.fruitName="";
	// }
// }

// class javaPrac22{
	// public static void main(String args[]){
		// ForFinal ff=new ForFinal();
		// System.out.println(ff.fruitName);
	// }
// }



abstract class AbstractClass{
	void show1(){
		System.out.println("This is a show1 method from Abstrct class but this is not abstract method");
	}
	abstract void show2();
}
class subClassForAbstractClass extends AbstractClass{
	void show2(){
		System.out.println("This is a abstract overridden method show2 from AbstrcatClass");
	}
}
public class javaPrac22{
	public static void main(String args[]){
		subClassForAbstractClass sbs=new subClassForAbstractClass();
		sbs.show1();
		sbs.show2();
		

	}
}