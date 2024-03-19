import java.util.Scanner;

class prog17_WarshalsTrans
{
	prog17_WarshalsTrans(int G[][],int n)
    {
		int j,k=0,a=-1,i;
		
		while(k<n)
		{
			for(i=0;i<n;i++)
			{
				if(G[i][k]==1)
					a=i;
				
				for(j=0;j<n;j++)
					if(G[k][j]==1 && a>-1)
					{
						G[a][j]=1;
					}
				a=-1;
			}
			k++;
		}
		
		System.out.print("\n Transitive Closure:");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<n;j++)
				System.out.print(" "+G[i][j]);
		}
	}
	public static void main(String[] args)
    {
        int G[][],n,i,j;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No. of vertices: ");
        n = sc.nextInt();

        G = new int[n][n];

        System.out.println("\n Enter Adjacency Matrix:");
        for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				G[i][j]=sc.nextInt();

        prog17_WarshalsTrans mn = new prog17_WarshalsTrans(G,n);
    }
}