import java.util.*;

public class KillerSudokuHelper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cage size : ");
        int size = sc.nextInt();

        System.out.println("enter cage sum : ");
        int sum = sc.nextInt();

        System.out.println("enter already present elements : ");
        int presentedElement = sc.nextInt();

        Set<Integer> constraints = new HashSet<>();
        for (int i = 0; i < presentedElement; i++) {
            int val = sc.nextInt();
            constraints.add(val);
        }

        List<List<Integer>> res = new ArrayList<>();
        findCombination(sum, size, res, constraints, new ArrayList<>(), 1, 0);

        // print result
        System.out.println("\n cage sum : " + sum  + "\n cage size : " + size + "\n combinations : ");
        for (List<Integer> lst : res) {
            String val = "";
            for (int i : lst) {
                val += i;
            }
            System.out.println(val);
        }
    }

    private static void findCombination(int cageSum, int cageSize, List<List<Integer>> res, Set<Integer> constraints, List<Integer> temp, int start, int tempSum) {
        if (temp.size() == cageSize) {
            if (tempSum == cageSum) {
                res.add(new ArrayList<>(temp));
                return;
            }
        }

        for (int i = start; i <= 9; i++) {
            if (constraints.contains(i)) {
                continue;
            } else {
                constraints.add(i);
                temp.add(i);
                findCombination(cageSum, cageSize, res, constraints, temp, i + 1, tempSum + i);
                constraints.remove(i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
