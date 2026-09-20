1class Solution {
2    public int reverseDegree(String s) {
3        int ans = 0;
4        for(int i=0; i<s.length(); i++){
5            final int reversePos = 26-(s.charAt(i)-'a');
6            ans += reversePos*(i+1);
7        }
8        return ans;
9    }
10}