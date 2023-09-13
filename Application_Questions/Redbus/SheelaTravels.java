package redbus;

public class SheelaTravels extends Travels{
public SheelaTravels(String boarding,String dropping,String type,double price)
{
	super(boarding,dropping);
	this.type="NON-AC-SEATER";
	this.price=price;
}
}
