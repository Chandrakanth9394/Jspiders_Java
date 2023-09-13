package redbus;

public class DriverRedbus {
public static void main(String[] args) {
	Passenger p = new Passenger("Chandrakanth",23,"male",7736772220L);
	Travels t = new Travels("tvm","ekm","AC_SLEEPER",1400, p);
	Redbus r = new Redbus();
	r.BookTicket(t);
	System.out.println("--------------------------");
	r.DownloadTicket();
	System.out.println("--------------------------");
	r.CancelTicket();
}
}
