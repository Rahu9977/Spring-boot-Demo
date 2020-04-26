package com.example.bookservice;

import java.io.Serializable;

public class Book implements Serializable{

	private int id;
	private String name;
	private int price;

	public Book(int id, String name, int Book) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
