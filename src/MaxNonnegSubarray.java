import java.util.Arrays;

public class MaxNonnegSubarray {

	    public int[] maxset(int[] A) {
	        long sum = 0;
	        int length = 0;
	        long maxSum = Integer.MIN_VALUE;
	        int minIndex = 0;
	        int maxIndex = 0;
	        int startIndex = 0;
	        int endIndex = 0;
	        int index = 0;
	        for(int i=0;i<A.length;i++){
	            if(A[i]>=0){
	                sum = sum+A[i];
	            }
	            else{
	               if (maxSum < sum) {
	                    minIndex = startIndex;
	                    maxIndex = i - 1;
	                    maxSum = sum;
	               } else if (maxSum == sum) {
	                   if ((maxIndex - minIndex) < (i - startIndex - 1)) {
	                       minIndex = startIndex;
	                       maxIndex = i - 1;
	                   } else if ((maxIndex - minIndex) == (i - startIndex - 1)){
	                       if (minIndex > startIndex) {
	                           minIndex = startIndex;
	                           maxIndex = i - 1;
	                       }
	                   }
	               }
	               sum = 0;
	               startIndex = i + 1;
	               endIndex = i + 1;
	            }
	            
	            if (maxSum < sum) {
                    minIndex = startIndex;
                    maxIndex = i;
                    maxSum = sum;
               } else if (maxSum == sum) {
                   if ((maxIndex - minIndex) < (i - startIndex - 1)) {
                       minIndex = startIndex;
                       maxIndex = i - 1;
                   } else if ((maxIndex - minIndex) == (i - startIndex - 1)){
                       if (minIndex > startIndex) {
                           minIndex = startIndex;
                           maxIndex = i - 1;
                       }
                   }
               }
	        }
	        length = (maxIndex-minIndex)+1;
	        int[] arr = new int[length];
	        while(minIndex<=maxIndex){
	            arr[index] = A[minIndex];
	            index++; 
	            minIndex++;
	        }
	                
	        System.out.println(minIndex);
	        System.out.println(maxIndex);
	        return arr;
	    }
	    
	public static void main(String[] args) {
		MaxNonnegSubarray ls = new MaxNonnegSubarray();
		int[] A = {756898537, -1973594324, -2038664370, -184803526, 1424268980};
		int[] res = ls.maxset(A);
		System.out.println(Arrays.toString(res));
	}
}
