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
					String line=s.nextLine();
					System.out.println(line+" ===> "+shorten.getDeflatedURL(line));
				}
			}
			else if(args[0].equals("-console"))
			{	
				for(int i=1; i<args.length; i++)
					System.out.println(args[i]+" ===> "+shorten.getDeflatedURL(args[i]));
			}
		}
		else
			System.out.println("Usage:\njava LoadURLs -file <file> \njava LoadURLs -console <url1> <url2> ...\nSupports upto 493039 URLs currently, which can be extended.");
	}
	

}
