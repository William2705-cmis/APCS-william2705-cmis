import java.util.Scanner;


public class Fundimentals1
{
    public static void main ( String args[] ){
        double time = 9.23;
        int period = 2;
        boolean coffee = true;
        System.out.println("Time: " + time );
        System.out.println(" Period: " + period );
        System.out.println(" Do I have coffee: " + coffee);
        
        //hard call for add and mul
        double addhardcall = add(1,2);
        System.out.println(addhardcall);
        
        double mulhardcall = mul(2,2);
        System.out.println(mulhardcall);
        
        
        //user input call for sub and div
        Scanner user_input = new Scanner(System.in );
        
        double subinputcall;
        System.out.print("Subtraction-Give me 2 numbers: ");
        double first_sub = user_input.nextDouble();
        double second_sub = user_input.nextDouble();
        
        double sub = sub(first_sub, second_sub);
        System.out.println(("Result: ") + (sub));
        
        double divinputcall;
        System.out.print("Division-Give me 2 numbers: ");
        double first_div = user_input.nextDouble();
        double second_div = user_input.nextDouble();
        
        double div = div(first_div, second_div);
        System.out.println(("Result: ") + (div));
        
        
        //Compare
        int compareinputcall;
        System.out.format("Compare-Give me 2 numbers: ");
        int compared1 = user_input.nextInt();
        int compared2 = user_input.nextInt();
        
        compare(compared1, compared2);
        
        
        //EvenOddZero
        int evenOddZero;
        System.out.format("\n Give me a number and I will tell you if it is odd, even, or 0 \n For example: \n I will give you \"-1\" if it is odd. \n I will give you \"1\" if it is even. \n I will give you \"0\" if it is a zero ");
        int evenOddZeroinput = user_input.nextInt();
        evenOddZero(evenOddZeroinput);
        
        
        
        
        
    }
    
    public static int gamingHours(){
        int hours = 0;
        hours = hours + 8;
        System.out.println("My average gaming hours during the summer vacation is: " + hours);
        return hours;
    }
 // YEET ^^^ Doodles the ones below are the real fundimentals REEEEEEEEEEE   
    public static void dataTypes(){
        boolean open = true;
        byte amountofplayers = 5;
        short amountofhostiles = 24;
        int amountofbullets = 31*50;
        long amountofpixle = 9598592312358L;
        float amountofspeed = 4.5F;
        double defultmousesensitivity = 8.5D;
        char siteA = 'A';
        char siteB = 'B';
        
        String bool = "Boolean is 1 bit of information such as 0 and 1 or true and false";
        String byt = "Byte is an 8-bit thing that you can use and is super small so it saves space";
        String shot = "Short is 16-bit thing that you can use to save memory as a byte data type";
        String intager = "Int is 32-bit and is used as a defult datatype unless there is a problem concerning the memory";
        String lon = "Long is a 64-bit thing that is composed of a ton of int or a wider range of int. Has to add a L at the end of the number to be considered as a long, not an int";
        String flote = "Float is a 32-bit non-precise data type that can include decimal but should not be used as something specific such as currency. Used to save up memory.";
        String doubal = "Double is a 64-bit float that is used as a defult decimal choice but also shall not be used as something specific such as currency.";
        String cher = "Char is a 16-bit thing that doesn't include numbers but it includes single letters using single quotation marks.";
        
        String boolex = "Some real life use of boolean is the decision of path between yes or no, true or false, 1 or 0.";
        String bytex = "Some real life use of byte is for such as in a video game, it can be easy to store simple informations such as the amount of players where not a large amount of numbers are needed or the amount of guns there can be or even the amount of bullets each guns can carry";
        String shotex = "Some real life use of short is to save up the memory that each byte information takes such as, the amount of players each gigantic server can contain, the total amount of bullets shooting out in a game of lets say, 2 thousand players.";
        String intagerex = "Some real life use of int is to save data with a big number of values that also takes alot of memeroy";
        String lonex = "Some real life use of a long is to contain a huge number that exels the decimal amount of an int such as graphics value, pixles, etc.";
        String floteex = "Some real life use of a float is to create a number that includes a decimal tho it isn't suggested to be used for specific values.";
        String doubalex = "Some real life use of double is for a bigger value of float since float is only 32 bit and a double is 64 bit.";
        String cherex = "Some real life use of cher is to lable the values with single letters since it is able to include single letters only. And many others such as defining the sites or locations in a game.";
        
        System.out.println(open);
        System.out.println(amountofplayers);
        System.out.println(amountofhostiles);
        System.out.println(amountofbullets);
        System.out.println(amountofpixle);
        System.out.println(amountofspeed);
        System.out.println(defultmousesensitivity);
        System.out.println(siteA);
        System.out.println(siteB);
        
        System.out.println(bool);
        System.out.println(byt);
        System.out.println(shot);
        System.out.println(intager);
        System.out.println(lon);
        System.out.println(flote);
        System.out.println(doubal);
        System.out.println(cher);
        
        System.out.println(boolex);
        System.out.println(bytex);
        System.out.println(shotex);
        System.out.println(intagerex);
        System.out.println(lonex);
        System.out.println(floteex);
        System.out.println(doubalex);
        System.out.println(cherex);
    }
    
