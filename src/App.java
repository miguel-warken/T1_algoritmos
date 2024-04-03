public class App {
    public static void main(String[] args) throws Exception {

        // String[] s = { "buy Amazon", "buy Google", "buy Apple", "buy Google", "buy Google", "buy NVIDIA" };
        // String[] s_line = { "buy Google", "buy Apple", "buy Google", "buy NVIDIA" };

        String[] s = {"abc", "def", "xyz", "abc",  "h", " xyz", "def"};
        String[] s_line = {"def", "abc", "h", "def", "abc"};

        System.out.println(hasTrend(s, s_line));
    }

    public static boolean hasTrend(String[] S, String[] S_line) {

        boolean isTrend = true;
        boolean found = false;

        int lastIndexJ = 0;
        // lógica

        for (int i = 0; i < S_line.length; i++) {

            for (int j = lastIndexJ; j < S.length; j++) {

                if (S_line[i].equals(S[j])) {
                    found = true;
                    lastIndexJ = j;
                    break;
                } else {
                    found = false;
                }
            }

            if (!found) {
                isTrend = false;
            }
        }
        return isTrend;
    }
}
