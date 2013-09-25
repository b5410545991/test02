import java.util.ArrayList;


public class Count {

	/**
	 * @param args
	 */
	 static int line = 0;
	 static int line2 = 0;
	 static int C = 0;
	 static int method = 0;
	 static boolean comment = false; 
	 static int count = 0; 
	 static ArrayList<String> numClass = new ArrayList<String>();
	 static ArrayList<Integer> numLine = new ArrayList<Integer>();
	 static ArrayList<Integer> numMethod = new ArrayList<Integer>();
	 static int start = 1;
	public static void checkLine(String s){
		String a = s.trim();
		
		if(a.contains("/*")){
			comment = true;
		}
		if(a.contains("*/")){
			comment = false;
			count++;
		}
		if(!a.contains("//") && a.length()!=0 && comment==false)
			 line++;
		
		
	}
	public static void checkClass(String s){
		String a = s.trim();
		String [] asplit = a.split(" ");
		for(int i=0;i<asplit.length;i++){
			//System.out.println(asplit[i]);
			if(asplit[i].contains("class")){
				numClass.add(asplit[i+1]);
				C++;
				}
		
		}
	}
	public static void checkMethod(String s){
		String a = s.trim();
		if(a.contains("start method")){
			method++;
			}
	}
	
	
	
}
