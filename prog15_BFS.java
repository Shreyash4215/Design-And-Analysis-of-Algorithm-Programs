import java.util.*;

class prog15_BFS 
{
	int front = 0,rear=0,visited[];
	static int queue[];
	
	void push(int vertex)
	{		
		queue[rear] = vertex;
		rear++;		
	}
	int pop()
	{
		int vertex = queue[front];
					
		for(int i=front;i<rear;i++)
			queue[i]=queue[i+1];
		
		rear--;
		
		System.out.print(" " + (vertex));
		return queue[front];	
	}
	void Bfs(int G[][],int n,int s)
	{
		int i=0,j,k,flg=0,m=0;
		
		visited = new int[n];
		
		push(s);
		visited[m++]=s;
		
		while(i<n)
		{
			for(j=0;j<n;j++)
				if(G[s][j]==1)
				{
					for(k=0;k<m;k++)
						if(j==visited[k])
								flg=1;
					
					if(flg==0)
					{
						push(j);
						visited[m++]=j;
					}						
					flg=0;
				}				
			s = pop();
			i++;
		}
	}	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i,j,n,G[][],s;

        G = new int[20][20];

        System.out.println("Enter no. of vertices:");
        n = sc.nextInt();

		queue = new int[n];;

        System.out.println("\nEnter Adjacent Matrix:");
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                G[i][j]=sc.nextInt();

        System.out.println("Enter Source vertex for visiting nodes:");
        s = sc.nextInt();

        System.out.println("\n Following Are the reacheable node from vertex "+s+" :");
		
		prog15_BFS bfs = new prog15_BFS();
		
		bfs.Bfs(G,n,s);
	}	
}