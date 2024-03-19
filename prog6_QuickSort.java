import java.util.Scanner;

class prog6_QuickSort
{
    int partition(int arr[],int low,int high)
    {
        int pivot=0,i=0,j=0,temp=0;

        pivot = arr[low];
        i=low+1;
		j=high;
		
		while(i<j)
		{
			while(arr[i]<pivot )
			{
				i++;
			}
			while(arr[j]>pivot   )
			{
				j--;
			}
			
			if(i<j)
			{
				temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
			}
		}
		
		if(i>j)
		{
			temp=arr[j];
			arr[j]=pivot;
			arr[low]=temp;
		}
		return j;
    }

    void sort(int arr[],int low, int high)
    {
	    if(low<high)
        {
            int j = partition(arr,low,high);

            sort(arr,low,j-1);
	        sort(arr,j+1,high);
        }
    }

    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        prog6_QuickSort ob = new prog6_QuickSort();

        int arr[],i,n;

        System.out.println("Enter How Many Elements Do You want?: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter "+n+" Elements: ");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
		
		// arr[n]=9999;

        ob.sort(arr,0,n-1);

        System.out.println("\nAfter sorting array elements are - ");  
        for (i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");
    }
}