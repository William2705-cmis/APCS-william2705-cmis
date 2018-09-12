

public class Fundimentals1Quiz
{
    public static int method1(int a, int b, int c){
        if (a <= b && a <= c){
            a = 1;
        }
        else if (b <= a && b <= c){
            b = 1;
        }
        else if (c <= a && c <= b){
            c = 1;
        }
        int finalproduct = a*b*c;
        
        return finalproduct;
    }
    
    public static int method2(int a, int b){
        int start = 0;
        int finalresult = 0;
        for(int loop = start; loop <= a; loop++){
            
            int result = loop*b;
            finalresult += result;
            
            
        }
        if(a < 0){
            finalresult = 0;
        }
       
        return finalresult;
    }
    public static void main(String args[])
    {
        System.out.println(method3(5,7));
    }
    public static String method3(int h, int w){
        String result = "";
        String pipe = "";
        String middleplus = "";
        int start = 0;
        double hmiddle = h / 4 - 0.5;
        double wmiddle = w / 4 - 0.5;
        if((h % 2 != 0 && w %2 != 0)&&(h > 0 && w > 0)){
            for(int loop = start; loop < hmiddle; loop++){
                pipe += ("|\n");
            }
            middleplus = ("+\n");
            for(int loop = start; loop < hmiddle; loop++){
                pipe += ("|\n");
            }
            result = pipe + middleplus + pipe;
        }
        else{
            result = "+";
        }
        return result;
    }
}
