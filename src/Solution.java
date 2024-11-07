//Complete this code or write your own from scratch
import java.util.*;

class Solution{
	public static void main(String []argh) {
        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		
		for(int i=0;i<n;i++) {
			
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phoneBook.put(name, phone);
		}//for
		
		while(in.hasNext()) {
			
			String s=in.nextLine();
            if(phoneBook.containsKey(s)){
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }//if
            
		}//while
		
		in.close();
	}//main 
	
}// class Solution