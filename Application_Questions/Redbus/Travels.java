package redbus;

public class Travels {
String boarding;
String dropping;
String type;
double price;
Passenger p ;
public Travels()
{
	
}
public Travels(String boarding,String dropping)
{
	this.boarding=boarding;
	this.dropping=dropping;
}
public Travels(String boarding,String dropping,String type,double price,Passenger p)
{
	this(boarding,dropping);
	this.type=type;
	this.price=price;
	this.p=p;
}
}
