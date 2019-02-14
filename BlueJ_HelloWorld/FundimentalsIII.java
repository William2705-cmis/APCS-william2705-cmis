
public class FundimentalsIII
{
    public static void main ( String args[] ){
        int[][] defautint = new int[5][5];
        int[][] literalint = new int[{1,2,3},{4,5,6},{7,8,9}];
    }

    
     public static int[][] shift(int[][] array, int shiftRow){
        for(int row = array.length - 1; row >= 0; row--){
            for(int col = 0; col < array[row].length; col++){
                if(row == shiftRow){
                    if(row == array.length - 1){
                        array[row][col] = (int)(Math.random() * 10);
                    } else {
                        array[row + 1][col] = array[row][col];
                        array[row][col] = (int)(Math.random() * 10);    
                    }
                    
                }
            }
        }
        return array;
        
    }
}
