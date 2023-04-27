package main.java.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("nums = ");
		var numbers = Arrays.stream(br.readLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
		System.out.println("target = ");
		var target = Integer.parseInt(br.readLine());
		System.out.println(
				Arrays.toString(
						twoSum(numbers, target)
				)
		);
	}

	public static int[] twoSum(int[] nums, int target) {
		var hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hs.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (hs.get(target - nums[i]) != null && hs.get(target - nums[i]) != i)
				return new int[] {i, hs.get(target - nums[i])};
		}
		return null;
	}
}
