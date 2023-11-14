package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {

	public static void main(String[] args) {
		kadaiA();
		kadaiB();
		//kadaiC();
	}

	public static void kadaiA() {
		for (int i = 0; i < 10; i++) {
			System.out.println("現在 " + (i + 1) + " 回目のループです");
		}
	}

	public static void kadaiB() {

		Random random = new Random();

		int randomNumber = random.nextInt(100) + 1;

		System.out.println(randomNumber + "がでました: ");
	}
}
