public class a2DArray {
        public static void main(String[] args) {
            int a2DArray [][][]= new int [3][4][5];
            int i,j,k;
            for (i=0; i<2; i++) 
            for(j=0 ; j<2; j++)
            for(k=0;k<2;k++)
            a2DArray[i][j][k] = i*j*k;
    
            for(i=0;i<2;i++){
                for (j= 0; j<2;j++) {
                    for(k=0; k<2;k++)
                    System.out.print(a2DArray[i][j][k] + " ");
                    System.out.println();
                    
                }
                System.out.println();
            }
        }
}
