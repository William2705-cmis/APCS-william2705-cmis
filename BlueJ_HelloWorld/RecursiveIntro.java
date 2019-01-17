class RecursiveIntro
{
    public static void main(String[] args){
        System.out.println(multiply(2,3));
        System.out.println(division(9,3));
        System.out.println(square(4,2));
    }
    
    public static int multiply(int a, int b){
        //Thinking: "2 x 3" can also be seen as "2 + (2 x 2)".
        //Therefor: We can use the recursive method to multiply like this:
        
        if(b==1){
            return a;
        }
        else if(b == 0 || a == 0){
            return 0;
        }
        else{
            return a + multiply(a,b-1);
        }
    }
    
    public static int division(int a, int b){
        if(b==1){
            return a;
        }
        else if (a < b){
            return a;
        }
        else{
            return 1 + division(a - b,b);
        }
    }
    
    public static int square(int a, int b){
            if(b==1){
            return a;
        }
        else if(a == 1){
            return a;
        }
        else if(b == 0 || a == 0){
            return 0;
        }
        else{
            return a * a + square(a,b-1);
        }
    }
    
    
    
}





















