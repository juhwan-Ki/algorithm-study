class Solution {
    public boolean solution(int x) {

        int number = x;
        int sum = 0;

        while (x > 0){
            sum += x % 10;
            x /= 10;
        }

        if(number % sum != 0) {
            return false;
        }
        return number % sum == 0? true : false;
    }
}