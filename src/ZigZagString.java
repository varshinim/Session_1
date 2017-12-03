
public class ZigZagString {
	public String convert(String A, int B){
		String result = "";
        if(A.length()==0){
            return result;
        }
        if(B == 1){
            return A;
        }
        String[] row = new String[B];
        for(int i=0;i<row.length;i++){
            row[i] = "";
        }
        int line = 0;
        boolean down = false;
        for(int i=0;i<A.length();i++){
            row[line] = row[line]+A.charAt(i);
            if(line==B-1){
                down = false;
            }
            else if(line==0){
                down = true;
            }
            if(down){
                line++;
            }
            else{
                line--;
            }
        }
        for(int i=0;i<row.length;i++){
            result = result+row[i];
        }
        return result;
	}
}
