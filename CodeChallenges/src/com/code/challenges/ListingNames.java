package com.code.challenges;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.sound.midi.Soundbank;

public class ListingNames {
	public static void listOfNames(List<String> list) {
		List<String> AbaseList = new ArrayList<String>();
		List<String> BbaseList = new ArrayList<String>();
		List<String> CbaseList = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).charAt(0) == 'A' && list.get(i).length() > 4) {
				AbaseList.add(list.get(i).toString());
			}
			else if (list.get(i).charAt(0) == 'B' && list.get(i).length() >= 3) {
				BbaseList.add(list.get(i).toString());
			}
			else if (list.get(i).charAt(0) == 'C' && list.get(i).length() >= 5) {
				CbaseList.add(list.get(i).toString());
			}
		}
		Collections.sort(AbaseList);
		Collections.sort(BbaseList);
		Collections.sort(CbaseList);
		
		System.out.println(AbaseList);
		System.out.println(BbaseList);
		System.out.println(CbaseList);
	}

}
