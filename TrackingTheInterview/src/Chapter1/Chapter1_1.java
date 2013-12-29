package Chapter1;

public class Chapter1_1 {


//      
	
	/**
           requirement:
           Implement an algorithm to determine if a string has all 
           unique characters  What if you can not use additional data structures?
	   idea: 
           1. create a boolean array to store every element's status, all false
           (no duplicate) by default. 
           2. iterate the whole string,  use char(ASC code) to index the boolean array
               if false, set true;
               if ture, return true(has duplicated)
               end of iteration, return false(no duplicated)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cString= "aabc";
		System.out.print(isDup(cString));

	}
	
	
	
	public static boolean isDup(String src)
	{
		boolean hit[]=new boolean[256];
		for(int i=0;i<src.length();i++)
		{
			int c=src.charAt(i);
			System.out.print(c);
			if(!hit[c])
				hit[c]=true;
			else
				return true;  //once duplicated, exit function and 
                                                    //return true(has duplicated)!!!!!!!!!!!
			
		}
			
		return false;          //no_dup
		
	}
	
	
	

}
