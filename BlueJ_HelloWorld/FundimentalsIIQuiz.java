
public class FundimentalsIIQuiz
{
    public static void main ( String args[] )
    {
        int[] array4 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("start, main isnt gonna return anything REEEEEEEEEEEEEEEEEEe");
        System.out.println("type in the return values n stuff in other methods dont bother meh IM SLEEPING!");
        
        
    }

    public static int[] minmax(int[] array){
        int[] minmax = new int[]{0,0};
        int maxcheck = 0;
        int mincheck = 0;
        for(int x=0; x<array.length; x++){
            if(array[x]>= maxcheck){
                maxcheck=array[x];
            }
            else if(array[x]<=mincheck){
                mincheck=array[x];
            }
            
        }
        minmax[0] = mincheck;
        minmax[1] = maxcheck;

        return minmax;
    }
    
    
    
    
    
    public static int[] filter(int[] array, int min, int max, boolean positive){
        int[] result = new int[array.length];
        int start = 0;
        if (positive == true){
            for(int x=min; x<max;x++){
                result[start] = array[x];
                start++;
            }
        }
        else if (positive == false){
            for(int p=0; p<array.length; p++){
                result[p] = array[p];
            }
        }
        return result;
    }

}
