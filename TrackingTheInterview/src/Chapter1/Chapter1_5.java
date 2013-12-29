package Chapter1;

public class Chapter1_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "a b  ";
		System.out.println(countSpace(test));
		char[] a= replace(test);
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]);
		
	}
	
	
	
	public static  int countSpace(String a) {
		
		int c=0;
		char[] ch= a.toCharArray();
		for(int i=0;i<a.length();i++)
		{
			if(ch[i]==' ')
				c++;			
		}
		
		return c;
		
	}
	
	
	public static char[] replace(String s){
		
		int countSpace = countSpace(s);
		char[] dst = new char[s.length()+2*countSpace];
		char[] src= s.toCharArray();
		int srcLength=src.length;
		int dstLen=s.length()+2*countSpace;
		int index=dstLen-1;
		int i=srcLength-1;
		for(;i>=0;i--){
			if(src[i]==' ')
			{	
				
				dst[index]='%';
				dst[index-1]='0';
				dst[index-2]='2';
				index=index-3;
			}
			else
			{
				dst[index]=src[i];
				index=index-1;
			}	
			
			
		}
		return  dst;
		
	}
	

}
