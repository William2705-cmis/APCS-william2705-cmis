

public class checkerboard
{
    public static void checkerboard(int h, int w){
        int width = w;
     for(int luptime = h; h>0; h--)
     {
            System.out.print("|");
            for (int looptime = w; w > 0; w--)
                {
                    System.out.print(".");
                    if (w == 1){
                        System.out.print("| \n");
                    }
                    
                }
        w = width;
        
        
        
        
        
            }       
    }
    
    
    
    
    
    
    
}
