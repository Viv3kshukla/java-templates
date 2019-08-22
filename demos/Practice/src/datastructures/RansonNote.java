package datastructures;

import java.util.HashMap;
import java.util.Map;

public class RansonNote {
	public static boolean hasEnoughStrings(HashMap<String,Integer> magazineFreq,HashMap<String,Integer> noteFreq) {
		for(Map.Entry<String, Integer> entry : noteFreq.entrySet()) {
			String word = entry.getKey();
			if(!magazineFreq.containsKey(word) || magazineFreq.get(word) < entry.getValue()) {
				return false;
			}
		}
		return true;
	}
	 
	public static HashMap<String,Integer> getStringFrequency(String [] text){
		HashMap<String,Integer> frequencies = new HashMap<String,Integer>();
		
		for(String word : text) {
			if(!frequencies.containsKey(word)) {
				frequencies.put(word, 0);
			}
			else {
				frequencies.put(word, frequencies.get(word)+1);
			}
		}
		
		return frequencies;
		
	}
	
	public static boolean canBuildRansomNote(String [] magazine,String [] note) {
		HashMap<String,Integer> magazineFreq = getStringFrequency(magazine);
		HashMap<String,Integer> noteFreq = getStringFrequency(note);
		return hasEnoughStrings(magazineFreq,noteFreq);
	}

	public static void main(String args[]) {
		String [] magazine = {"hello","world","world"};
		String [] note = {"hello","world","world"};
		System.out.println(canBuildRansomNote(magazine,note));
	}
	
}
