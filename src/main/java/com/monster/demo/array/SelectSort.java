package com.monster.demo.array;

import java.util.Random;

/**
 * 
 * @description 选择排序
 * 核心思想：每一次排序都将最小值移到最前面
 * @author guokai
 * @date 2018年7月29日
 * @version v1.0
 */
public class SelectSort {
	
private static int[] array=new int[100];
	
	private static  void swap(Integer i,Integer j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static void selectSort(){
		
		int outSize=array.length-1;
		
		for(int i=0;i<outSize;i++) {
			for(int j=i+1;j<outSize+1;j++) {
				if(array[j]<array[i]) {
					swap(j,i);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		for(int i=0;i<100;i++) {
			array[i]=new Random().nextInt(1000);
		}
		
		for(int a : array) {
			System.out.print(a+",");
		}
		
		selectSort();
		System.out.println("---------------");
		
		for(int a : array) {
			System.out.print(a+",");
		}

		
		
	}

}
