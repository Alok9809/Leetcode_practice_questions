class Solution {
    public int countTriples(int n) {
        int res = 0;
        for(int i = 3;i<n;i++){
            for(int j = i+1;j<n;j++){
                int sum = i*i + j*j;
                int k = (int)Math.sqrt(sum);
                if(k <= n){
                    if(k*k == sum)res+=2;
                }else break;
            }
        }
        return res;
    }
}