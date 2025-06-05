import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;


public class Fire {
    /**
     * Returns how long it takes for all vulnerable trees to be set on fire if a
     * match is lit at a given location.
     * 
     * The forest is represented via a rectangular 2d char array where t represents a tree
     * and . represents an empty space.
     * 
     * At time 0, the tree at location [matchR, matchC] is set on fire. At every subsequent
     * time step, any tree that is adjacent (up/down/left/right) to a burning tree is also
     * set on fire. 
     * 
     * 
     * EXAMPLE 
     * forest:
     * 
     * t..tttt.t
     * ..tt....t
     * ..ttttttt
     * tttt.....
     * 
     * matchR: 2
     * matchC: 6
     * 
     * Result: 8
     * 
     * Explanation:
     * At time 0, the tree at (2, 6) is set on fire. At time 1, its adjacent trees also catch on fire
     * At time 2, the trees adjacent to those catch as well. At time 8, the last tree to catch is at
     * (0,6). In this example, there is one tree that never burns, so it is not included in the time calculation.
     * 
     * 
     * @param forest a 2d array where t represents a tree and . represents the ground
     * @param matchR The row the match is lit at
     * @param matchC The column the match is lit at
     * @return the time at which the final tree to be incinerated starts burning
     */
    public static int timeToBurn(char[][] forest, int matchR, int matchC) {
        // HINT: when adding to your BFS queue, you can include more information than
        // just a location. What other information might be useful?
        boolean[][] onFire = new boolean[forest.length][forest[0].length];
        Queue<int[]> queue = new LinkedList<>();
        int maxDepth = 0;
        queue.add(new int[]{matchR, matchC, maxDepth});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currR = current[0];
            int currC = current[1];
            int depth = current[2] + 1;

            if(onFire[currR][currC]) {
                continue;
            }

            onFire[currR][currC] = true;

            List<int[]> moves = possibleMoves(forest, current);
            
            for(int[] move : moves) {
                queue.add(new int[]{move[0], move[1], depth});
                
            }
            maxDepth = Math.max(maxDepth, depth);
        }
        return maxDepth-1;
    }
    public static List<int[]> possibleMoves(char[][] forest, int[] curr) {
        int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
        List<int[]> moves = new ArrayList<>();
        for (int[] dir : directions) {
            int newROW = curr[0] + dir[0];
            int newCOL = curr[1] + dir[1];
            if (newROW>=0&&
                newROW<forest.length&&
                newCOL>=0&&
                newCOL<forest[newROW].length&&
                forest[newROW][newCOL]!='.') {
                    moves.add(new int[]{newROW,newCOL});
            }
        }
        return moves;
    }
}