class Solution {
    int total;
    int tmp[];
    public int reversePairs(int[] nums) {
        total=0;
        tmp=new int[nums.length];
        merge_sort(nums,0,nums.length-1);
        return total;
    }
    public void merge_sort(int [] nums,int left,int right)
    {
        if(right>left)
        {
            int mid=(left+right)/2;
            
            merge_sort(nums,left,mid);
            merge_sort(nums,mid+1,right);
            
            merge(nums,left,mid,right,tmp);
        }
    }
    public void merge(int[]nums,int left,int mid,int right,int []tmp)
    {
        int i=left;
        int j=mid+1;
        
        while(i<=mid)
        {
            while(j<=right && nums[i]> (2 *(long)nums[j]) )
            {
                j++;
            }
            total+=j-(mid+1);
            i++;
        }
        
        
        i=left;
        j=mid+1;
        int k=left;
        
        while(i<=mid && j<=right)
        {
            if(nums[i]<=nums[j])
            {
                tmp[k++]=nums[i++];
            }
            else
            {
                tmp[k++]=nums[j++];
            }
                
        }
        
        while(i<=mid)
        {
            tmp[k++]=nums[i++];
        }
        while(j<=right)
        {
            tmp[k++]=nums[j++];
        }
        for(i = left ; i <= right ; i++)
               nums[i] = tmp[i];
    }
}
