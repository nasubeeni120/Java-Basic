package dynamicPolymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal animal = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
	
		int  choice = sc.nextInt();
		for(int i=0; i<choice-2; i++) {
			animal.speak();				
		}
		if(choice > 5) {
			cat = new Cat();
			cat.speak();
		} else if (choice <5) {
			dog = new Dog();
			for(int i=0 ; i<3; i++) {
				dog.speak();				
			} 
		} 
		System.out.println("=================");
		Rabbit rabbit = new Rabbit();
		rabbit.hiRabbit();		
		System.out.println("=================");
		
		int[] rabbits = new int[3];
		for(int i=0; i<rabbits.length; i++) {
			int a = 1;
			rabbits[i] = i+a;
		}		
		System.out.println(Arrays.toString(rabbits));
		
		System.out.println("=================");
		int x = (int) Array.getInt(rabbits, 2);
		for(int i=0;  i<x; i ++ ) {
			rabbit.hiRabbit(); 
		}
		System.out.println("========ArrayList=========");
		ArrayList<Integer> rabbits2 = new ArrayList<Integer>(4);
		for(int i=0; i<5; i++) {
			rabbits2.add(i+1);
		}
		System.out.println(rabbits2);
		
		System.out.println("========LinkedList=========");
		LinkedList<Integer> rabbits3 = new LinkedList<Integer>();
		for(int i=0; i<5; i++) {
			rabbits3.add(100+i*11);
			if(rabbits3.get(i) % 2 == 0) {
				rabbit.hiRabbit();
			}else {
				System.out.println("This is even rabbit.");
			}
		}
	}
}