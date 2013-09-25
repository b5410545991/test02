/* 
TASK: prime 
LANG: JAVA 
*/  
import java.util.ArrayList;  
import java.util.Scanner;  
  
  
public class checkprime {  
  
    /** 
     * @param args 
     */ 
	static boolean isPrime(int n) {
	    for(int i=2;i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
   
        if(isPrime(n) == true)  
            System.out.println("Yes");  
        else  
            System.out.println("No");  
    }  
  
}  