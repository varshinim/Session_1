
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] A) {
        String prefix = A[0];
        for(int i=1;i<A.length;i++){
            while(A[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
