public class ThingApplication
{
    public static void main ( String args[] ){
        thing thing1 = new thing();
        thing thing2 = new thing();
        thing1.setField1(23);
        thing2.setField2(53.5);
        thing1.setField3(false);
        thing2.setField4("REEEEEEEEEE");
        System.out.println(thing1.getField());
        System.out.println(thing2.getField2());
        System.out.println(thing1.getField3());
        System.out.println(thing2.getField4());
        
    }
}
