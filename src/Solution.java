import java.util.Map;
public class Solution {
    public void construct(TrieNode root, String string){
        TrieNode node = root;
        for(int index = 0; index < string.length(); index++){
            Character character = string.charAt(index);
            Map<Character, TrieNode> children = node.getChildren();
            if(children.containsKey(character)){
                node = children.get(character);
            }
            else {
                node = new TrieNode();
                children.put(character, node);
            }
        }
        node.setIsEnd(true);
    }

    public boolean isFound(TrieNode root, String string){
        TrieNode node = root;
        for(int index = 0; index < string.length(); index++){
            Character character = string.charAt(index);
            Map<Character, TrieNode> children = node.getChildren();
            if(children.containsKey(character)){
                node = children.get(character);
            }
            else{
                return false;
            }
        }
        return node.getIsEnd();
    }
}
