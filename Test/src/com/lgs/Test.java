package com.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		 
		System.out.println("筛选列表: " + filtered);
		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(","));
		System.out.println("合并字符串: " + mergedString);
	}
	public List<String> buildArray(int[] target, int n) {
		List<String> list=new ArrayList<String>();
        for(int j=0;j<target.length;j++) {
        	if(target[j]==j+1) {
        		list.add("Push");
        	}else {
        		list.add("Push");
        		list.add("Pop");
        		j--;
        	}
        }
        return list;
    }

}
