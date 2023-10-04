import java.util.HashSet;

public class frogsandjumps {

    public static int unvisitedLeaves(int n, int k, int[] strengths) {
        HashSet<Integer> visited = new HashSet<Integer>();
        for (int s : strengths) {
            for (int i = s; i <= n; i += s) {
                visited.add(i);
            }
        }
        return n - visited.size();
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int[] strengths = {3, 2, 4};
        int unvisited = unvisitedLeaves(n, k, strengths);
        System.out.println("Number of unvisited leaves: " + unvisited);
    }
}
