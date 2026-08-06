1class Solution {
2    public int smallestNumber(int n, int t) {
3        while(!check(n,t)){
4            n++;
5        }
6        return n;
7    }
8    private boolean check(int num, int t){
9        int prod = 1;
10        while(num>0){
11            int digit = num%10;
12            prod *= digit;
13            num /= 10;
14            if(prod == 0){
15                break;
16            }
17        }
18        return prod%t==0;
19    }
20}