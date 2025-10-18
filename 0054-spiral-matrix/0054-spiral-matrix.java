class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int tr=0,br=r-1,lc=0,rc=c-1;
        int totalelement=0;
        while(totalelement<r*c){
            for(int j=lc;j<=rc && totalelement < r*c ;j++){
                list.add(matrix[tr][j]);
                totalelement++;
            }
            tr++;
            for (int i = tr; i <=br && totalelement < r*c; i++) {
                list.add(matrix[i][rc]);
                totalelement++;
            }
            rc--;
            for (int i = rc; i >=lc && totalelement < r*c ; i--) {
                list.add(matrix[br][i]);
                totalelement++;
            }
            br--;
            for (int i = br; i >=tr && totalelement < r*c ; i-- ) {
                list.add(matrix[i][lc]);
                totalelement++;
            }
            lc++;

        }
        return list;
    }
}