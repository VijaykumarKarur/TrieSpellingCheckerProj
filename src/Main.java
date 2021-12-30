public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TrieNode root = new TrieNode();
        String[] dictionary = new String[10];
        dictionary[0] = "apple";
        dictionary[1] = "zebra";
        dictionary[2] = "banana";
        dictionary[3] = "cat";
        dictionary[4] = "rat";
        dictionary[5] = "horse";
        dictionary[6] = "dog";
        dictionary[7] = "apricot";
        dictionary[8] = "donut";
        dictionary[9] = "car";

        String[] words = new String[5];
        words[0] = "car";
        words[1] = "don";
        words[2] = "cart";
        words[3] = "horse";
        words[4] = "b";

        System.out.println("Dictionary: ");
        for(int index = 0; index < dictionary.length; index++){
            solution.construct(root, dictionary[index]);
            System.out.println(dictionary[index]);
        }

        int[] result = new int[words.length];
        for(int index = 0; index < words.length; index++){
            result[index] = solution.isFound(root, words[index]) ? 1 : 0;
        }

        System.out.println("Words : Found or Not");
        for(int index = 0; index < words.length; index++){
            System.out.println(words[index] + " : " + result[index]);
        }
    }
}
