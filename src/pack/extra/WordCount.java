package pack.extra;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy a dog";
        String[] words = sentence.split("\\s");
        for(String word : words){
            System.out.println(word);
        }
        System.out.println("Total Words: " + words.length);
    }
}
