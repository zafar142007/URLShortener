package com.zafar;

import java.util.ArrayList;
import java.util.Random;

public class URLTree {

	private Random rand=new Random();
	private Node root;
	private StringBuffer deflatedUrl=new StringBuffer();
	public URLTree(char i) {
		root=new Node(i);
	}
	
	public String generateNewRandomURL() {
		deflatedUrl.setLength(0);
		generateRecursively(root);
		return deflatedUrl.toString();
	}

	private void generateRecursively(Node root1) {
		ArrayList<URLTree> trees=root1.getNext();
		if(trees!=null){
			if(trees.size()<Constants.repertoire)
				for(int j=0; j<trees.size();j++){
					if(trees.get(j)==null)
					{
						trees.add(new URLTree((char)(j+Constants.startCharacter)));
						deflatedUrl.append(j+Constants.startCharacter);
						generateRecursively(trees.get(j).root);
					}
				}
			else
			{
				int i=rand.nextInt(Constants.repertoire);
				
			}
		}
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}
	
}
