import java.util.Scanner;

class prog2_Binarysrch
{
    void bsrch(int low,int high,int x,int arr[])
	{		
		int mid=(low+high)/2;
		
		if(x==arr[mid])
             System.out.print("\n search is Completed posotion of element is"+mid);
		else if(x<arr[mid]  && low<=high)
		{
			high=(mid-1);
			bsrch(low,high,x,arr);	
		}
		else if(x>arr[mid] && low<=high)
		{
			low=(mid+1);
			bsrch(low,high,x,arr);	
		}
		else
        System.out.println("\n Element Not Found");
	
	}

    public static void main(String args[]) {

        int n,i,arr[],value,low,high;

        arr=new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter How Many Number Do You Want?: ");
        n=sc.nextInt();
        
        System.out.print("\n Enter "+n+" Elements: ");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
           
        System.out.print("\n Enter Value To Search: ");
        value=sc.nextInt();
        
        prog2_Binarysrch b = new prog2_Binarysrch();
        
        low=0;
	    high=n-1;
	
	    b.bsrch(low,high,value,arr);      
    }
}