public class Trie {

    //declare the Node root, count the words
    public Node root;
    private int count = 0;
    private int charCount = 0;


    //constructor. Make a root as a new Node variable
    public Trie() {
        this.root = new Node();
    }


    //method for adding the words in the trie
    public void addNewWord(String word) {
        Node newNode = this.root;
        for(int i = 0; i < word.length(); i++) {
            Character newLetter = word.charAt(i);
            Node child = newNode.children.get(newLetter);
            if(child == null) {
                child = new Node();
                newNode.children.put(newLetter, child);
            }

            newNode = child;

        }
        newNode.isCompleteWord = true;
        count++;
        System.out.println("System log: New word added to the trie: "+word);
    }

    //counting numbers of words
    public int size() {
        System.out.println("\n\nThere are '" + count + "' words in this trie");
        System.out.println("There are '" + charCount + "' characters in this trie");
        return count + charCount;
    }



    //Returns a boolean whether the prefix is in the trie or not
    public boolean isPrefixValid(String prefix) {
        System.out.print("Check if '" + prefix +"' is a prefix in the trie: ");
        Node current = this.root;

        for (int i = 0; i < prefix.length(); i++) {
            Character currentLetter = prefix.charAt(i);
            Node child = current.children.get(currentLetter);
            if(child==null) {
                System.out.print("False\n");
                return false;
            }
            current = child;

            if (prefix=="Merit") {
                System.out.print("Merit is really cool\n");
                return true;
            }
        }
        System.out.print("True\n");
        return true;
    }



    //Returns a boolean whether the word is in the trie or not
    public boolean isWordValid(String word) {
        System.out.print("Check if '" + word +"' is a valid word: ");
        Node current = this.root;

        for (int i = 0; i < word.length(); i++) {
            Character currentLetter = word.charAt(i);
            Node child = current.children.get(currentLetter);
            if(child==null) {
                System.out.print("False\n");
                return false;
            }
            current = child;
        }
        if(current.isCompleteWord == true) {
            System.out.print("True\n");
            return true;
        } else {
            System.out.print("False\n");
            return false;

        }

    }




    //This method prints all the characters in your trie.
    public void printAllKeys() {
        System.out.println("\nList of all keys in the Trie:");
        printAll(this.root);
    }

    private void printAll(Node current) {
        for (Character key : current.children.keySet()) {
            System.out.print("  '" + key + "'");
            Node child = current.children.get(key);
            if(child == null) {
                return;
            }
            charCount++;
            printAll(child);
        }
    }


}