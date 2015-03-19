package com.zafar;
import java.io.File;
import java.util.Scanner;


public class LoadURLs {

	public LoadURLs() {
	}

	public static void main(String[] args)  throws Exception{
		ShortenURL shorten=new ShortenURL();
		if(args.length>0)
		{
			if(args[0].equals("-file"))
			{
				Scanner s=new Scanner(new File(args[1]));
				while(s.hasNext()){
					System.out.println(shorten.getDeflatedURL(s.nextLine()));
				}
			}
			else if(args[0].equals("-console"))
			{	
				for(int i=1; i<args.length; i++)
					System.out.println(shorten.getDeflatedURL(args[i]));
			}
		}
		else
			System.out.println("Usage: -file <file> \n -console <url1> <url2> ...");
	}
	

}
