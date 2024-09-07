package asadolahi.hosein.hashmap.q5;

public class MaximumNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        int minValue = Math.min(a, b);
        minValue = Math.min(minValue, l/2);
        minValue = Math.min(minValue, o/2);
        minValue = Math.min(minValue, n);
        return minValue;
    }
}
