class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1)!= 0) {//check our lsb
            count++;
        }
        n = n>>1;
    }
    return count;
}
}