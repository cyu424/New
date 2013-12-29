package Chapter1;



public class first_1 {

	/**
	 * @param args
	 */
	public static boolean isUniqueChars2(String str) {
		
		boolean[] ca= new boolean[256]; 
		for(int i=0;i<str.length();i++)
		{
			int a= str.charAt(i);
			if(ca[a])
				return false;
			ca[a]=true;
		}
		
		
		return true;
		}

	public static int t(){
		String a="cqac";
		for(int i=0;i<3;i++)
		{
			if(a.charAt(i)==97)         //'a'=97, so if match, function exit
                                                                // and return i =2
				return i;
			
		}
		return 0;
	}
	
	
		  
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ca = isUniqueChars2("aab");
		System.out.println(ca);
		int a=t();
		System.out.println(a);
		
		for(int i = 0; i < 100; i++) {
		      if(i == 82) 
		    	  break; // Out of for loop          exit the loop!!!!!!!!!!
		      if(i % 9 != 0)
		    	  continue; // Next iteration, so only those i%9==0 will be printed
		      System.out.print(i + " ");
		    }
		    //System.out.println();
		

	}

}

