import java.util.Scanner;

class prog18_FLOYDS
{
    prog18_FLOYDS(int G[][],int n)
    {
		int k=0,i,j;
		
		while(k<=n-1)
		{
			for(i=0;i<n;i++)
				for(j=0;j<n;j++)
					G[i][j]=Math.min(G[i][j],G[i][k]+G[k][j]);
					
			k++;
		}
	
		System.out.println("\nSHORTEST PATH MATRIX:-");
		for(i=0;i<n;i++)
		{
			System.out.print("\n");
			for(j=0;j<n;j++)
				System.out.print(" "+G[i][j]);
		}
	}
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i,j,n,G[][];

        G = new int[20][20];
        
        System.out.println("Enter no. of vertices:");
        n = sc.nextInt();

        System.out.println("\nEnter Adjacent Matrix:");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                G[i][j]=sc.nextInt();    
        
        prog18_FLOYDS dv = new prog18_FLOYDS(G,n);
	}
}