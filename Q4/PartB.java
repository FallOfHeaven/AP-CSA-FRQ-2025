public boolean clearPair(int row, int col){
    int a = puzzle[row][col];
    for(int i = row; i < puzzle.length; i++){
        for(int j = 0; j < puzzle[0].length; j++){
            if(i != row || j != col){
                int b = puzzle[i][j];
                if(a == b || (a + b) == 10){
                    puzzle[row][col] = 0;
                    puzzle [i][j] = 0;
                    return true;
                }
            }
        }
    }
    return false;
}
