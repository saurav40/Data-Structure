static void dfsSol(int s,ArrayList<ArrayList<Integer>>ll,boolean[] visited)
    {
        visited[s]=true;
        System.out.print(s+" ");
        for(int i=0;i<ll.get(s).size();i++)
        {
            if(!visited[ll.get(s).get(i)])
            {
                visited[ll.get(s).get(i)]=true;
                dfsSol(ll.get(s).get(i),ll,visited);
            }
        }
    }
static void dfs(int s,ArrayList<ArrayList<Integer>>ll)
    {
        boolean visited[]=new boolean[4];
        
        dfsSol(s,ll,visited);
    }
