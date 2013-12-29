package Chapter1;

public class Chapter1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a ={'a','a','b','a','c','d','d'};
		for(int i=0;i<a.length;i++)
		{
		//	System.out.print(exist(a)[i]);
			
		}
		char[] c= isE_two(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
			
		}

		removeDuplicates(a);
		for(int i=0;i<a.length;i++)
		{
	//		System.out.print(a[i]);
			
		}
	}
	
	
	
	public static char[] exist(char[] a){
		
		boolean[] hit = new boolean[256];
		int len=a.length;
		int c=0;                             //locate the index to add next qualified element
		int i=0;
		for(i=0;i<len;i++)
		{
			if(!hit[a[i]])            //by initial, hit[i]=false
			{
				a[c]=a[i];
				c++;
				hit[a[i]]=true;         //has already existed, next iteration if 
                                                             //the same, don't give value.
			}
		}
		for(int j=c;j<i;j++)
			a[j]=0;          //all space behind fill null(0)

		
		return a;
		
		
	}
	
	public static char[] isE_two(char[] a){
		int len = a.length;
		int pos=1;             //position which new element to be inserted
		for(int i=1;i<len;++i)
		{
			int j;
			for(j=0;j<pos;++j)  //compare to pos,if same,break,compare next i
			{
				if(a[j]==a[i])					
					break;  // end current loop,next element to examine
			}	                //compare all elements in new array before i
				if(j==pos)      //compare done, if j = pos, shows that 
                                                      //none is the same, insert
				{	
					a[pos]=a[i];
					++pos;
				}
			
			
			
		}
		for(;pos<len;pos++)
		{
			a[pos]=' ';
		}
		
		
		
		return a;
		
		
	}
	
	
	
	public static void removeDuplicates(char[] str) {
		 if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		 int tail = 1;

		 for (int i = 1; i < len; ++i) {
		  int j;
		  for (j = 0; j < tail; ++j) {
		   if (str[i] == str[j]) break;
		  }
		  if (j == tail) {
		   str[tail] = str[i];
		   ++tail;
		  }
		 }
		 str[tail] = 0;
		}

	
	
	
	
	

}
