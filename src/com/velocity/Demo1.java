package com.velocity;

public class Demo1 {
	public static void main(String[] args) {
		int a[] = {2,4,3,6,5,4,3,2,6};
		for (int i = 0;i<a.length;i++) {
			for(int j = i+1; j<a.length;j++) {
				
				if (a[i]==a[j]) {
					System.out.println(a[j]);
			}
			
			}
		}
		
		
	
}
	
}
	
