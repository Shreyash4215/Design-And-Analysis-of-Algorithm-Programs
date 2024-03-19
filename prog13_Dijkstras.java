import java.util.Scanner;

class prog13_Dijkstras
{
   static int ver[];
   int D[],S[],m=0;

    prog13_Dijkstras(int G[][],int n)
    {
        int i,j,w,t_n=n-1,v,l=0;

        D = new int[n];
        S = new int[n];

        for(j=0;j<n;j++)
            D[j]=G[0][j];

        n=delete(n,0);

        w=min(D,S);

        n=delete( n, w);    

		System.out.print("Source \tDestination \t Cost ");
		System.out.print("\n 1 \t  "+(w+1)+"\t\t  "+D[w]);

        while(t_n>1)
        {			
			while(l<n)
            {
                v=ver[l];

                D[v]=Math.min(D[v],D[w]+G[w][v]);
					
                l++;
                v++;
			}
			
            w=min(D,S);
			System.out.print("\n 1 \t  "+(w+1)+"\t\t  "+D[w]);
            n=delete(n, w);	
			
            l=0;  
            t_n--;
        }   
    }

    int delete(int n,int w)
    {
        int i,j;
        for(i=0;i<n;i++)
        {
            if(ver[i]==w)
            {
                S[m]=ver[i];
                m++;

                for(j=i;j<n-1;j++)
                    ver[j]=ver[j+1];

                break;    
            }
        }
        n--;
        return n;    
    }

    int min(int d[],int s[])
    {
        int min=9999,i,j=0,k=0,flg=0;

        for(i=0;i<d.length;i++)
		{
			for(j=0;j<s.length;j++)
				if(s[j]==i)
					flg=1;
				
				if(min>d[i] && flg==0)
				{
					min=d[i];
					k=i;
				}
			flg=0;	
		}
        return k;                    
    }
	
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int i,j,n,G[][];

        G = new int[20][20];
        ver = new int[20];

        System.out.println("Enter no. of vertices:");
        n = sc.nextInt();

        System.out.println("\nEnter Adjacent Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                G[i][j]=sc.nextInt();
            
            ver[i]=i;    
        }         
        prog13_Dijkstras dv = new prog13_Dijkstras(G,n);
	}
}