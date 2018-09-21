//Creating an instance 
public class NumberHolder
{
    public int anint; //Attribute
    public float afloat; //Attribute

    public static void main(String[] args) //Method Main
    {
        NumberHolder num = new NumberHolder(); /// Instantiate/Instance
        num.anint =5; //Initialize variable
        num.afloat=6.0f; //Initialize variable
        System.out.println(num.anint);  //display
        System.out.println(num.afloat); //display
    }
}
