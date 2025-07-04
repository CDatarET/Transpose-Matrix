class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] ret = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < ret.length; i++){
            for(int j = 0; j < ret[0].length; j++){
                ret[i][j] = matrix[j][i];
            }
        }

        return ret;
    }
}
