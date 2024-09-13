package asadolahi.hosein.trees.q14;

public class Trie {
    private boolean present;
    private final Trie[] children;

    public Trie() {
        children = new Trie[26];
    }

    public void insert(String word) {
        insert(word, 0);
    }

    private void insert(String word, int index) {
        if (index == word.length()) {
            present = true;
            return;
        }
        int id = word.charAt(index) - 'a';
        if (children[id] == null) {
            children[id] = new Trie();
        }
        children[id].insert(word, index + 1);
    }

    public boolean search(String word) {
        return search(word, 0);
    }

    private boolean search(String word, int index) {
        int id = word.charAt(index) - 'a';
        if (children[id] != null) {
            if (index == word.length() - 1) {
                return children[id].present;
            }
            return children[id].search(word, index + 1);
        }
        return false;
    }

    public boolean startsWith(String prefix) {
        return startsWith(prefix, 0);
    }

    private boolean startsWith(String prefix, int index) {
        int id = prefix.charAt(index) - 'a';
        if (children[id] != null) {
            if (index == prefix.length() - 1) {
                return true;
            }
            return children[id].startsWith(prefix, index + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("beer");
        trie.insert("add");
        trie.insert("jam");
        trie.insert("rental");
        System.out.println(trie.search("apps"));
        System.out.println(trie.search("app"));
    }
}
