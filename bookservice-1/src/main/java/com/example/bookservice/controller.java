package com.example.bookservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@CrossOrigin("http://localhost:4200")
	@GetMapping("/findAllBookss")
	public List<Book> getBooks() {

		System.out.println("DssD"+ Stream.of(new Book(101,"wddwd",233),
				new Book(102,"sssa",533),
				new Book(222,"ssd",323)).collect(Collectors.toList()));
		return Stream.of(new Book(101,"wddwd",233),
				new Book(102,"sssa",533),
				new Book(222,"ssd",323)).collect(Collectors.toList());
	}
	private static List<Book> todos = new ArrayList<>();

	static {
		todos.add(new Book(101,"wddwd",233));
		todos.add(new Book(102,"sssa",533));
		todos.add(new Book(222,"ssd",323));
	}

	@GetMapping("/")
	public List<Book> findAll() {
		System.out.println("DD"+todos);
		return todos;
	}
}
