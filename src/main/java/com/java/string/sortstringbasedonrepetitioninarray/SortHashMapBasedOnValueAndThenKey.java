package com.java.string.sortstringbasedonrepetitioninarray;

import java.util.Comparator;
import java.util.Map.Entry;

public class SortHashMapBasedOnValueAndThenKey implements Comparator<Entry<String, Integer>>{

	public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
		//if e1 value equals e2 then compare keys
		if(e1.getValue()==e2.getValue()) {
			return e1.getKey().compareTo(e2.getKey());
		}else
		//Ascending order	
		return e1.getValue()-e2.getValue();
	}
	
}
