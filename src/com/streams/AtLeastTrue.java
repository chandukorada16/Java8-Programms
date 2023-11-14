package com.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AtLeastTrue {

		
		public boolean containsDuplicate(int[] nums) {
			List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
			
			Set<Integer> set=new HashSet<>(list);
			if(set.size()==list.size()) {
				return false;
			}
			return true;
			
		}
		public static void main(String[] args) {
			int[] nums= {1,2,3,4};
			AtLeastTrue alt=new AtLeastTrue();
			System.out.println(alt.containsDuplicate(nums));
			
		}

	}


