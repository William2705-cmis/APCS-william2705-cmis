
public class LinearSearch
{
    public static void main(String[] args){
        search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3);
    }

    public static void search(int[] array, int number){
        System.out.println(array);
        for(int x = 0; x < array.length; x++){
            if(number == array[x]){
                System.out.format("Match found! Your number %d is on index %d", number, x);
            }
        }
        
    }
}
