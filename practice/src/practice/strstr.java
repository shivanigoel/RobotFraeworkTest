package practice;

public class strstr {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int haystackLen = haystack.length();
        int needleLen = needle.length();

        for (int i = 0; i <= haystackLen - needleLen; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;
                for (j = 1; j < needleLen; j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == needleLen) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int index = strStr(haystack, needle);
        System.out.println("Index of needle: " + index);
    }
}