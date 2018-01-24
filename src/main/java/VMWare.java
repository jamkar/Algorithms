import java.util.*;

public class VMWare {

    private int testField = 55;

    public static void main(String[] args) {

        VMWare vmWare = new VMWare();
        vmWare.testField = 10;

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int m = scan.nextInt();
        String string = scan.next();
//        String params = scan.next();
//        System.out.println("length: " + params);
//        String[] paramsSplitted = params.split("\\s+");
//        int k = Integer.parseInt(paramsSplitted[0]);
//        int l = Integer.parseInt(paramsSplitted[1]);
//        int m = Integer.parseInt(paramsSplitted[2]);
//        String string = scan.next();

        int lengthOfString = string.length();

        System.out.println(n + " " + k + " " + l + " " + m + " " + string);

        Map<String, Integer> subStrings = new HashMap<String, Integer>();

        String subString;
        int length;
        for (int i = 0; i < lengthOfString - 1; i++) {
            for (int j = 0; j < lengthOfString - i - 1; j++) {
                length = k + j;
                if (length <= l) {
                    subString = string.substring(i, i + length);
                    if (subString.length() < lengthOfString
                            && numberOfDistinctChars(subString) <= m) {
                        Integer count = subStrings.get(subString);
                        if (count != null) {
                            subStrings.put(subString, ++count);
                        } else {
                            subStrings.put(subString, 1);
                        }
                    }
                }
            }
        }

        System.out.println(Collections.max(subStrings.values()));
    }

    private static int numberOfDistinctChars(String str) {
        char[] chars = str.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        for (char ch : chars) {
            charSet.add(ch);
        }
        return charSet.size();
    }

}
