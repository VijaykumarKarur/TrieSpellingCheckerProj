import  java.util.Map;
import java.util.HashMap;
public class TrieNode {
    private Map<Character, TrieNode> children;
    private boolean isEnd;

    public TrieNode(){
        children = new HashMap<>();
        isEnd = false;
    }
    public Map<Character, TrieNode> getChildren() {
        return children;
    }

    public boolean getIsEnd(){
        return isEnd;
    }

    public void setIsEnd(boolean end) {
        isEnd = end;
    }
}
