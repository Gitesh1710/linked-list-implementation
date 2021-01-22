package com.java.string.sortstringbasedonrepetitioninarray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CountStringRepsInArray {
	public void countStringRepsInArray(String[] arr) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String str: arr) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}else {
				map.put(str, 1);
			}			
		}
		System.out.println(map);
		
		List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>();
		for(Entry<String, Integer> entry: map.entrySet()) {
			entryList.add(entry);
		}

		Collections.sort(entryList, new SortHashMapBasedOnValueAndThenKey());
		System.out.println(entryList);
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"abc","bcc","cba","abc","def","abb","cba"};
		CountStringRepsInArray obj = new CountStringRepsInArray();
		obj.countStringRepsInArray(inputArray);
	}
}
