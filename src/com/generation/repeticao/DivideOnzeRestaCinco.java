package com.generation.repeticao;

public class DivideOnzeRestaCinco {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 1000; i < 2000; i++ ) {
			
			if(i % 11 == 5) {
				Thread.sleep(200);
				System.out.println(i);
			}
			
		}

	}

}
