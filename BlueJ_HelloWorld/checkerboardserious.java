
public class checkerboardserious
{
    public static void checkerboard(int h, int w){
        
        
        System.out.print("+");
        for (int looptimewidth = w; looptimewidth > 0; looptimewidth--)
            {
                System.out.print("-");
                if (looptimewidth == 1){
                    System.out.print("+\n");
                }
    }
            
        for(int looptimeheight = h; looptimeheight>0; looptimeheight--)
         {
            System.out.print("|");
             if (looptimeheight % 2 == 0 ){
                for (int looptimewidth = w; looptimewidth > 0; looptimewidth--){
                            if (looptimewidth % 2 == 0){
                                System.out.print(" ");
                            }
                            else if (looptimewidth % 2 != 0){
                                System.out.print("#");
                            }   
                 }
               }
            else if ( looptimeheight % 2 != 0 ){
                for (int looptimewidth = w; looptimewidth > 0; looptimewidth--){
                            if (looptimewidth % 2 != 0){
                                System.out.print(" ");
                            }
                            else if (looptimewidth % 2 == 0){
                                System.out.print("#");
                            }
                }
            }  
            System.out.print("|\n");
        }
        
            System.out.print("+");
            for (int looptimewidth = w; looptimewidth > 0; looptimewidth--)
                {
                    System.out.print("-");
                    if (looptimewidth == 1){
                    System.out.print("+\n");
                }
    }
        
        
        
        
        
    
}
}
