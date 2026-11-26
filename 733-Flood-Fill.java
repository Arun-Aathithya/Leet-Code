class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int origColor = image[sr][sc];
        if (origColor == color) return image; // no change needed
        
        dfs(image, sr, sc, origColor, color);
        return image;
    }

    void dfs(int[][] image, int i, int j, int orig, int color) {
        int m = image.length, n = image[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n || image[i][j] != orig)
            return;

        image[i][j] = color;

        dfs(image, i + 1, j, orig, color);
        dfs(image, i - 1, j, orig, color);
        dfs(image, i, j + 1, orig, color);
        dfs(image, i, j - 1, orig, color);
    }
}