public class LC_392 {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(methodBoolean(s, t));
    }

    public static boolean methodBoolean(String s, String t) {
        boolean answer = true;
        if (s.length() > t.length()) {
            return false;
        } else if (s.length() == t.length()) {
            return s.equals(t);
        } else {
            int indexS = -1;
            int indexT = -1;
            char[] charArrayS = s.toCharArray();
            char[] charArrayT = t.toCharArray();
            for (int i = 0; i < charArrayS.length; i++) {
                for (int j = indexT + 1; j < charArrayT.length; j++) {
                    if (charArrayT[j] == charArrayS[i]) {
                        if (j > indexT || j == 0) {
                            indexS++;
                            indexT = j;
                            break;
                        } else return false;
                    }
                }
            }
            if (indexS != s.length() - 1) return false;
        }

        return answer;
    }
}
