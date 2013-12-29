package Chapter1;

public class Chapter1_7 {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int src[][] = new int[5][6];
		int k=1;
		for(int i=0;i<src.length;i++)
		{	
			
			for(int j =0;j<src[i].length;j++)
			{
				src[i][j] = k;
			}
			k=k+1;
		}
		
		src[1][2]=0;
		src[2][3]=0;
		src[4][1]=0;
		
		for(int i=0;i<src.length;i++)
		{	
			
			for(int j=0;j<src[i].length;j++)
			{
				System.out.print(src[i][j]);
			}
			System.out.print("\n");
		}
		
		
		setZero(src);
		for(int i=0;i<src.length;i++)
		{	
			
			for(int j=0;j<src[i].length;j++)
			{
				System.out.print(src[i][j]);
			}
			System.out.print("\n");
		}
		
	}
	
	
	public static void setZero(int src[][]){
		
		int row[]=new int[src.length];
		int col[]=new int[src[0].length];     //store rows and col which has 0
		
		for(int i=0;i<src.length;i++)
		{
			for(int j=0;j<src[i].length;j++)
			{
				if(src[i][j]==0)
				{
					row[i]=1;
					col[j]=1;
				}
				
			}
			
		}
		
		for(int i=0;i<src.length;i++)
		{	
			if(row[i]==1)
			{
				for(int a=0;a<src[i].length;a++)
					src[i][a]=0;
			}
			
		}
		
		for(int j=0;j<src[0].length;j++)
		{
			if(col[j]==1)
			{
				for(int a=0;a<src.length;a++)
					src[a][j]=0;
			}
			
		}
		
		
		
	}
	
	
	

}
