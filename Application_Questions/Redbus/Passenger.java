package redbus;

public class Passenger {
private String name;//R
private int age;//R
private String gender;//R
private long cno;//R-M
public Passenger(String name,int age,String gender,long cno)
{
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.cno=cno;
}
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public String getGender()
{
	return gender;
}
public long getCno()
{
	return cno;
}
public void setCno(long cno)
{
	this.cno=cno;
}
}
