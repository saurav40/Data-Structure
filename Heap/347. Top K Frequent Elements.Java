class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int n:nums)
        {
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq =new PriorityQueue<>((x, y) ->(y.getValue()-x.getValue()));
        
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()) 
         {
               pq.add(entry);                                              
         }
         List<Integer> result=new ArrayList();
                                                       
         while(result.size()<k)
        {
           Map.Entry<Integer,Integer> rm=pq.poll();
          result.add(rm.getKey());
        }
        //int[] res= result.stream().mapToInt(i->i).toArray();
     return result.stream().mapToInt(i->i).toArray();
    }
}
