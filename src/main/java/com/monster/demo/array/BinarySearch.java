package com.monster.demo.array;

import java.util.Arrays;

/**
 * 
 * @description 二分法查找
 * 前提必须是有序集合
 * @author guokai
 * @date 2018年7月27日
 * @version v1.0
 */
public class BinarySearch {
	
	private static int binarySearch(int[] a,int key) {
		int low=0;
		int high=a.length-1;
		
		while(low<=high) {
			//学习jdk源码  无符号友移
			//负数的无符号右移一定要注意
			int mid=(low+high) >>>1;
			int midValue=a[mid];
			
			if(midValue<key) {
				low=mid+1;
			}else if(midValue>key) {
				high=mid-1;
			}else {
				return mid;
			}
		}
		
		//没有找到，返回一个负值
		return -(low+1);
	}
	
	public static void main(String[] args) {
		
		int[] a= {0,1,2,3,4,5,6,7,8,9};
		
		int index=binarySearch(a, 9);
		if(index<0) {
			System.out.println("没有找到");
		}else {
			System.out.println("索引="+index);
		}
		
		
		
		
	}
	

}
