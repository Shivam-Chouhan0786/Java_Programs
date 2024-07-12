// java String class methods 

class javaPrac8{
	public static void main(String args[]){
		String s1=" ram ji ki nikali sawari ";
		String s2=" ram lakshman janki jay bolo hanuman ki ";
		
		String concatString = s1.concat(s2);//concat(String) method 
		String ar[]=s1.split(" ");//spilit() method
		
		
		System.out.println(concatString);
		System.out.println(s1);
		System.out.println(s1.length());// length() method 
		System.out.println(s1.toUpperCase());//toUpperCase() method
		System.out.println(s1.toLowerCase());//toLowerCase() method 
		System.out.println(s1.compareTo(s2));//compareTo(String) method return type int
		System.out.println(s1.compareToIgnoreCase(s2));//compareToIgnoreCase(String) method return type int 
		System.out.println(s1.equals(s2));//equals(String) method
		System.out.println(s1.equalsIgnoreCase(s2));//equalIgnoreCase(String) method
		System.out.println(s1.charAt(10));//charAt(index) method
		System.out.println(s1.substring(3));//substring(int) method
		System.out.println(s1.substring(3,17));//subString(int int) method
		System.out.println(s1.trim());//trim() method
		System.out.println(s1.replace('r','k'));//replace(char ,char) methods 
		
	}
}