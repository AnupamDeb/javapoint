import java.util.Scanner;

class BubbleSort
{
	public static void main (String[] args)
	{
		// your code goes here
 
		Scanner input=new Scanner(System.in);
		int i,j,n,c,temp;
		
		n=input.nextInt();
		System.out.println("Enter " + n + " integers");
 
		int array[]=new int[n];
 
		for (c = 0; c < n; c++) 
      		array[c] = input.nextInt();
 
		for(i=0;i<n-1;i++) //pass
		{
			for(j=0;j<n-i-1;j++)//inside pass
 
			{
				if(array[j]<array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
 
		System.out.println("Sorted list of numbers");
 
    	for (c = 0; c < n; c++) 
      		System.out.println(array[c]);
	}
}