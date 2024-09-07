package asadolahi.hosein.arrays.q2;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder out = new StringBuilder();
        int i;
        for (i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            out.append(word1.charAt(i)).append(word2.charAt(i));
        }
        out.append(word1.substring(i));
        out.append(word2.substring(i));
        return out.toString();
    }
}
