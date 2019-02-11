public class thing
{
    private int field1 = 10;
    private double field2 = 4.2;
    private boolean field3 = true;
    private String field4 = "boi";
    public thing(){
        this.field1 = 2;
        this.field2 = 87.4;
        this.field3 = true;
        this.field4 = "Yoi";
    }
    
    public void setField1(int newValue){
        this.field1 = newValue;
    }
    public void setField2(double newValue){
        this.field2 = newValue;
    }
    public void setField3(boolean newValue){
        this.field3 = newValue;
    }
    public void setField4(String newValue){
        this.field4 = newValue;
    }
    public int getField(){
        return field1;
    }

    public double getField2(){
        return field2;
    }

    public boolean getField3(){
        return field3;
    }

    public String getField4(){
        return field4;
    }
}
