package codings;

import java.util.Scanner;

class TrieNode{
	int prefixCount;
	boolean isLeaf;
	TrieNode [] child;
	
	TrieNode(){
		this.prefixCount = 0;
		this.isLeaf = false;
		child = new TrieNode[26];
		
		for(int i=0;i<26;i++) {
			child[i] = null;
		}
	}
	
}

class Trie{
	TrieNode root;
	
	Trie(){
		this.root = new TrieNode();
	}
	
	public void insert(TrieNode node,String word) {
		TrieNode temp = node;
		temp.prefixCount++;
		
		for(int i=0;i<word.length();i++) {
			int loc = word.charAt(i)-'a';
			if(temp.child[loc]==null) {
				temp.child[loc] = new TrieNode();
			}
			temp.child[loc].prefixCount++;
			temp = temp.child[loc];
		}
		temp.isLeaf = true;
	}
	
	public boolean search(TrieNode node, String word) {
		TrieNode temp = node;
		for(int i=0;i<word.length();i++) {
			int loc = word.charAt(i) - 'a';
			if(temp.child[loc]==null) {
				return false;
			}
			temp = temp.child[loc];
		}
		if(temp.isLeaf == true) {
			return true;
		}
		
		return false;
	}
	
	public int countPrefix(TrieNode node,String prefix) {
		
		TrieNode temp = node;
		for(int i=0;i<prefix.length();i++) {
			int loc = prefix.charAt(i) - 'a';
			if(temp.child[loc] == null) {
				return 0;
			}
			temp = temp.child[loc];
		}
		
		return temp.prefixCount;

	}
	
	
	
}



public class TrieRunner {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Trie trie = new Trie();
		int n = scan.nextInt();
		
		for(int i=0;i<n;i++) {
			String s = scan.next();
			trie.insert(trie.root,s);
		}
		
		String prefix  = scan.next();
		int possiblePrefixes = trie.countPrefix(trie.root, prefix);
		
		System.out.println("Possible prefixes are "+ possiblePrefixes);
		
		if(trie.search(trie.root, prefix)) {
			System.out.println("Word exists in trie");
		}
		else {
			System.out.println("Word doesn't exists in trie");
		}
		
	}

}
