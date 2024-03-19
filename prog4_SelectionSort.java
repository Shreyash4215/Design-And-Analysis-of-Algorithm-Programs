import java.util.Scanner;

class prog4_SelectionSort
{
	void sort(int arr[],int n)
	{
		for (int i = 0; i < n-1; i++)
		{
			int min_idx = i;
			
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

		   int temp = arr[min_idx];
		   arr[min_idx] = arr[i];
		   arr[i] = temp;
		}
    System.out.println("Sorted Array:");

    for (int i=0; i<n; ++i)
        System.out.print(arr[i]+" ");
	
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int arr[],i,n;

		System.out.println("Enter How Many Elements Do You want?: ");
		n = sc.nextInt();

		arr = new int[n];

		System.out.println("Enter "+n+" Elements: ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		 prog4_SelectionSort ob = new prog4_SelectionSort();
		
		 ob.sort(arr,n);	
	}
}
