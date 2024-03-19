import java.util.Scanner;

class prog12_DegreOfvertices
{
    prog12_DegreOfvertices(int G[][],int n)
    {
        int i,j,degree=0;

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                if(G[i][j]!=99)
                    degree++;
            
            System.out.println("\n Degree Of Vertex "+(i+1)+" is "+degree);        
            degree=0;
        }
    }
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i,j,total_cost,n,G[][],spanning[][],ver_arr[],k=0,n2,temp;

        G = new int[20][20];

        System.out.println("Enter no. of vertices:");
        n = sc.nextInt();

        System.out.println("\nEnter Adjacent Matrix:");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                G[i][j]=sc.nextInt();
                  
        prog12_DegreOfvertices dv = new prog12_DegreOfvertices(G,n);
	}
}