package bubbleSort_Revise;

public class BubbleSort_Revise {
	
	public static void sort(int arr[])
	{
		int length=arr.length;
		int i=0,j=0;
		for(i=0;i<length;i++)
		{
			System.out.println("The"+i+"th loop");
			for(j=0;j<length-i-1;j++)
			{
			  if(arr[j] >arr[j+1])
			  {
				  int temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;			  
				  
			  }	
			  
			}
			for(j=0;j<length;j++)
			{
				System.out.print(arr[j]+ " ");
			} 
		  System.out.println();
			
			
		}	
		
	}

}
