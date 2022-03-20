import java.util.*;

class Graph
{
    static void addEdge(ArrayList<ArrayList<Integer>> adjlist,int u,int v)
    {
        adjlist.get(u).add(v);
       // adjlist.get(v).add(u);
    }
    static void printGraph(ArrayList<ArrayList<Integer>> ll)
    {
        for(int i=0;i<ll.size();i++)
        {
            System.out.print("Vertex: "+i);
            for(int j=0;j<ll.get(i).size();j++)
            {
                System.out.print("-->"+ll.get(i).get(j));
            }
            System.out.println();
        }
    }
    static void dfs(ArrayList<ArrayList<Integer>>ll ,int s)
    {
        boolean visited[]=new boolean[4];
        visited[s]=true;
        
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        
        while(!q.isEmpty())
         {
            int k=q.poll();
            System.out.print(k+" ");
            
            for(int i=0;i<ll.get(k).size();i++)
            {
                int v=ll.get(k).get(i);
                if(!visited[v])
                {
                    visited[v]=true;
                    q.add(v);
                }
            }
         }
    }
    public static void main (String[] args) {
        ArrayList<ArrayList<Integer>> adjlist=new ArrayList<ArrayList<Integer>>(4);
        for(int i=0;i<4;i++)
        {
            adjlist.add(new ArrayList<Integer>());
        }
        
        addEdge(adjlist,0,1);
        addEdge(adjlist,0,2);
        addEdge(adjlist,1,2);
        addEdge(adjlist,2,0);
        addEdge(adjlist,2,3);
        addEdge(adjlist,3,3);
        
        dfs(adjlist,2);
        
    }
}
