import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(new FileReader("text.txt"));
		for(;sc.hasNext();){
		String s = sc.nextLine();
		Count.checkClass(s);
		Count.checkLine(s);		
		Count.checkMethod(s);
		//
		System.out.println(s);
		
		}
		for(int i=0;i<Count.numClass.size();i++){
		System.out.print("Part Name ");
		System.out.println(Count.numClass.get(i));
		System.out.print("Number of Items ");
		System.out.println(Count.method);
		System.out.print("Part Size ");
		System.out.println(Count.line-Count.count);
		
		}
		System.out.print("Total Size ");
		System.out.println(Count.line-Count.count);
	}

}
