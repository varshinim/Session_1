
public class LengthofLastWord {
	public int lengthOfLastWord(final String A) {
        String s = A.toLowerCase().trim();
        if(s==null || s.length()==0){
            return 0;
        }
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}
