import java.util.*;

class prog16_DFS 
{
	int visited[],top=0;
	static int stack[];
	
	void push(int vertex)
	{		
        stack[top] = vertex;		
		top++;
	}
	int pop()
	{
		int vertex=0;
		try
		{
			top--;
			vertex =stack[top];
        
		}catch(Exception ex){}
		return vertex;	
	}
	void Dfs(int G[][],int n,int s)
	{
		int i=0,j,flg=0,flg2=0,m=0;
		
		visited = new int[n];
		
		visited[m++]=s;
		System.out.print(" " +s);
		
		while(top>-1)
		{
			for(j=0;j<n;j++)
				if(G[s][j]==1)
				{
					for(i=0;i<m;i++)
						if(j==visited[i])
							flg=1;
				
					if(flg==0)
					{
						push(s);
						visited[m++]=j;
						s=j;
						System.out.print(" " +j);
						flg2=1;
						break;
					}
										
					flg=0;
				}
				
			if(flg2==0)
				s = pop();
		
			flg2=0;
		}
	}	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i,j,n,G[][],s;

        G = new int[20][20];

        System.out.println("Enter no. of vertices:");
        n = sc.nextInt();

		stack = new int[n];;

        System.out.println("\nEnter Adjacent Matrix:");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                G[i][j]=sc.nextInt();

        System.out.println("Enter Source vertex for visiting nodes:");
        s = sc.nextInt();

        System.out.println("\n Following Are the reacheable node from vertex "+s+" :");
		
		prog16_DFS Dfs = new prog16_DFS();
		
		Dfs.Dfs(G,n,s);
	}	
}