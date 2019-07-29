public class TrieTest {

    public static void main(String[] args) {

        //create a new object trieTest
        Trie trieTest = new Trie();


        //inserting new words
        trieTest.addNewWord("car");
        trieTest.addNewWord("card");
        trieTest.addNewWord("chip");
        trieTest.addNewWord("trie");
        trieTest.addNewWord("try");
        trieTest.addNewWord("abc");
        trieTest.addNewWord("Merit");

        //prefix
        trieTest.isPrefixValid("cat");
        trieTest.isPrefixValid("car");
        trieTest.isPrefixValid("tr");
        trieTest.isPrefixValid("chi");
        trieTest.isPrefixValid("Merit");


        //Check for word
        System.out.println("\n*****Check for Word*****");
        trieTest.isWordValid("car");
        trieTest.isWordValid("t");
        trieTest.isWordValid("elp");
        trieTest.isWordValid("ch");
        trieTest.isWordValid("try");
        trieTest.isWordValid("mix");
        trieTest.isWordValid("card");




        trieTest.printAllKeys();
        trieTest.size();




    }

}