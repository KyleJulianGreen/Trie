import java.util.HashMap;

public class Node {


    public HashMap<Character, Node> children;
    public boolean isCompleteWord;


    //boolean by default is false
    public Node() {
        this.children = new HashMap<Character, Node>();
        this.isCompleteWord = false;
    }

}
