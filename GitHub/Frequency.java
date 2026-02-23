import java.util.Arrays;

public class Frequency {
    private static int[] FreqString(String s) {
        int array[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            array[s.charAt(i) - 'a'] = count;  // ✅ store by character index
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        FreqString("abcradaba");
    }
}
