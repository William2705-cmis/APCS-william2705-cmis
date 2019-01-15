public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        int target = 0;
        int switcher = 0;
        int position = 0;
        for (int switching = 0; switching < array.length-1; switching++){
            for(int checking = 0; checking < array.length-1; checking++){
                if(array[checking]<array[checking+1]){
                        target = array[checking];
                        position = checking;
                }
                
            }
            if(array[switching]!=target){
                switcher = array[switching];
                array[switching]=target;
                array[position]=switcher;
            }
        }
        
    }
}
