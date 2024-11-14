import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        char[][] dungeon = new char[row][col];

        System.out.println("Position of adventurer :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Position of gold : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        dungeon[r1 - 1][c1 - 1] = 'A';
        dungeon[r2 - 1][c2 - 1] = 'G';
        boolean[][] visited = new boolean[row][col];
        int steps = findPath(dungeon, r1 - 1, c1 - 1, 0, visited);
        System.out.println(steps);
    }

    private static int findPath(char[][] dungeon, int r1, int c1, int steps, boolean[][] visited) {
        if (r1 >= dungeon.length || c1 >= dungeon[0].length || r1 < 0 || c1 < 0 || visited[r1][c1]) {
            return 0;
        }

        if (dungeon[r1][c1] == 'G') {
            return 1;
        }
        visited[r1][c1] = true;

        int down = 1 + findPath(dungeon, r1 + 1, c1, steps, visited);
        int up = 1 + findPath(dungeon, r1 - 1, c1, steps, visited);
        int left = 1 + findPath(dungeon, r1, c1 - 1, steps, visited);
        int right = 1 + findPath(dungeon, r1, c1 + 1, steps, visited);

        return Math.min(Math.min(down, up), Math.min(left, right));
    }
}
