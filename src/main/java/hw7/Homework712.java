package hw7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework712 {

    private String sentence;

    public Homework712(String sentence) {
        setSentence(sentence);
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String longestWord() {
        String[] words = getSentence().split("[ ,.:;]");
        String res = "";
        for (String word : words) {
            if (word.length() > res.length()) {
                res = word;
            }
        }
        return res;
    }

    public int countLetters() {
        int res = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        String sen = getSentence();
        Matcher m = pattern.matcher(sen);
        while (m.find()) {
            res++;
        }
        return res;
    }

    public String getWithoutDuplicateSpaces() {
        String sen = getSentence();
//        Pattern pattern = Pattern.compile(" {2,}");
//        Matcher m = pattern.matcher(sen);
//        while (m.find()) {
//            System.out.print("*" + sen.substring(m.start(), m.end()) + "*");
//        }
        sen = sen.replaceAll(" {2,}", " ");
        return sen;
    }
}
