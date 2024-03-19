import java.util.Scanner;

class prog3_bublesrt
{
    void bsrt(int arr[],int n)
	{
        int i,temp,j;

        for(i=0;i<n-1;i++)
            for(j=0;j<n-i-1;j++)
                if(arr[j]>arr[j+1])
                   {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                   } 

        System.out.print("\n Sorted Array is: ");           
        for(i=0;i<n;i++)
            System.out.print(" "+arr[i]);           
    }

    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        int i,arr[],n;

        arr = new int[50];

        System.out.print("\n Enter How Many Element Do You Want?: ");
        n = sc.nextInt();

        System.out.print("Enter "+n+" Numebers :");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();

		prog3_bublesrt s = new prog3_bublesrt();

        s.bsrt(arr,n);
    }   
}