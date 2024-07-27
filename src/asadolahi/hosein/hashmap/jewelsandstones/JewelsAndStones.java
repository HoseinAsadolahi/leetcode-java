package asadolahi.hosein.hashmap.jewelsandstones;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        for (char c: stones.toCharArray()) {
            for (char ch: jewels.toCharArray()) {
                if (c == ch) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
