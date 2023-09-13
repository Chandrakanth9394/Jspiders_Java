package redbus;

public class Redbus {
Travels t;
public void BookTicket(Travels t)
{
	if(this.t==null)
	{
		this.t=t;
		System.out.println("ticket booked successfully");
	}
	else
	{
		System.out.println("Already booked!");
	}
}
public void trip()
{
	System.out.println(t.boarding);
	System.out.println(t.dropping);
}
public void DownloadTicket()
{
	if(t!=null)
	{
		System.out.println("Name of the passenger "+t.p.getName());
		System.out.println("Age of the passenger "+t.p.getAge());
		System.out.println("Gender: "+t.p.getGender());
		System.out.println("cno: "+t.p.getCno());
		System.out.println("boarding point "+t.boarding);
		System.out.println("dropping point: "+t.dropping);
		System.out.println("type of bus: "+t.type);
		System.out.println("price: "+t.price);
	}
	else
	{
		System.out.println("Sorry no ticket available");
	}
}
public void CancelTicket()
{
	if(t==null)
	{
		System.out.println("no ticket exits");
	}
	else
	{
		t=null;
		System.out.println("cancelled the ticket");
	}
}
}
