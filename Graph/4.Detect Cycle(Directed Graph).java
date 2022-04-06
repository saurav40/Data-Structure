public static boolean isCyclicUtill(int v,boolean[] visited,ArrayList<ArrayList<Integer>>adjlist)
    {
        if(visited[v])
           return true;
        visited[v]=true;
        
        for(int i=0;i<adjlist.get(v).size();i++)
        {
            if(isCyclicUtill(adjlist.get(v).get(i),visited,adjlist))
              return true;
        }
        visited[v]=false;
        return false;
    }
 public static boolean isCyclic(int V,ArrayList<ArrayList<Integer>> adjlist)
    {
         boolean visited[]=new boolean[V];
         boolean flag=false;
         
         for(int i=0;i<V;i++)
         {
             visited[i]=true;
             for(int j=0;j<adjlist.get(i).size();j++)
             {
                 flag=isCyclicUtill(adjlist.get(i).get(j),visited,adjlist);
                 if(flag)
                   return true;
             }
             visited[i]=false;
         }
         
        return false;
    }
