package net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) {

		try {
			InetAddress address = InetAddress.getByName("www.baidu.com");
			System.out.println(address);
			System.out.println(address.getHostName());
			InetAddress address2 = InetAddress.getByName("61.135.169.125");
			System.out.println(address2);
			//如果没有连上Internet,返回localhost ip:127.0.0.1
			InetAddress me = InetAddress.getLocalHost();
			System.out.println(me);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
