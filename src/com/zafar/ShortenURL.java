package com.zafar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ShortenURL {

	private HashMap<String, String> inflatedURL=new HashMap<String, String>();
	private HashMap<String, String> deflatedURL=new HashMap<String, String>();
	private URLTree masterTree=new URLTree(' ');
	private Random rand = new Random();
	public ShortenURL() {
		ArrayList<URLTree> trees= masterTree.getRoot().getNext();
		for (char i=Constants.startCharacter; i<=Constants.endCharacter; i++){
			trees.add(new URLTree(i));
		}
	}
	public String getDeflatedURL(String url){
		if(deflatedURL.get(url)!=null)
			return deflatedURL.get(url); 
		else
		{			
			//make new deflated URL
			 return masterTree.generateNewRandomURL();
		}
	}
	public String getInflatedURL(String shortenedURL){
		return inflatedURL.get(shortenedURL);
	}
}	
