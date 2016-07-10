package JavaPractice;

public class BubbleSort 
{

	public void Sort()
	{
		
		int[] original ={1,45,89,56,78,65,12};
		int n=original.length;
		for(int j=0;j<n;j++)
		{
			for(int i=1;i<=n-1;i++)
			{
				if(original[i-1]>original[i])
				{
				int temp;
				temp=original[i-1];
				original[i-1]=original[i];
				original[i]=temp;
				}
			}	
		}

		for(int i=0; i < original.length; i++)
		{
			System.out.print(original[i] + " ");
		}
	
	}
	public static void main(String[] args) 
	{
		BubbleSort s= new BubbleSort();
		s.Sort();
		
	}

}
