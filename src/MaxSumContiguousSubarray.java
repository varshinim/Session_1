
public class MaxSumContiguousSubarray {
	public int maxSubArray(final int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            sum = sum+A[i];
            if(sum>maxSum){
                maxSum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}
