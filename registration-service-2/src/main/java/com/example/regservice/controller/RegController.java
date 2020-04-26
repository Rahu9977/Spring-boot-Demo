package com.example.regservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.regservice.dao.UserRepository;
import com.example.regservice.model.User;

@RestController
@CrossOrigin("*")
public class RegController {

	@Autowired
    private UserRepository repository;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@PostMapping("/register")
	public String register(@RequestBody User user) {
        repository.save(user);
        return "Hi " + user.getName() + " your Registration process successfully completed";
    }
	private static List<User> todos = new ArrayList<>();

	static {
	
		todos.add(new User(101,"wddwd","sfdsfs",233,"fgfgfd"));
		todos.add(new User(101,"wddwd","sfdsfs",233,"fgfgfd"));
		todos.add(new User(101,"wddwd","sfdsfs",233,"fgfgfd"));
	}
	  @GetMapping("/getAllUsers")
	  public List<User> findAllUsers() {
	        return repository.findAll();
	    
	    }

	    @GetMapping("/findUser/{email}")
	    public List<User> findUser(@PathVariable String email) {
	    	System.out.println("email" +email);
	    	System.out.println("repository.findByEmail(email)" +repository.findByEmail(email));
	        return repository.findByEmail(email);
	    }

	    @DeleteMapping("/cancel/{id}")
	    public List<User> cancelRegistration(@PathVariable int id) {
	        repository.deleteById(id);
	        return repository.findAll();
	    }
	
}