    public static int add(int a, int b){
        int sumAB = (a + b);
        return sumAB;
    }
    public static int sub(int a, int b){
        int difAB = (a - b);
        return difAB;
    }
    public static int mul(int a, int b){
        int outAB = (a * b);
        return outAB;
    }
    public static int div(int a, int b){
        int proAB = (a / b);
        return proAB;
    }

    
    
    
    public static double add(double a, double b){
        double sumAB = (a + b);
        return sumAB;
    }
    public static double sub(double a, double b){
        double subAB = (a - b);
        return subAB;
    }
    public static double mul(double a, double b){
        double outAB = (a * b);
        return outAB;
    }
    public static double div(double a, double b){
        double proAB = (a / b);
        return proAB;
    }
    
    
    
    //hard coded compare
    public static void compare(int compare1, int compare2){

        if (compare1 > compare2){
            System.out.format("The value of a is %d and it is greater than b whose value is %d",compare1,compare2);
        }
        
        else if (compare1 < compare2){
            System.out.format("The value of a is %d and it is less than b whose value is %d",compare1,compare2);
        }
         else if (compare1 == compare2){
             System.out.format("The value of a is %d and it is equal to b whose value is %d",compare1,compare2);
        } 
    }
    
    
    //oddEvenZero
    public static void evenOddZero(int evenOddZeroinput){
        if (evenOddZeroinput % 2 == 0 && evenOddZeroinput !=0 ){
            System.out.format("1");
        }
        else if (evenOddZeroinput % 2 != 0 && evenOddZeroinput != 0 ){
            System.out.format("-1");
        }
        else if (evenOddZeroinput == 0 ){
            System.out.format("0");
        }
    }
    
    public static void squareTable(){
        int squarebase = 1;
        
        for (int sq = squarebase; sq <= 10; sq++)
        {
            int boi = sq * sq;
            int random = (int )(Math.random() * ((boi - sq)+1)) + sq;

            System.out.format("%d\t%d\t%d\n",sq,boi, random);
        }
    }
    
        public static void yeetthiscomputer(){
        int squarebase = 0;
        
        for (int yeet = squarebase; yeet <= 10; squarebase++)
        {
            int boi = yeet * yeet;
            int random = (int )(Math.random() * ((boi - yeet)+1)) + yeet;

            System.out.format("%d\t%d\t%d",yeet,boi, random);
        }
        
        
    }
        public static void triangle(int number){
            System.out.format("%d Triangled is ",number);
            int num = number;
            int result = 0;
            for (int looptime = num; num > 1; number--)
            {
                result += number;
                num = number; 
            }
            System.out.format("%d",result);
        }
        
        public static void pyramid(int number){
            System.out.format("%d Pyramided is ",number);
            int num = number;
            int result = 0;
            for (int looptime = num; num > 1; number--)
            {
                result += number*number;
                num = number; 
            }
            System.out.format("%d",result);
        }
        
        public static void checkerboard(int h, int w){
            System.out.print("+");
            int width = w;
            
            for (int looptime = w; w > 0; w--)
            {
                System.out.print("-");
                if (w == 1){
                    System.out.print("+ \n");
                }
            }
            w = width;
            //^^^^top boarder ^^^^^
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
            //^^^mid part^^^
            w = width;
            System.out.print("+");
            for (int looptime = w; w > 0; w--)
            {
                System.out.print("-");
                if (w == 1){
                    System.out.print("+ \n");
                }
            }
            //^^^Bottom part^^^
        }
        
    }
    

