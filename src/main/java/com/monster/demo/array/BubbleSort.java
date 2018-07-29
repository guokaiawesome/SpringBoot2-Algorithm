package com.monster.demo.array;

import java.util.Random;


/**
 * 
 * @description 冒泡排序
 * 核心思想：每一次排序都将最大值移到最后
 * @author guokai
 * @date 2018年7月29日
 * @version v1.0
 */
public class BubbleSort {
	
	private static int[] array=new int[100];
	
	private static  void swap(Integer i,Integer j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static void bubbleSort(){
		
		int outSize=array.length-1;
		
		for(int i=outSize;i>1;i--) {
			for(int j=0;j<i;j++) {
				//比较前后两个值并交换
				if(array[j]>array[j+1]) {
					swap(j,j+1);
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
		
		bubbleSort();
		System.out.println("---------------");
		
		for(int a : array) {
			System.out.print(a+",");
		}

		
		
	}

}
