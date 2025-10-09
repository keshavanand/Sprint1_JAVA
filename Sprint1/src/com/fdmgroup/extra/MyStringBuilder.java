package com.fdmgroup.extra;

import java.util.Arrays;

public class MyStringBuilder {
	
	char[] array;
	int count;
	
	public MyStringBuilder(){
		array = new char[16];
		count = 0;
	}
	
	private boolean isEnoughSize(String str){
		if (str.length()>array.length || count + str.length()>array.length){
			return false;
		}
		return true;
	}
	
	public void append(String str){
		if (!isEnoughSize(str)){
			array = Arrays.copyOf(array, array.length*2);
		}
		for (char c: str.toCharArray()){
			array[count] = c;
			count++;
		}
	}
	
	public int length(){
		return count;
	}
	
	public char charAt(int index){
		if (index>count-1) return ' ';
		return array[index];
	}
	
	public void insert(int index,String str) throws Exception{
		// Throw exception if index out of range
		if (index > count || index < 0) throw new Exception("Index out of range");
		
		// check array size 
		if (!isEnoughSize(str)){
			array = Arrays.copyOf(array, array.length*2);
		}
		
		// if index is at end just append it
		if(index == count+1){
			this.append(str);
			return;
		}
						
		char[] stringToInsert = str.toCharArray();
		char [] arrayCopy = array;
		
		int start = index;
		
		// first insert the new string
		for (char c: stringToInsert){
			array[start] = c;
			start++;
		}
		
		// if index is at start just append the old array after adding string
		if (index == 0){
			this.append(arrayCopy.toString());
			//reset count
			this.count = arrayCopy.length + str.length();
			return;
		}
		
		// insert left part
		for (int i = 0; i<index; i++){
			array[i] = arrayCopy[i];
		}
		
		// insert right part
		for (int i = index; i<arrayCopy.length;i++){
			array[i+str.length()] = arrayCopy[i];
		}
		
		// reset count
		this.count = arrayCopy.length + str.length();
		return;
	}
	
	public String toString(){
		return new String(array,0,count);
	}
	
}
