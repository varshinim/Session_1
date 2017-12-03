import java.util.Arrays;

public class WaveArray {
	public int[] wave(int[] A){
		int temp = 0;
        if(A.length == 1){
            return A;
        }
        else if(A.length == 2){
            if(A[0]<A[1]){
                temp = A[0];
                A[0] = A[1];
                A[1] = temp;
            }
            else if(A[0]>A[1]){
                temp = A[0];
                A[0] = A[1];
                A[1] = temp;
            }
        }
        Arrays.sort(A);
        for(int i=1;i<A.length;i+=2){
            if(A[i]>A[i-1]){
                temp = A[i];
                A[i] = A[i-1];
                A[i-1] = temp;
            }
            if(i!=A.length-1 && A[i]>A[i+1]){
                temp = A[i];
                A[i] = A[i+1];
                A[i+1] = temp;
            }
        }
        return A;
	}
}