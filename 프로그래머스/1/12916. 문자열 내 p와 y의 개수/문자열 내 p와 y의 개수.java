class Solution {
     boolean solution(String s) {
        int pCnt = 0;
        int yCnt = 0;
         
        s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'Y' || s.charAt(i) == 'y'){
                yCnt++;
            } else if (s.charAt(i) == 'P' || s.charAt(i) == 'p') {
                pCnt++;
            }
        }
        
        return pCnt == yCnt || (pCnt == 0 && yCnt == 0);
    }
}