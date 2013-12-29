package Chapter1;

public class Chapter1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t="abba";
		int len=t.length();
		System.out.print(arag(t,0,len-1));
		
	}

	
	static boolean arag(String s,int st,int end){
		char[] a = s.toCharArray();
		if(s.length()%2==0)
		{
		if(a[st]!=a[end])
		
			return false;
		
		if(  (a[st]==a[end]&&st==end-1) )
			return true;
		else
		{	st++;
		  	end--;
			return arag(s, st, end);
		
		}
		
	}
		else
		{
			if(a[st]!=a[end])
			
				return false;
			
			if( (a[st]==a[end]&&st==end-2))
				return true;
			else
			{	st++;
			  	end--;
				return arag(s, st, end);
			
			}
			
		}
		
		
		
		
		
	}
}
