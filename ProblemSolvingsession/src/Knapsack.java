
public class Knapsack {
 

	
	
	
	public static void main(String[] args) {
		
		int wt[] = {20,10,9,4,2,1};
		int val[] = {4000,3500,1800,400,1000,200};
	    int Maxweight= 20;
	    int weight= 0;
	    int value = 0;
	    int maxvalue=0;
		int n=val.length;
		int size = 6;
		int [] k = new int[n];
		int [] select = new int[n];
		int l = (int)Math.pow(2, size);
		
		for(int i = 0;i<l;i++) {
			for(int j= n-1;j>=0;j--) {
				if(select[j]==1) {
					select[j]=0;
				}else {
					select[j]=1;
					break;
				}
					
			}
			/*for(int ele:choose) {
				System.out.print(ele);
			}
			System.out.println();*/
			
			for(int st=0;st<n; st++) {
				if(select[st]==1) {
					value += val[st];
					weight += wt[st];
				
				}
			}
			
			if((value>=maxvalue)&&(weight<=Maxweight)){
				maxvalue = value;
				for(int st1=0;st1<n;st1++)
				{
					k[st1]=select[st1];
				}
				
			}
			value=0;
			weight=0;
		}
		
		System.out.println(" maximum value "+maxvalue);
		
		for(int index=0;index<n;index++)
		{
			if (k[index]==1)
			{
				System.out.print(val[index]+" ");
			}
			else {
				System.out.print("0 ");
			}
		}
        
	}

}
