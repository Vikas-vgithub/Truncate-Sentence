class Solution {
    public String truncateSentence(String s, int k) {
        int a = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                a++;
                if(a==k){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}
