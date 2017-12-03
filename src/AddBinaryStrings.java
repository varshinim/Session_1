
public class AddBinaryStrings {
	public String addBinary(String A, String B){
		int lengthA = A.length();
        int lengthB = B.length();
        int i = 0;
        int diff = Math.abs(lengthA-lengthB);
        StringBuilder sb = new StringBuilder();
        while(diff>0){
            sb.append('0');
            diff--;
        }
        if(lengthA>lengthB){
            sb.append(B);
            B = sb.toString();
        }
        else{
            sb.append(A);
            A = sb.toString();
        }
        sb = new StringBuilder();
        char carry = '0';
        i = A.length()-1;
        while(i>=0){
            if(A.charAt(i)==B.charAt(i)){
                sb.append(carry);
                if(A.charAt(i)=='1'){
                    carry = '1';
                }
                else{
                    carry = '0';
                }
            }
            else{
                if(carry=='1'){
                    sb.append('0');
                    carry = '1';
                }
                else{
                    sb.append('1');
                    carry = '0';
                }
            }
            i--;
        }
        if(carry=='1'){
            sb.append(carry);
        }
        sb.reverse();
        return sb.toString();
	}
}