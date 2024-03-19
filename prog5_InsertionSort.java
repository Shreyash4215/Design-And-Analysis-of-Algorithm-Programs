import java.util.Scanner;

class prog5_InsertionSort
{
	void sort(int arr[],int n)
	{
		for (int i = 1; i < n; i++)
		{
			int key = arr[i];
			int j = i - 1;
	   
			while (j >= 0 && arr[j] > key) 
			{
				arr[j + 1] = arr[j];
				j--;
			}
	   
			arr[j + 1] = key;
		}
		
		System.out.println("\n Sorted Array: ");
  
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String args[])
	{
		int arr[],n,i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter How Many Elements Do You want?: ");
		n = sc.nextInt();

		arr = new int[n];

		System.out.println("Enter "+n+" Elements: ");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();

		prog5_InsertionSort ob = new prog5_InsertionSort();
		ob.sort(arr,n);
	}
} 