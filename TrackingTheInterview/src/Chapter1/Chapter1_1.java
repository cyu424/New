package Chapter1;

public class Chapter1_1 {

	/**
	 * @param args
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
				return true;  //dup 只要有一个，直接退出循环return!!!!!!!!!!!
			
		}
			
		return false;          //no_dup
		
	}
	
	
	

}
