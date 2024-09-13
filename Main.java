import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<Integer> num1 = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();
        ArrayList<Integer> num3 = new ArrayList<Integer>();
        for (int i = 0; i < 20; i +=2) {
            num1.add(i);
        }
        for (int i = 0; i < 20; i +=3) {
            num2.add(i);
        }
        words.add("cats");
        words.add("bog");
        words.add("benguin");
        words.add("wadawis");
        words.add("ssssss");
        words.add("yibikbkxc");
        removePlural(words);
        removeStartB(words);
        System.out.println(intersect(num1,num2));

        for(int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

        //iterators
        Set<Integer> scores = new TreeSet<Integer>();
        scores.add(94);
        scores.add(69); // Kim
        scores.add(87);
        scores.add(70); // Marty
        scores.add(72);
        Iterator<Integer> itr = scores.iterator();
        while (itr.hasNext()) {
            int score = itr.next();
            System.out.println("The score is " + score);
// eliminate any failing grades
            if (score < 60) {
                itr.remove();
            }
        }
        System.out.println(scores);

    }
    public static void removePlural (ArrayList <String> words) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("s")) {
                words.remove(i);
                i--;
            }
        }
    }
    public static void removeStartB(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i ++) {
            if (words.get(i).startsWith("b")) {
                words.remove(i);
                i--;
            }
        }
    }
    public static ArrayList<Integer> intersect(ArrayList<Integer> num1, ArrayList<Integer> num2) {
        ArrayList<Integer> num3= new ArrayList<Integer>();
        for (int i : num1) {
                if (!num3.contains(i)) {
                    if (num2.contains(i)) {
                        num3.add(i);
                    }
                }
            }
        return num3;
    }
}
