package com.zafar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ShortenURL {

	private HashMap<String, String> inflatedURL=new HashMap<String, String>();
	private HashMap<String, String> deflatedURL=new HashMap<String, String>();
	private HashMap<Integer, Integer> index=new HashMap<Integer, Integer>(); 
	private int counter=Constants.limit;
	private Random rand=new Random();

	public int getNextRandomIndex() throws Exception{
		if(counter==1)
			throw new Exception("Limit exceeded!");
		int key=rand.nextInt(counter);
		Integer ind=index.get(key);
		index.put(key, counter);
		counter--;
		if(ind==null)
		{
			return key;
		}
		else
		{
			return ind;
		}
	}
	public String translateIndexIntoShortenedURL(int ind){
		StringBuffer buffer=new StringBuffer();
		int j=0;
		for(int i=0; i<Constants.shortenedURLLength; i++)
		{
			j=(int) ((ind/(int)Math.pow(Constants.repertoire, i))%Constants.repertoire);
			if(j==0)
				buffer.append((char)Constants.endCharacter);
			else
				buffer.append((char)(Constants.startCharacter+j-1));
		}
		buffer=buffer.reverse();
		return buffer.toString();
	}
	public String getDeflatedURL(String url) throws Exception{
		String u=deflatedURL.get(url);
		if(u!=null)
			return u; 
		else
		{			
			int i=getNextRandomIndex();
			String deflated=translateIndexIntoShortenedURL(i);
			deflatedURL.put(url, deflated);
			inflatedURL.put(deflated, url);
			return deflated;				
		}
	}
	public String getInflatedURL(String shortenedURL){
		return inflatedURL.get(shortenedURL);
	}
}	
