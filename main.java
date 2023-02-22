import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class main {

    public static String[] createTree(int[] parents, String[] names) {
        int rootIndex = root(parents);
        String rootName = names[rootIndex];
        List<String> lines = new ArrayList<>();
        lines.add("+-" + rootName);

        showNames(parents, names, rootIndex, 0, "", lines);
        return lines.toArray(new String[0]);
    }

    private static int root(int[] parents) {
        for (int i = 0; i < parents.length; i++) {
            if (parents[i] == -1) {
                return i;
            }
        }
        return 0;
    }

    private static List<Integer> getLeaves(int[] parents, int nodeIndex) {
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < parents.length; i++) {
            if (parents[i] == nodeIndex) {
                leaves.add(i);
            }
        }
        return leaves;
    }

    private static void showNames(int[] parents, String[] names, int index2,
            int indentNum, String symbols, List<String> lines) {
        List<Integer> leaves = getLeaves(parents, index2);

        if (leaves.isEmpty()) {
            return;
        }

        leaves.sort((i1, i2) -> names[i1].compareTo(names[i2]));
        for (int i = 0; i < leaves.size(); i++) {
            int index = leaves.get(i);
            String leafName = names[index];
            boolean isLast = i == leaves.size() - 1;
            String symbols2 = "";

            if (isLast) {
                symbols2 = symbols + " ";
            } else {
                symbols2 = symbols + "|";
            }

            String leafIndent = " ".repeat(indentNum + 2);

            lines.add(leafIndent + symbols + "+-" + leafName);
            showNames(parents, names, index, indentNum + 2, symbols2, lines);
        }
    }

    public static void main(String[] args) {
        // Test to ensure that the program works as it should
        int[] parents = { 1, 2, 3, 4, 5, 6, -1 };
        String[] names = { "A", "B", "C", "D", "E", "F", "G" };
        String[] tree = createTree(parents, names);
        Arrays.stream(tree).forEach(System.out::println);
    }
}