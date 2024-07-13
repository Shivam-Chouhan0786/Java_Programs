
//Array :- In java array is a collecetion of homogenius type of data.

//_____1D array______

// class javaPrac9{
	// public static void main(String args[]){
		// int sumNum[]=new int [5];
		// int sumNumber[]={10,20,30,40,50,60};
		
		// for(int i:sumNumber){
			// System.out.println(i);
		// }
	// }
// }



//_____2D array______
// class javaPrac9{
	// public static void main(String args[]){
		// int num[][]=new int [5][5];
		// int numArray[][] = {{10,20,30},{40,50,60},{70,80,90},{101,102,103}};
		// for(int i[]:numArray){
			// for(int j:i){
				// System.out.print(j+" ");
			// }
				// System.out.println();
		// }
	// }
// }


//_____3D array______
class javaPrac9{
	public static void main(String args[]){
		int num[][]=new int [5][5];
		int numArray[][][] = {{{10,11},{20,30}},{{40,41},{50,60}},{{70,71},{80,90}},{{101,102},{200,103}}};
		System.out.println(numArray.length);//length property of array
		for(int i[][]:numArray){
			for(int j[]:i){
			for(int k:j){
				System.out.print(k+" ");
			}
				System.out.println();
			}
				System.out.println();
		}
	}
}
