package asadolahi.hosein.arrays.findclosestnumbertozero;

class FindClosestNumberToZero {
    public int findClosestNumber(int[] nums) {
        int d = Integer.MAX_VALUE;
        int out = 0;
        for(int num: nums) {
            if (Math.abs(num) <= d) {
                if (Math.abs(num) == d) {
                    out = Math.max(out,num);
                } else {
                    out = num;
                }
                d = Math.abs(num);
            }
        }
        return out;
    }
}