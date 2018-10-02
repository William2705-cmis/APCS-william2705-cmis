

public class Fundimentals2
{
    public static void main(){
        //#1
        int[] intagers = new int[]{0, 1, 2, 3, 4};
        double[] doubles = new double[]{0.2, 1.5, 2.3, 3.6, 4.1};
        boolean[] booleans = new boolean[]{true,false,true,false,true};
        String[] strings = new String[]{"Hi", "Jeff", "I like to eat cheese", "这个系统能打中文吗?", "If it can, then it is 666"};
        
        System.out.println(intagers[0]);
        System.out.println(doubles[2]);
        System.out.println(strings[4]);
        
        printArray(intagers,true);
        System.out.print("\n");
        printArray(doubles,false);
        System.out.print("\n");
        printArray(booleans,true);
        System.out.print("\n");
        printArray(strings,false);
        System.out.print("\n");
        
        System.out.println(lastItem(intagers));
        System.out.println(lastItem(doubles));
        System.out.println(lastItem(booleans));
        System.out.println(lastItem(strings));
        
        System.out.println(middleItem(intagers));
        System.out.println(middleItem(doubles));
        System.out.println(middleItem(booleans));
        System.out.println(middleItem(strings));
        
        randomInts(5,2,20);
    }
    
    
    //#2
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
        public static void printArray(double array[], boolean skip){
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
    public static void printArray(boolean array[], boolean skip){
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
    public static void printArray(String array[], boolean skip){
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
    
    
    
    //#3
    public static int lastItem(int array[]){
        int result = 0;
        result = array[array.length - 1];
        return result;
    }
    public static double lastItem(double array[]){
        double result = 0;
        result = array[array.length - 1];
        return result;
    }
    public static boolean lastItem(boolean array[]){
        boolean result = true;
        result = array[array.length - 1];
        return result;
    }
    public static String lastItem(String array[]){
        String result = "";
        result = array[array.length - 1];
        return result;
    }
    
    
    
    //#4
    public static int middleItem(int array[]){
        int result = 0;
        result = array[array.length / 2];
        return result;
    }
    public static double middleItem(double array[]){
        double result = 0;
        result = array[array.length / 2];
        return result;
    }
    public static boolean middleItem(boolean array[]){
        boolean result = true;
        result = array[array.length / 2];
        return result;
    }
    public static String middleItem(String array[]){
        String result = "";
        result = array[array.length / 2];
        return result;
    }
    
    //#5__________________________
    public static int[] randomInts(int n, int min, int max){
        int [] num = new int[n];
        int output = 0;
        for(int x = 0; x < n; x++){
            int d = (int)((Math.random() * (max - min) + min));
            num [x] = d;
            output += num[x];
        }
        return num;
    }
    
    //#6___________________________
    public static double[] randomDoubles(int n, double min, double max){
        double [] num = new double[n];
        for(int x = 0; x < n; x++){
            double d = (double)((Math.random() * (max - min) + min));
            num [x] = d;
        }
        return num;
    }
}
