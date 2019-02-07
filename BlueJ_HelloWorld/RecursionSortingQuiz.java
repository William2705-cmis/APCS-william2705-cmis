public class RecursionSortingQuiz
{
    public static void main(String[] args){
        System.out.println("I'm ready to serve you!");
        System.out.println("Factorials: 10, 5, 0");
        System.out.println(factorial(10));
        System.out.println(factorial(5));
        System.out.println(factorial(0));
        //tbh I didnt really get or finish any of the sorting algorythems and I missed a lot of classes 0w0
        //kind of shocked that I got this coding so easily (prob just insane amount of luck)
    }

    /**
     * @param n the value
     * @return n!
     * 
     * Factorials
     * n! => n * n-1 * n-2 * ... * n -(n-1)
     * 10! => 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 3628800
     * 5! => 5 * 4 * 3 * 2 * 1 => 120
     * 0! => 1
     */
    public static int factorial(int n){
        
        if (n==0){
            return 1;
        }
        else{
            return n*(factorial(n-1));
        }
        
    }
  
    /**
     * @param array the array to be sorted
     * @return the array sorted
     */
    public static int[] kiefferSort(int[] array){
        int boi = 0;
        int doi = 0;//these are for switching the array index
        int max = array.length;
        int min = array.length-(array.length-1);
        int hoi = (int)((Math.random() * (max - min) + min));
        for(int x = 0; x < array.length-1; x++){
            if(array[x]>array[x+1]){
                boi = array[0];
                doi = array[hoi];
                array[0] = doi;
                array[hoi] = boi;
                kiefferSort(array);
            }
        }
        return array;
    }
}