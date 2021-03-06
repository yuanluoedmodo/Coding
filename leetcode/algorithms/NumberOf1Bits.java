package algorithms;

public class NumberOf1Bits {
	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++){
            if ( (n & mask) != 0){
            	//System.out.println(n&mask);
                count++;
            }
            mask <<= 1;
        }
        return count;
    }
    
    public static void main(String[] args) {
    	new NumberOf1Bits().hammingWeight(2);

	}
}

