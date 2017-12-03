
public class MaxUnsortedSubarray {
	public int[] subUnsort(int[] A){
		int start = 0;
        int end = A.length-1;
        int k = 0;
        int[] result;
        for(start=0;start<A.length-1;start++){
            if(A[start]>A[start+1]){
                break;
            }
        }
        if(start==A.length-1){
            result = new int[1];
            result[0] = -1;
            return result;
        }
        result = new int[2];
        for(end=A.length-1;end>0;end--){
            if(A[end]<A[end-1]){
                break;
            }
        }
        int min = A[start];
        int max = A[start];
        for(k=start+1;k<=end;k++){
            if(A[k]>max){
                max = A[k];
            }
            if(A[k]<min){
                min = A[k];
            }
        }
        for(k=0;k<start;k++){
            if(A[k]>min){
               start = k;
               break;
            }
        }
        for(k=A.length-1;k>=end+1;k--){
            if(A[k]<max){
                end = k;
            }
        }
        result[0] = start;
        result[1] = end;
        return result;
	}
}
