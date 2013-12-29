package Chapter1;

public class Chapter1_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="apple";
		String s2="ppale";
		String bString=s1+s1;
		System.out.println(bString);
		System.out.println(isRotation(s1,s2));
		
	}
	
	public static boolean isRotation(String s1, String s2) {
	    int len = s1.length();
	    /* check that s1 and s2 are equal length and not empty */
	    if (len == s2.length() && len > 0) {
	     /* concatenate s1 and s1 within new buffer */
	     String s1s1 = s2 + s2;
	     return isSubstring(s1, s1s1);
	 }
	 return false;
	 }
	
	public static boolean isSubstring(String a,String b){
		char cha[]=a.toCharArray();
		char chb[]=b.toCharArray();
		for(int bl=0;bl<chb.length-cha.length;bl++)
		{	
			int tem=bl;        //bl should be controlled by the outer loop, so tem=bl to convey it to inner loop
			for(int j=0;j<cha.length;j++)   //because inner loop need to campare all the elements in cha!
			{
				if(chb[tem]==cha[j])
				{
					tem++;          //if first element is the same, comtinue checking
					if(tem==cha.length-1)     //checking all the elenments in cha[],done,return true
						return true;
				}
				
				else
					break;        //if any element is not the same, end current,check next
			}
			
		}
		
		return false;       
		
	}
	
	
}
