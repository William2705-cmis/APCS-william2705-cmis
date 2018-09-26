

public class Fundimentals2
{
    public static void main(){
        int[] intagers = new int[]{0, 1, 2, 3, 4};
        double[] doubles = new double[]{0.2, 1.5, 2.3, 3.6, 4.1};
        boolean[] arr3 = new boolean[]{true,false,true,false,true};
        String[] strings = new String[]{"Hi", "Jeff", "I like to eat cheese", "这个系统能打中文吗?", "If it can, then it is 666"};
        
        System.out.println(intagers[0]);
        System.out.println(doubles[2]);
        System.out.println(strings[4]);
        
        printArray(intagers,false);
    }
    
    public static void printArray(int array[], boolean skip){
        int shkip = 0;
        if(skip == true){
            while(shkip<array.length){
                System.out.print(array[shkip] + ", ");
                shkip+=2;
            }
        }else{
            while(shkip<array.length){
                System.out.print(array[shkip] + ", ");
                shkip++;
            }
        }
    }

}
