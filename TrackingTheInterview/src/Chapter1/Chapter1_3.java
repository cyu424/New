package Chapter1;

public class Chapter1_3 {

	/**
	 *delete all duplicated elements
          solution 1:
          create a boolean array to store element's status(false: no exist; true: exist)
          if true, indicates exists, do nothing
          if false(initial status of boolean array), insert, index++,set true

         solution 2:
         Compare elements with all char before it.
         set a variance pos to indicate the position to be insert
         for (int i=0;i<pos:i++)
            if(a[i]==a[j])
                    break; //once one element is same, end current loop, examine next 
            if(i==pos)        //compare all elements before it and no duplicate
                    a[pos]=a[i];
                    pos++;     //insert, add pos by one
                    
          
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
