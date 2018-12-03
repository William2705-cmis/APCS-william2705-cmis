public class Bubble
{
    public static void main(String[] args){
    
    
    }
    
    public static int[] bubble(int[] arr){
        boolean varify = true;
        for(int x = 0; x < arr.length; x++){
            if(arr[x] > arr[x+1]){
                varify = false;
                
            }
        }
        return arr;
    }
}
