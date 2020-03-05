package com.numbercombinations.services.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.numbercombinations.services.ICombinationsService;
@Service("combinationsService")
public class CombinationsServicesImpl implements ICombinationsService {

	@Override
	public List<String> getCombinations(String phoneNumber) {
		// TODO Auto-generated method stub
		return letterCombinations(phoneNumber);

	}
	
	public List<String> letterCombinations(String digits) {
		HashMap<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		map.put('0', "0");
		map.put('1', "1");
		List<String> l = new ArrayList<>();
		if (digits == null || digits.length() == 0) {
			return l;
		}
		l.add("");
		for (int i = 0; i < digits.length(); i++) {
			ArrayList<String> temp = new ArrayList<>();
			String option = map.get(digits.charAt(i));
			for (int j = 0; j < l.size(); j++) {
				for (int p = 0; p < option.length(); p++) {
					temp.add(new StringBuilder(l.get(j)).append(option.charAt(p)).toString());
				}
			}
			l.clear();
			l.addAll(temp);
		}
		return l;
	}

}
