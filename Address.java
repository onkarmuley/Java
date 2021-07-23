import java.net.*;
class Address
{
	public static void main(String args[])
	{
		String site="photolocation.000webhostapp.com";
		//String site="www.google.com";
		try
		{
			InetAddress ip = InetAddress.getByName(site);
			System.out.println(ip);
		}
		catch(UnknownHostException e)
		{
			e.printStackTrace();
		}
	}
}