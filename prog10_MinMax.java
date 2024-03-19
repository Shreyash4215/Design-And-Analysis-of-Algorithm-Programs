import java.util.Scanner;

class Pair
{
    public int max, min;
 
    public Pair(int max, int min)
    {
        this.max = max;
        this.min = min;
    }
}
 
class prog10_MinMax
{
    public void findMinAndMax(int[] arr, int left, int right, Pair p)
    { 
        if (left == right)                  // if the array contains only one element
        {
                p.max = arr[left];
 
                p.min = arr[right];
 
            return;
        }
 
        if (right - left == 1)              // if the array contains only two elements
        {
            if (arr[left] < arr[right])         
            {
                if (p.min > arr[left]) 
				{      
                    p.min = arr[left];
                }
 
                if (p.max < arr[right]) 
				{     
                    p.max = arr[right];
                }
            }
            else 
			{
                if (p.min > arr[right]) 
				{     
                    p.min = arr[right];
                }
 
                if (p.max < arr[left]) 
				{      
                    p.max = arr[left];
                }
            }
 
            return;
        }
        
        int mid = (left + right) / 2;       // find the middle element
        
        findMinAndMax(arr, left, mid, p);

        findMinAndMax(arr, mid + 1, right, p);
    }
 
    public static void main(String[] args)
    {
        int arr[],n,i;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter How Many Elements Do You want?: ");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("\n Enter "+n+" Elements:");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();

        Pair p = new Pair(0, 50000);

        prog10_MinMax mn = new prog10_MinMax();
      
        mn.findMinAndMax(arr, 0, n-1, p);
 
        System.out.println("The minimum array element is " + p.min);
        System.out.println("The maximum array element is " + p.max);
    }
}