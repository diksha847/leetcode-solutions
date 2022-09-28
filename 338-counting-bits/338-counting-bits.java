class Solution {
    public int[] countBits(int n) {
        int [] result=new int[n+1];
        int rmsb=0,count=0,temp=0;
        for(int n1=1;n1<=n;n1++)
        {
            count=0;
            temp=n1;
    while(temp>0)
    {
        rmsb=temp & -temp;
        temp=temp-rmsb;
        count++;
    }
        result[n1]=count;
        
        
    }
        return result;
}
}