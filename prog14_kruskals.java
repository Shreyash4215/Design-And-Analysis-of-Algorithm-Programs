import java.util.Scanner;

class prog14_kruskals
{
    prog14_kruskals(int G[][],int ver_arr[],int n,int spanning[][])
    {
        int cost[][],t_n,cnt,k=0,totcost=0,i,j;

        t_n=n-1;
		cnt=n-1;

        cost = new int[n][n];

        for(i=0;i<n;i++)
           for(j=0;j<n;j++)
           {
                if(i==j)
                    cost[i][j]=999;
                else
                    cost[i][j]=0;
           }

        while(t_n>=0)
        {   
            for(i=0;i<n;i++)
                for(j=i+1;j<n;j++)
					if(G[i][j]==ver_arr[k])
					{
						if((cost[i][j-1]==0|| cost[i][j-1]==999  || cost[j-i][j]==0) && cnt>0)
						{
							cost[i][j]=1;
							cost[j][i]=1;
							spanning[i][j]=G[i][j];
							spanning[j][i]=G[i][j];
							k++;
							cnt--;
							totcost=totcost+G[i][j];
							break;
						}										
						k++;
					}												
            t_n--;
        }      

		System.out.print("\n\n Spanning Tree");
        for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<n;j++)
				System.out.print(" "+spanning[i][j]);
		}  
		System.out.print("\n\n Total Minimum Cost "+totcost);
    }
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i,j,total_cost,n,G[][],spanning[][],ver_arr[],k=0,n2,temp;

        G = new int[20][20];
        spanning = new int[20][20];
        ver_arr = new int[50];

        System.out.println("Enter no. of vertices:");
        n = sc.nextInt();

        n2 = n+n;

        System.out.println("\nEnter Adjacent Matrix:");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
            {
                G[i][j]=sc.nextInt();
                if(i!=j)
                    spanning[i][j]=0;
                else   
                    spanning[i][j]=999; 
            }      
        for(i=0;i<n;i++)
           for(j=i+1;j<n;j++)
           {
                ver_arr[k]=G[i][j];
                k++;
           }    

		for(i=0;i<n2;i++)
            for(j=0;j<n2;j++)
                if(ver_arr[i]<ver_arr[j])
                {
                    temp=ver_arr[i];
                    ver_arr[i]=ver_arr[j];
                    ver_arr[j]=temp;
                }	
		
        prog14_kruskals kr = new prog14_kruskals(G,ver_arr,n,spanning);
	
	}
}