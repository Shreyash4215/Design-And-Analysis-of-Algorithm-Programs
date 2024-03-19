import java.util.Scanner;

class prog1_linearsrch
{
    void srch(int arr[],int n,int value)
	{
        int i,flg=0,pos=0;

        for(i=0;i<n;i++)
            if(arr[i]==value)
            {
                flg=1;
                pos=i;
            } 
            
        if(flg==1)
            System.out.println("\n "+value+" is Fount At Position "+pos);
        else
            System.out.println(""+value+" Is Not Found");        
    }

    public static void main(String args[]) {

        int n,i,arr[],value;

        arr=new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.print("\n Enter How Many Number Do You Want?: ");
        n=sc.nextInt();
        
        System.out.print("\n Enter "+n+" Elements: ");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
           
        System.out.print("\n Enter Value To Search: ");
        value=sc.nextInt();
        
        prog1_linearsrch s = new prog1_linearsrch();
        
        s.srch(arr, n, value);       
    }
}