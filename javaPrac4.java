// input output 



// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class javaPrac4 {
//     public static void main(String args[])throws IOException{
//         InputStreamReader i=new InputStreamReader(System.in);
//         BufferedReader br=new BufferedReader(i);
//         int x=br.read();
//         System.out.println(x);
//         System.out.print(br.readLine());
//     }
// }


// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.io.IOException;

// public class javaPrac4 {
//     public static void main(String args[])throws IOException{
//         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//         System.out.println("Enter any char");
//         char x=(char)br.read();
//         System.out.println(x);
//         // int x=br.read();
//         System.out.println("Enter any String");
//         System.out.print(br.readLine().trim());
//     }
// }


// StringTokenizer class string ke data ko automatic space se split karne ka kam karti hai 

// import java.util.*;
// // import java.util.StringTokenizer;
// class javaPrac4{
//     public static void main(String arg[]){
//         String s1="10 30 450 40";
//         StringTokenizer st=new StringTokenizer(s1);
//         System.out.println(st.nextToken());
//         System.out.println(st.nextToken());
//         System.out.println(st.nextToken());
//     }
// }

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * javaPrac4
 */
public class javaPrac4 {

    public static void main(String[] args) throws IOException{
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(i);
        String s1=br.readLine();
        StringTokenizer st=new StringTokenizer(s1,",");
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());



        System.out.println(st.hasMoreTokens());
        System.out.println(st.countTokens());
    }
}