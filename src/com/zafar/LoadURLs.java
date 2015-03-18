package com.zafar;
import java.security.MessageDigest;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;


public class LoadURLs {

	public LoadURLs() {
	}

	public static void main(String[] args)  throws Exception{
		byte b[]={12,3};
		
		String url="sadsadsad";
		MessageDigest md=MessageDigest.getInstance("SHA-1");
		byte[] by=md.digest();
		System.out.println(Base64.encode(by));
	}

}
