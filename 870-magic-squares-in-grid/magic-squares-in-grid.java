class Solution{
    public int numMagicSquaresInside(int[][] grid){
        if(grid.length<3||grid[0].length<3)return 0;
        int count=0;
        for(int i=0;i<=grid.length-3;i++){
            for(int j=0;j<=grid[0].length-3;j++){
                if(ismagic(grid,i,j))count++;
            }
        }
        return count;
    }
    public static boolean ismagic(int[][] grid,int row,int col){
        if(grid[row+1][col+1]!=5)return false;
        int[] check=new int[10];
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                int value=grid[i][j];
                if(value<1||value>9||check[value]==1)return false;
                check[value]++;
            }
        }
        for(int i=0;i<3;i++){
            if(grid[row+i][col]+grid[row+i][col+1]+grid[row+i][col+2]!=15)return false;
            if(grid[row][col+i]+grid[row+1][col+i]+grid[row+2][col+i]!=15)return false;
        }
        if(grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2]!=15)return false;
        if(grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col]!=15)return false;
        return true;
    }
}
