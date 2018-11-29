public class FundimentalsIIITest
{
    public static void main(String[] args){
        int[][] array1 = {{606, -11778, 14724, 19623},
                {-9474, 12334, 2791, -13518},
                {-13681, -8397, -6940, -726},
                {-2978, 7212, 2201, 6735}};

        int[][] array2 = {{-11882, -4377, 5226, -664, -1108, 7142, 2017},
                {7071, -8942, -13904, -17035, -2606, -11831, -13766},
                {-12234, -9534, -15779, 13615, 10270, -6859, 6361},
                {-6033, -549, -15958, 17019, -9666, -4876, -6368}};

        int[][] array3 = {{-5487, -18628, 3365, -14728, 10979},
                {-11403, 13387, -10335, -10113, -12000},
                {-10585, -18889, 15515, -16093, -6097},
                {-17722, 9392, -13208, -17901, -6223},
                {-14081, -10776, -6435, -13976, 2823},
                {-13029, -8753, -5213, -3666, 13910},
                {16639, -11206, -14375, 8119, -9044},
                {7253, -11243, -9436, -14244, -15883}};
                
        System.out.println(allGreater(array1,0));
        System.out.println(invertSign(array1,true));
        System.out.println(swapColumns(array1,0,1));
    }
    
    public static boolean allGreater(int[][] array, int threshold){
        boolean identify = true;
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length; y++){
                if(array[x][y]<threshold){
                    identify = false;
                }
            }
        }
        return identify;
    }
    
    
    public static int[][] invertSign(int[][] array, boolean positive){
        int[][] invertarr = new int[array.length][array.length];
        if(positive = true){
            for(int x = 0; x < array.length; x++){
                for(int y = 0; y < array[x].length; y++){
                    invertarr[x][y] = array[x][y];
                    if(invertarr[x][y] < 0){
                        invertarr[x][y] = invertarr[x][y] * -1;
                    }
                }
            }
        }
        
        else if(positive = false){
            for(int x = 0; x < array.length; x++){
                for(int y = 0; y < array[x].length; y++){
                    invertarr[x][y] = array[x][y];
                    if(invertarr[x][y] > 0){
                        invertarr[x][y] = invertarr[x][y] * -1;
                    }
                }
            }
        }
        return invertarr;
    }
    
    public static int[][] swapColumns(int[][] array, int c1, int c2){
        int[][] swaparr = new int[array.length][array.length];
        
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array[x].length;y++){
                swaparr[x][y] = array[x][y];
                swaparr[c1][y] = array[c2][y];
                swaparr[c2][y] = array[c1][y];
            }
        }
        
        return swaparr;
    }
}
