package com.fdmgroup.comparisonsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args){
		Book book1 = new Book("Learn Java", 45678,19.99,500,4.3);
		Book book2 = new Book("Learn UNIX", 65432,17.5,650,3.9);
		Book book3 = new Book("Learn SQL", 87956,9.75,220,4.4);
		Book book4 = new Book("Learn Agile", 35367, 25.5,500,4.4);
		Book book5 = new Book("Learn React", 55676,28.75,490,4.8);
		Book book6 = new Book("Learn JavaScript",34343,14.99,300,4.4);
		Book book7 = new Book("Learn Python",65767,27.25,500,4.1);
		
		List<Book> books = new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
		books.add(book7);
		
		System.out.println("\n-------------Intial unsorted ----------------\n");
		printBooks(books);
		
		Collections.sort(books,new NumberOfPagesComparator());
		System.out.println("\n-------------Sorted as per number of pages in ascending order----------------\n");
		printBooks(books);
		
		Collections.sort(books,new NameComparator());
		System.out.println("\n-------------Sorted as per name in ascending order----------------\n");
		printBooks(books);
		
		Collections.sort(books,new PriceComparator());
		System.out.println("\n-------------Sorted as per Price in descending order----------------\n");
		printBooks(books);
		
		Collections.sort(books,new NoOfPagesAndIsbnComparator());
		System.out.println("\n-------------Sorted as per number of pages in ascending order and isbn descending ----------------\n");
		printBooks(books);
		
		Collections.sort(books,new RatingPriceComparator());
		System.out.println("\n-------------Sorted as per rating in desending and price in ascending order----------------\n");
		printBooks(books);
		
		//1.4 Using Comparators with a TreeSet
		Set<Book> bookSet = books.stream()
				.collect(Collectors.toCollection(()-> new TreeSet<>(new RatingPriceComparator())));

		System.out.println("\n-------------Tree set Sorted as per rating in desending and price in ascending order----------------\n");

		for(Book book: bookSet) {
			System.out.println(book);
		}
		
		//1.5 Using a built in Comparator
		PriorityQueue<Double> queue = getPriorityQueue(books.stream()
										.map(b->b.getPrice()).collect(Collectors.toList()));
		
		System.out.println(queue);
		
	}
	
	public static void printBooks(List<Book> books){
		for(Book book: books){
			System.out.println(book);
		}
	}
	
	public static PriorityQueue<Double> getPriorityQueue(List<Double> values){
		PriorityQueue<Double> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		priorityQueue.addAll(values);
		return priorityQueue;
	}
}
