package com.test;

import com.bean.Toy_Store;

public class Test {
	public static void main(String[] args) {
		try
		{
			Toy_Store ts=new Toy_Store("Toystore", "9007767313", "09:00", "21:00");
			System.out.println(ts.getToyStoreId());
			System.out.println(ts.getCity());
			System.out.println(ts.getPhoneNo());
			System.out.println(ts.getStoreOpeningTime());
			System.out.println(ts.getStoreClosingTime());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
