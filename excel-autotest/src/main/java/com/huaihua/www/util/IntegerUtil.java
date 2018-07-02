package com.huaihua.www.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IntegerUtil {
	
	
	/**
	 * 冒泡排序
	 * @param arr
	 * @return
	 */
	public static int[] dubboSort(int[] arr) {
		for(int i =0;i < arr.length - 1;i++)
        {
            for(int j = 0;j <  arr.length - 1-i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
		return arr;
	}
	
	public static int[] remove(int[] arr,int i) {
		if(arr==null) {
			return null;
		}
		List<Integer> integers=new ArrayList<Integer>();
		for(int t =0;t < arr.length ;t++) {
			if(arr[t]!=i) {
				integers.add(arr[t]);
			}
		}
		int[] newArr=new int[integers.size()];
		for(int t =0;t < newArr.length ;t++) {
			newArr[t]=integers.get(t);
		}
		
		return newArr;
	}
	
	public static void main(String[] args) {
		int score[] = {75, 69, 75, 88};
		//score=dubboSort(score);
		score=remove(score,75);
		System.out.println(score);
	}
}
